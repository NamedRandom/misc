//mert albayrak quizpractice 11-26-18
public class quizpractice {
    public static double displacement(double velocity, double time, double acceleration){
        return=velocity*time+(1/2)*acceleration*Math.pow(time,2);
    }
    public static int remainder (int number){
        return=number%10;
    }
    public static String student (String last, String first, String sport, int studentID,  double GPA) {
        return=(first+" "+last+" id# "+studentID+"plays  "+sport+" and has a gpa of "+GPA);
    }
    public static double average (int a1, int a2, int a3, int a4, int a5) {
        //your code here
    }
public static String doIt (String action){
        //your code here
    }
public static String userName(String firstName, String lastName, int year){
//your code here
    }



    public static void main(String[] args) {

      System.out.println( “displacement of an object is “ + displacement(3.5, 12.3, 2.34)); // returns 220.0593

      System.out.println( “average of five integers is “ + average(23, 55, 14, 6, 88) );  // returns 37.2

System.out.println(“the last digit of  12345 is “ + remainder (12345));      // returns 5


System.out.println( student(“Rosen”, “Jake”, “basketball”, 12345,  2.78));
    // returns “Jake Rosen id# 12345 plays basketball and has a GPA of 2.78”

System.out.println( doIt(“sing”));
    // returns “SING!”

System.out.println (userName(“Jake”, “Rosen”, 2001));
// returns “J\Rosen\2001”
    }


      }
}
