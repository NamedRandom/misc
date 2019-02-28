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
    for(int i=0;i<11;i++){
        System.out.print(""+(i+2)+":");
        for(int j=0;j<counters[i+2];j++) System.out.print("=");
    System.out.println();
    }

    }
}
