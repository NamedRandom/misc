import java.util.Arrays;
public class arrayUtils{
    //shrink array
     public static boolean[] shrinkArray(boolean[] arr){
         int counter=0;
         for(boolean b:arr)
             if(b) counter++;
         boolean[] arrOut = new boolean[counter];
         Arrays.fill(arrOut,true);
         return arrOut;
     } 


	//////////////////////////////////


}
