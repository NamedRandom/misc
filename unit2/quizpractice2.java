//mert albayrak quiz practice
import java.util.Scanner;
  public class quizpractice2 {
    public static void main(String[] args) {
      Scanner input=new Scanner (System.in);
      System.out.print("Type Length of Rectangle: ");
      double length = input.nextDouble();
      System.out.print("Type Width of Rectangle: ");
      double width = input.nextDouble();
      System.out.println("The Perimeter is: "+((2*length)+(2*width)));
      System.out.println();
      System.out.println();
      System.out.print("Enter an integer: ");
      int someInteger=input.nextInt();
      System.out.println((someInteger/10)+"R"+(someInteger%10));
    }
}
