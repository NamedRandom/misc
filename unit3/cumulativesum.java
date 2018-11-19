//mert albayrak cumulativesum lab 11-19-18
import java.util.Scanner;
public class cumulativesum {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int balance=0;
    for (int i=1;i<=10;i++) {
      System.out.print("Week "+i+": ");
      balance=input.nextInt()+balance;
    }
    System.out.println(balance/10.0+" dollars saved on average");
    System.out.println("Total balance after week 10: "+balance);                                                                          
  }
}
