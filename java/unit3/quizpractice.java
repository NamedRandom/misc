//mert albayrak quizpractice 11-26-18
public class quizpractice {
    public static double displacement(double velocity, double time, double acceleration){
        return (velocity*time)+acceleration/2*Math.pow(time,2);
    }
    public static int remainder (int number){
        return number%10;
    }
    public static String student (String last, String first, String sport, int studentID,  double GPA) {
        return (first+" "+last+" id# "+studentID+" plays  "+sport+" and has a gpa of "+GPA);
    }
    public static double average (int a1, int a2, int a3, int a4, int a5) {
        return (a1+a2+a3+a4+a5)/5.0;
    }
    public static String doIt (String action){
        return action.toUpperCase()+"!";
    }
    public static String userName(String firstName, String lastName, int year){
        return (firstName.charAt(0)+"\\"+lastName+"\\"+year);
    }
    public static void main(String[] args)
    {
      System.out.println("displacement of an object is "+ displacement(3.5, 12.3, 2.34)); // returns 220.0593
      System.out.println("average of five integers is "+ average(23, 55, 14, 6, 88) );  // returns 37.2
      System.out.println("the last digit of 12345 is "+ remainder(12345));      // returns 5
      System.out.println( student("Rosen", "Jake", "basketball", 12345,  2.78));
      System.out.println( doIt("sing"));
      System.out.println (userName("Jake", "Rosen", 2001));
    }
}
