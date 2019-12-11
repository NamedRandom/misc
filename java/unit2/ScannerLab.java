//Mert Albayrak ScannerPractice Lab
//9-27-18
import java.util.*;
public class ScannerLab {
  public static void main(String[] args) {
    Scanner input=new Scanner (System.in); //create scanner
    System.out.print("x:");
    double x=input.nextDouble();
    System.out.print("y:");
    double y=input.nextDouble();
    System.out.print("z:");
    double z=input.nextDouble();
    System.out.println("("+x+", "+y+", "+z+")");
    System.out.println();
    System.out.println();
    System.out.print("hour:");
    int hour=input.nextInt();
    System.out.print("minute:");
    int minute=input.nextInt();
    System.out.print("second:");
    int second=input.nextInt();
    System.out.print("am or pm:");
    String ampm=input.next();
    System.out.println(hour+":"+minute+":"+second+" "+ampm);
  }
}
