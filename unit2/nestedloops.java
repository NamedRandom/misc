//mert albayrak nestedloops lab 10-3-18
public class nestedloops {
  public static void main(String[] args) {
    for (int i=5;i >= 0;i--){
      for (int n=1;n <= 5;n+=1)
        System.out.print((n*n)+" ");
      System.out.println();
    }
    doubleBlank();
    for (int i=2;i <=8;i+=2) {
      for (int n = 1; n < 7; n++)
        System.out.print(i+" ");
      System.out.println();
    }
    doubleBlank();
    for (int i=1;i < 6;i++) {
      for (int n = 1; n < 6; n++)
        System.out.print((n*i)+" ");
      System.out.println();
    }
    doubleBlank();
    for (int i = 1; i < 6; i++) {
      for (int n = 1; n <= i;n++)
        System.out.print(n+" ");
      System.out.println();
    }
    doubleBlank();
    for (int i = 1; i < 7;i++) {
        for (int n = 1;n <= i;n++)
          System.out.print(i+" ");
      System.out.println();
    }
    doubleBlank();
    for (int i = 6; i > 0; i--) {
      for (int n = 1; n <= i;n++)
        System.out.print(n+" ");
      System.out.println();
    }
    doubleBlank();
    for (int i = 6; i > 0;i--) {
        for (int n = 1;n <= i;n++)
          System.out.print(i+"\\");
      System.out.println();
    }
    doubleBlank();
    for (int i = 10; i < 100;i+=10) {
        for (int n = 1;n <= 3;n++)
          System.out.print(i+" ");
      System.out.println();
    }
  }
  public static void doubleBlank() {
    for (int i=1;i < 3;i++)
    System.out.println();
  }
}
