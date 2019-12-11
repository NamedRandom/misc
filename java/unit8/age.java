import java.util.Scanner;
public class age{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("What is your age? ");
		int age = input.nextInt();

		if(age>=25) System.out.println("You can do pretty much anything");
		else if(age>=18) System.out.println("You can vote but not rent a car.");
		else if(age>=16) System.out.println("You can drive but not vote");
		else System.out.println("You can't drive.");
	}
}
