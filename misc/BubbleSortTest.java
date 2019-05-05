import java.util.Arrays;

public class BubbleSortTest{
	public static void main(String[] args){
	int[] arr = new int[]{1,5,34,2,3,5,68,1,2,12,4};
	System.out.println(Arrays.toString(arr));
	arr = BubbleSort.sort(arr);	
	System.out.println(Arrays.toString(arr));
	}
}
