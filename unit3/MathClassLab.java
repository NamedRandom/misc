//mert albayrak MathClassLab 11/9/2018
import java.util.Scanner;
public class MathClassLab {
  public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    System.out.print("how high should the chart go?:\t");
    int integerIn=input.nextInt();
    System.out.println("\n\n");
    System.out.println("number\tsquare\tsquare root     cube    cube root");
    System.out.println("=======================================================");
    for (int i=1; i <= integerIn; i++)
    System.out.print(""+i+"\t"+(int)Math.pow(i, 2)+"\t"+round(Math.pow(i,1/2.0))+"\t\t"+(int)Math.pow(i,3)+"\t"+round(Math.pow(i,1/3.0))+"\n");
    input.close();
  }
  public static double round(double numberIn) {
    return Math.round(numberIn*100)/100.0;
  }
}
