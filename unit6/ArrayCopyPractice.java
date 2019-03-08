import java.util.Arrays;
import java.util.Scanner;
public class ArrayCopyPractice {
    public static void main(String[] args){
        
        //step 1
        int[] intArray = {2,4,1,3,6,2,2,7,2,0};
        int[] copiedArray = Arrays.copyOf(intArray, intArray.length);
        System.out.println("Original array: "+Arrays.toString(intArray));
        System.out.println("Copied array: "+Arrays.toString(copiedArray)+"\n");

        //step 2
        Scanner input = new Scanner(System.in);
        System.out.print("Type 1 or 2 (Change index 0 to 100): ");
        int userChoice = input.nextInt();
        if(userChoice==1) intArray[0]=100;
        else copiedArray[0]=100;
        System.out.println("Changing first index of array "+userChoice);
        System.out.println("Original array (1): "+Arrays.toString(intArray));
        System.out.println("Copied array (2): "+Arrays.toString(copiedArray)+"\n");


        //step 3
        System.out.print("Type 1 or 2 (Sort array): ");
        userChoice = input.nextInt();
        if(userChoice==1) Arrays.sort(intArray);
        else Arrays.sort(copiedArray);
        System.out.println("Sorting array "+userChoice);
        System.out.println("Original array (1): "+Arrays.toString(intArray));
        System.out.println("Copied array (2): "+Arrays.toString(copiedArray)+"\n");

        //step 4
        System.out.print("Type 1 or 2 (Reference array): ");
        userChoice = input.nextInt();
        if(userChoice==1) copiedArray = intArray; 
        else intArray = copiedArray;
        System.out.println("Referencing array "+userChoice);
        System.out.println("Original array (1): "+Arrays.toString(intArray));
        System.out.println("Copied array (2): "+Arrays.toString(copiedArray)+"\n");

        //step 5
        System.out.print("Type 1 or 2 (Change index 0): ");
        userChoice = input.nextInt();
        intArray[0] = userChoice;
        System.out.println("Changed index 0 to "+userChoice);
        System.out.println("Original array (1): "+Arrays.toString(intArray));
        System.out.println("Copied array (2): "+Arrays.toString(copiedArray)+"\n");



    }
}
