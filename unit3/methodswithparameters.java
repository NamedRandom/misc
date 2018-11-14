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
   String eq3=getLineEquation(3.1, 2.5, 7.6, 7);
   System.out.println(eq3);
  }
  public static void lattice (int x) {
    for (int i=1;i<=x;i++)
      System.out.print("  *    *    *    *\n * *  * *  * *  * *\n*   **   **   **   *\n * *  * *  * *  * *\n  *    *    *    *\n");
  }
  public static double inchesToFeet(double inches){
    return(inches/12);
  }
  public static double feetToInches(double feet){
    return(feet*12);
  }
  public static double feetToYards(double feet){
    return(feet*(1/3.0));
  }
  public static double yardsToFeet(double yards){
    return(yards*3);
  }
  public static double feetToMiles(double feet){
    return(feet/5280.0);
  }
  public static double milesToFeet(double miles){
    return(miles*5280);
  }
  public static String getLineEquation(double m,double b){
    return("y="+m+"x+"+b);
  }
  public static String getLineEquation(double m,double x1,double y1){
    return("y-"+y1+"="+m+"(x-"+x1+")");
  }
  public static String getLineEquation(double x1,double y1,double x2,double y2){
    double m=(y1-y2)/(x1-x2*1.0);
    return("y-"+y1+"="+m+"(x-"+x1+")");
  }
}
