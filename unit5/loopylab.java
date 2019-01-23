import java.util.Scanner;
public class loopylab { 
   public static void main (String[] args) {
      int c, lines;
      String delay;
      double sum, avg;
      char ch;
      Scanner input=new Scanner(System.in);
      //************************************************************
      System.out.println("\n Count to ten ");
      c = 1;
      while (c<=10)
      {
         System.out.print(c+" ");
         c = c+1;
      }
      System.out.println("\nContinue? Press any character and enter.");
      delay=input.next();
      //*************************************************************
      System.out.println("\nCount 'a' to 'z'" );
      ch = 'a';
      while (ch<='z') {
         System.out.print (ch);
         ch++;
      }
      System.out.println("\n\nContinue? Press any character and enter.");
      delay=input.next();
   //*****************************************************************
      System.out.println("\nCount backwards");
      c = 100;
      while(c>=1) {
         System.out.print (" "+c);
         c = c-1; //c--;
      }
      System.out.println();
      System.out.println("\nContinue? Press any character and enter.");
      delay=input.next();
   //*****************************************************************
      System.out.println("\nThe number of the even numbers from 0 to 40");
      int sumOfEven = 0;
      int i = 0;
      while (i < 40) {
         if (i%2 == 0) {
            sumOfEven = sumOfEven + i;
         }
         i = i + 1;
      }
      System.out.println(sumOfEven);
      System.out.println("\nContinue? Press any character and enter.");
      delay=input.next();
   //*****************************************************************
      System.out.println("\nSum and average ");
      sum = 0;
      avg = 0;
      c = 1;
      System.out.println("How many numbers?");
      int num = input.nextInt();
      while (c<=num) {
         System.out.print("enter a number: ");
         sum = sum + input.nextInt();
         c++;
      }
      System.out.println();
      avg = sum/num;
      System.out.println("The average is "+avg+".");
   }
}
