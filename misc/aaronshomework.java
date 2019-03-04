import java.util.Scanner;

public class aaronshomework {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	
    System.out.print("Enter binary number: ");
    String binaryString = input.nextLine();
    String firstDigit=String.valueOf(binaryString.charAt(0));
    String secondDigit=String.valueOf(binaryString.charAt(1));
    String thirdDigit=String.valueOf(binaryString.charAt(2));
    String fourthDigit=String.valueOf(binaryString.charAt(3));
    int firstInt=Integer.parseInt(firstDigit);
    int secondInt=Integer.parseInt(secondDigit);
    int thirdInt=Integer.parseInt(thirdDigit);
    int fourthInt=Integer.parseInt(fourthDigit);
    int result=8*firstInt+4*secondInt+2*thirdInt+fourthInt;
    System.out.println(""+binaryString+" converted is "+result);
    }
}
