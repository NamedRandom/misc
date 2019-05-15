import java.util.*;

public class arrayRanger{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[]{1,-6,2,6,3,1,5,9,5,2,12,4,5,23,64,23,3,5,7,9,22,-9};
        System.out.println("Array: "+Arrays.toString(arr)+"(size is "+arr.length+")");
        System.out.print("Choose a min: ");
        int min=input.nextInt();
        System.out.print("Choose a max: ");
        int max=input.nextInt();
        System.out.println("There are "+countInRange(arr,min,max)+" numbers between "+min+" and "+max);

    }
    public static int countInRange(int[] arr,int min,int max){
        int output=0;
        for(int i:arr)
            if(i>=min&&i<=max) output++;
        return output;
    }
}
