public class moremethodslab {
  public static void main(String[] args) {
    printPowersOf2(3);
    printPowersOf2(10);
    System.out.println("\n\n");
    printWordNumTimes("Print this 5 times",5);
    System.out.println("\n\n");

  }
  public static void printPowersOf2(int goTo){
    for (int i=0;i<=goTo;i++)
      System.out.print((int)Math.pow(2,i)+" ");
    System.out.println();
  }
  public static void printWordNumTimes(String word,int reps) {
    for(int i=0;i < reps;i++)
      System.out.println(word);
  }
  public static void sumab(int a,int b){

  }
}
