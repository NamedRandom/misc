//mert albayrak grades lab
import java.util.Scanner;
public class grades {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter student name: ");
    String name = input.nextLine();
    System.out.println();
    int average=0;
    for (int i=1;i<=5;i++) {
      System.out.print("Enter grade #"+i+": ");
      average=input.nextInt()+average;
    }
    System.out.println(name+"'s average grade is'"+average/5.0);
  }
}
