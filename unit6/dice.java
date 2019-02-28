import java.util.Arrays;
import java.util.Random;

public class dice {
    public static void main(String[] args){
        
        Random rng = new Random();
        
        int[] counters = new int[13];
        
        while(counters[0]<1000){
         counters[1] = rng.nextInt(6)+rng.nextInt(6)+2;
         counters[counters[1]]++;
         counters[0]++;
        }
    System.out.println("Times Ran|Last Roll|2|3|4|5|6|7|8|9|10|11|12|\n\t"+Arrays.toString(counters));
   }
}
