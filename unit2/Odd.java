public class Odd{
  public static void main(String[] args) {
    int number=777;
    int hundreds=(number/100)%10;
    int tens=(number/10)%10;
    int ones=number%10;
    boolean onesAnswer=1==ones%2;
    boolean tensAnswer=1==tens%2;
    boolean hundredsAnswer=1==hundreds%2;
    boolean allAnswer=true==onesAnswer==tensAnswer==hundredsAnswer;
    System.out.println("The number is "+number);
    System.out.println("Ones digit is odd: "+onesAnswer);
    System.out.println("Tens digit is odd: "+tensAnswer);
    System.out.println("Hundreds digit is odd: "+hundredsAnswer);
    System.out.println("All digits are odd: "+allAnswer);
  }
}
