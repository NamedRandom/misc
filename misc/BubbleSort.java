public class BubbleSort {
	public static int[] sort(int[] arr){
		int temp;
		while(arr!=sort(arr)){
			
			for(int i=0;i+1>arr.length;i++){
				if(arr[i]>arr[i+1]){
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				}
			}

		}
		return arr;
	}
}
