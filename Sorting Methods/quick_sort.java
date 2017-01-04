import java.util.Arrays;

public class quick_sort {
	public static void main(String[] args) {
		int[] arr = {9,4,1,-5,8,3};
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static int partition(int arr[], int left, int right)
	{
	      int tmp;
	      int pivot = arr[(left + right) / 2];	     
	      while (left <= right) {
	            while (arr[left] < pivot)
	                  left++;
	            while (arr[right] > pivot)
	                  right--;
	            if (left <= right) {
	                  tmp = arr[left];
	                  arr[left] = arr[right];
	                  arr[right] = tmp;
	                  left++;
	                  right--;
	            }
	      };
	      return left;
	}

	public static void quickSort(int arr[], int left, int right) {
	      int index = partition(arr, left, right);
	      if (left < index - 1){
	            quickSort(arr, left, index - 1);
	      }
	      if (index < right){
	            quickSort(arr, index, right);
	      }
	}
}
