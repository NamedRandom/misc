//mert albayrak starslab 10-04-18
public class starslab {
  public static void main(String[] args) {
    for (int i=1;i<=5;i++)
    System.out.print("*");
    doubleBlank();
    for (int i=1;i<=4;i++){
      for (int n=1;n<=5;n++)
        System.out.print("*");
      System.out.println();
    }
    doubleBlank();
    fourBoxes();
    bigStar();
    doubleBlank();
    angledUpStar();
    doubleBlank();
    angledDownStar();
    doubleBlank();
    angledToRightStar();
    doubleBlank();
    triangleStar();

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
  public static void bigStar() {
    for (int i=1;i<=5;i++){
      for (int n=1;n<=11;n++)
        System.out.print("*");
      System.out.println();
    }
  }
  public static void angledUpStar() {
    for (int i=1;i<=7;i++){
      for (int n=1;n<=i;n++)
        System.out.print("*");
      System.out.println();
    }
  }
  public static void angledDownStar() {
    for (int i=1;i<=7;i++){
      for (int n=7;n>=i;n--)
        System.out.print("*");
      System.out.println();
    }
  }
  public static void angledToRightStar() {
    for (int i=1;i<=7;i++){
      for (int n=6;n>=i;n--){
        System.out.print(" ");
      }
      for (int n=1;n<=i;n++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void triangleStar() {
    for (int i=1;i<=13;i+=2){
      for (int n=13;n>=i;n-=2){
        System.out.print(" ");
      }
      for (int n=1;n<=i;n++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
