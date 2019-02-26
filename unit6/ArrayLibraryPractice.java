public class ArrayLibraryPractice {
  public static void main(String[] args){
    int[] someArray = {31,42,64,12,53};
    printArray(someArray);
  }
  public static void printArray(int[] someArray){
      System.out.print("[");
      for(int i:someArray)
      System.out.print(i+",");
      System.out.println("]");
  }

}
