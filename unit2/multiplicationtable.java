//mert albayrak multiplicationtable lab
public class multiplicationtable {
    public static void main(String[] args) {
      for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 6; j++)
          System.out.print("("+i+","+j+")\t");
        System.out.println();
        }
      System.out.println("\n\n");
      System.out.println("x | 1\t2\t3\t4\t5\t6\t7\t8\t9\t");
      System.out.println("==+===============================================================");
      for (int i = 1; i < 13; i++) {
        System.out.print(i+" | ");
        for (int k=1;k<10;k++)
          System.out.print(k*i+"\t");
        System.out.println();
      }
      System.out.println("\n\n");
      for (int i=1;i<10;i++)
          for (int k=0;k<10;k++)
            System.out.print(""+i+k+", "+i+"+"+k+" = "+(i+k)+"\n");
    }
}
