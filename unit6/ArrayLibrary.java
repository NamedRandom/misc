import java.util.Arrays;
import java.util.Random;
public class ArrayLibrary {

    //reverse an array
    public static void reverse(int[] array) {
        int[] output = new int[array.length];
        int index=0;
        for(int i=array.length-1;i>=0;i--){
            output[index]=array[i];
            index++;
        }
      for(int i=0;i<output.length;i++)
            array[i]=output[i];
    
    }
    
    //shuffle an array
    public static void shuffle(int[] array) {
        Random rng = new Random();
        for(int i=0;i<array.length;i++){
           int swap;
           int indexToMoveTo = rng.nextInt(array.length);
           swap=array[indexToMoveTo];
           array[indexToMoveTo]=array[i];
           array[i]=swap;
        }
    }

    //create a new array of size parameter
    //filled with random numbers 1 - 20
    public static int[] create(int size) {
        Random rng = new Random();
        int[] output = new int[size];
        for(int i=0;i<size;i++){
            output[i]=rng.nextInt(20)+1;
        }
        return output;
    }

    //returns how many times the array contains the value
    public static int howManyOf(int[] array, int value) {
       //replace the line below with your code
       int counter=0;
       for (int i:array) {
            if(i==value){
                counter++;
            }
        }
        return counter;

    }
    
    //returns true if the array contains the value
    //returns false otherwise
    public static boolean contains(int[] array, int value) {
       //replace the line below with your code
       return (howManyOf(array,value)>0);
    }
    

    public static void main(String[] args) {
       //test the methods here
       int[] test1 = create(5);
       int[] test2 = create(15);
       int[] test3 = create(10);
       int howManyOfNum = 8;
       int containsVar1=3;
       int containsVar2=7;
       int createLength = 8;
        System.out.println("\nTesting reverse:\nOriginal: "+Arrays.toString(test1));
        reverse(test1);
        System.out.println("Reversed: "+Arrays.toString(test1)+"\n");
        System.out.println("Testing shuffle:\nOriginal: "+Arrays.toString(test1));
        shuffle(test1);
        System.out.println("Shuffled: "+Arrays.toString(test1)+"\n");
        System.out.println("Testing create:\n"+Arrays.toString(create(createLength))+"\n");
        System.out.println("Testing howManyOf:\nArray: "+Arrays.toString(test2)+"\nhowManyOf "+howManyOfNum+": "+howManyOf(test2,howManyOfNum)+"\n");
        System.out.println("Testing contains:\nArray: "+Arrays.toString(test3)+"\ncontains "+containsVar1+": "+contains(test3,containsVar1)+"\ncontains "+containsVar2+": "+contains(test3,containsVar2));
       
    }
    
}
