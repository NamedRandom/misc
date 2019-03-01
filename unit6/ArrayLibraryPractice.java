import java.util.Arrays;
import java.util.Scanner;

public class ArrayLibraryPractice {
  public static void main(String[] args){
    
      Scanner input = new Scanner(System.in);
      int[] someArray = {31,42,64,12,53};
      System.out.println("Original array: "+Arrays.toString(someArray));
      System.out.print("Enter an integer from 0 to "+(someArray.length-1)+": ");
      int storageVar = input.nextInt();
      someArray[storageVar] = -1;
      System.out.println("Replacing with -1: "+Arrays.toString(someArray));
      System.out.print("Enter replacement for first number: ");
      storageVar = input.nextInt();
      someArray[0] = storageVar;
      System.out.println("Replacing first: "+Arrays.toString(someArray));
      System.out.print("Enter replacement for last number: ");
      storageVar = input.nextInt();
      someArray[someArray.length-1] = storageVar;
      System.out.println("Replacing last: "+Arrays.toString(someArray));

      
  }
}
