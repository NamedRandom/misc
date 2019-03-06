import java.util.*;

public class pizza {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        boolean iHit15 = false;

        String[] toppingsIn = new String[15];
        for(int i=0;i<toppingsIn.length;i++){
            String temp = "";
            System.out.print("Enter a topping (or type quit): ");
            temp = input.nextLine();
            if(temp.equals("quit")) break;
            toppingsIn[i]=temp;
            if(i==14) iHit15 = true;
        }
        if(iHit15) {
        System.out.println("No more toppings allowed.");
        printArrayList(toppingsIn);
        }
        else printArrayList(shrinkArray(toppingsIn));
    
    }

    public static void printArrayList(String[] input){
        Arrays.sort(input);
        int counter=1;
        for(String i:input){
            
            System.out.println(""+counter+". "+i);
            counter++;
        }
    }
    
    public static String[] shrinkArray(String[] input){
        
        int counter=0;
        int notNull=0;
        for(String i:input){
            if(i!=null) notNull++;
        }
        int[] nonNullList = new int[notNull];
        for(String i:input){
            if(i!=null) nonNullList[counter]=findIndexOfArray(input,i);
            counter++;
        }
        String[] output = new String[notNull];
        counter=0;
        for(int i:nonNullList){
            output[counter]=input[i];
            counter++;
        }
        return output;

    }
    
    public static int findIndexOfArray(String[] inputArray, String findMe){
        for (int i=0;i<inputArray.length;i++) {
            if(inputArray[i].equals(findMe)){
                return i;
            }
        }
        return -1;
    }

}
