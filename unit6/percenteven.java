import java.util.*;

public class percenteven {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        
       System.out.print("How many numbers in the array?\t");
       int arrayLength = input.nextInt();
       int[] myArray = new int[arrayLength];
       int[] evenArray = new int[arrayLength];
       double even=0;

       for(int i:myArray){
           System.out.print("Enter an integer: ");
           myArray[i] = input.nextInt();
           if(myArray[i]%2==0) {
                evenArray[i]=myArray[i];
                even++;
                }
       }
        Arrays.sort(evenArray);
       System.out.println("There were "+even/arrayLength*100+"% of even numbers.");
       System.out.println("Even values are: "+Arrays.toString(evenArray));
        
        }
    }

