import java.util.Arrays;

public class quick_sort {
	public static void main(String[] args) {
		int[] arr = {9,4,1,-5,8,3};
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static int findIndex(int arr[], int left, int right)
	{
	      int i = left, j = right;
	      int tmp;
	      int pivot = arr[(left + right) / 2];	     
	      while (i <= j) {
	            while (arr[i] < pivot)
	                  i++;
	            while (arr[j] > pivot)
	                  j--;
	            if (i <= j) {
	                  tmp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = tmp;
	                  i++;
	                  j--;
	            }
	      };
	      return i;
	}

	public static void quickSort(int arr[], int left, int right) {
	      int index = findIndex(arr, left, right);
	      if (left < index - 1){
	            quickSort(arr, left, index - 1);
	      }
	      if (index < right){
	            quickSort(arr, index, right);
	      }
	}
}
