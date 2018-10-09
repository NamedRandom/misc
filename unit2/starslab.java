//mert albayrak starslab 10-04-18
public class starslab {
  public static void main(String[] args) {
    for (int i=1;i<5;i++)
    System.out.print("*");
    doubleBlank();
    for (int i=1;i<=4;i++){
      for (int n=1;n<=5;n++)
        System.out.print("*");
      System.out.println();
    }
    doubleBlank();
    fourBoxes();

    }
  public static void doubleBlank() {
    for (int i = 1; i < 3; i++)
    System.out.println();
  }
  public static void boxStar() {
    for (int i = 1; i < 6; i++) {
      for (Integer n = 0; n < 4; n++) {

      }
    }
  }
  public static void fourBoxes() {
    for (int i=1;i<5;i++){
      for (int n = 1; n < 4; n++){
        for (Integer x = 1; x < 6; x++)
          System.out.print("*");
          System.out.println();
        }
    System.out.println();
    }
  }
  public static void angledUpStar() {

  }
  public static void angledDownStar() {

  }
  public static void widerBoxStar() {

  }
}
