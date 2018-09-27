/*
Mert Albayrak ConvertTemperatures Bonus lab
9-27-18
*/
public class ConvertTemperatures {
  public static void main(String[] args) {
    double celsiusIn=24.5;
    double fahrenheitIn=68.4;
    System.out.println("Temperature 1 in Celsius: "+celsiusIn);
    System.out.println("Temperature 1 in Fahrenheit: "+(celsiusIn*9/5+32));
    System.out.println("Temperature 2 in Fahrenheit: "+fahrenheitIn);
    System.out.println("Temperature 2 in Celsius: "+((fahrenheitIn-32)*5/9));
  }
}
