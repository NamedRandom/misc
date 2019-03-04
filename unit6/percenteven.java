import java.util.*;

public class percenteven {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        
       System.out.print("How many numbers in the array?\t");
       int arrayLength = input.nextInt();
       int[] myArray = new int[arrayLength];
       int[] evenArray = new int[arrayLength];
       double even=0;
       boolean theresAZero=false;

       for(int i=0;i<myArray.length;i++){
           System.out.print("Enter an integer: ");
           myArray[i] = input.nextInt();
           if(myArray[i]%2==0) {
                evenArray[i]=myArray[i];
                even++;
                }
           if(myArray[i]==0) theresAZero=true;
       }
        Arrays.sort(evenArray);
       System.out.println("There were "+even/arrayLength*100+"% of even numbers.");
       System.out.println("Even values are: "+plsPrintArray(trimArray(evenArray,theresAZero)));
        
        }

    public static int[] trimArray(int[] input,boolean zero){
        int count=0;

        for(int i:input){
            if(i!=0) count++;
        }
        if(zero) count++;
        int[] output = new int[count];
        int index=0;
        for(int i:input){
            if(i!=0){
                output[index]=i;
                index++;
            }
        }
        return output;
    }
    public static String plsPrintArray(int[] input){
        String output="";
        for(int i : input){
            output+=i+", ";
        }
        return output.substring(0,output.length()-2);
    }

    }

