//mert albayrak methodswithparameters lab 11-13-18
public class methodswithparameters {
  public static void main(String[] args) {
        lattice (1);
        System.out.println("\n");
        lattice (5);
        int inches = 114;
        int feet1 = 12;
        int feet2 = 32;
        int yards = 9;
        int feet3 = 12000;
        double miles = 7.5;
   System.out.println(inches + " inches in feet is " + inchesToFeet(inches));
   System.out.println(feet1 + " feet in inches is " + feetToInches(feet1));
   System.out.println(feet2 + " feet in yards is " + feetToYards(feet2));
   System.out.println(yards + " yards in feet is " + yardsToFeet(yards));
   System.out.println(feet3 + " feet in miles is " + feetToMiles(feet3));
   System.out.println(miles + " miles in feet is " + milesToFeet(miles));
   System.out.println("\n");
   String eq1=getLineEquation(5.2, 3.7);
   System.out.println(eq1);
   String eq2=getLineEquation(4.5, 3.1, 2.5);
   System.out.println(eq2);
   String eq3=getLineEquation(0, -2, 3, 4);
   System.out.println(eq3);
  }
  public static void lattice (int x) {
    for (int i=1;i<=x;i++)
      System.out.print("  *    *    *    *\n * *  * *  * *  * *\n*   **   **   **   *\n * *  * *  * *  * *\n  *    *    *    *\n");
  }
}
