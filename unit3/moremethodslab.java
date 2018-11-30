public class moremethodslab {
  public static void main(String[] args) {
    printPowersOf2(3);
    printPowersOf2(10);
    System.out.print("\n\n");
    printWordNumTimes("Print this 5 times",5);
    System.out.print("\n\n");
    System.out.println(sumab(1,10));
    System.out.print("\n\n");
    System.out.println(doubleIt(5));
    System.out.print("\n\n");
    printNumbers(15);
    printNumbers(5);
    printNumbers();
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
  public static int sumab(int a,int b){
    int output=b;
    for(int i=a;i<b;i++)
      output+=i;
    return output;
  }
  public static int doubleIt(int a){
    return a*2;
  }
  public static void printNumbers(int a){
    for(int i=1;i<=a;i++)
      System.out.print("["+i+"] ");
      System.out.print("\n");
  }
  public static void printNumbers(){
    for(int i=1;i<=10;i++)
      System.out.print("["+i+"] ");
      System.out.print("\n");
  }
}
