public class BubbleSort {
	public static void bubbleSort(int ar[])
		{
   		for (int i = (ar.length - 1); i >= 0; i--)
  		{
      			for (int j = 1; j <= i; j++)
      			{
         			if (ar[j-1] > ar[j])
         			{
              				int temp = ar[j-1];
              				ar[j-1] = ar[j];
              				ar[j] = temp;
   } } } }
}
