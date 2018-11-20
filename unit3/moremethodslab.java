public class moremethodslab {
  public static void main(String[] args) {
printPowersOf2(3);
  }
  public static void printPowersOf2(int goTo){
    for (int i=0;i<=goTo;i++) {
      System.out.print((int)Math.pow(2,i)+" ");
    }
  }
}
