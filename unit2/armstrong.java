//mert albayrak armstrong numbers bonus lab
public class armstrong {
  public static void main(String[] args) {
    System.out.println("Armstrong numbers:\n");
    for (int threeDigitIn = 111; threeDigitIn <= 999; threeDigitIn++) {
      int hundredsDigit = (threeDigitIn/100)%10;
      int tensDigit = (threeDigitIn/10)%10;
      int onesDigit = threeDigitIn%10;
      boolean cubesEqualToSum = (hundredsDigit*hundredsDigit*hundredsDigit)+(tensDigit*tensDigit*tensDigit)+(onesDigit*onesDigit*onesDigit)==threeDigitIn;
      for (;cubesEqualToSum==true;cubesEqualToSum=false)
        System.out.println(threeDigitIn);
    }
  }
}
