import java.util.Scanner;
public class genderlab {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int age,married,gender;
    String first,last;
    System.out.print("Are you male (0) or female (1)?   ");
    gender = input.nextInt();
    System.out.print("First name: ");
    first = input.next();
    System.out.print("Last name: ");
    last = input.next();
    System.out.print("Age: ");
    age = input.nextInt();
    if(age>20&&gender==1){
      System.out.print("Are you married? (0=No 1=Yes) ");
      married = input.nextInt();
      if(married==1) System.out.println("Then I shall call you Mrs. "+last);
      else {
        System.out.println("Then I shall call you Ms. "+last);
    }
      return;
    }
    if(age>20&&gender!=1) System.out.println("Then I shall call you Mr. "+last);
    else System.out.println("Then I shall call you "+first+" "+last+".");
  }
}
