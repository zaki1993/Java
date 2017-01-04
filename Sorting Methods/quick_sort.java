import java.util.Arrays;


public class quick_sort {
	public static void main(String[] args) {
		int[] arr = {9,4,1,-5,8,3,9,4,1,-5,8,3,9,4,1,-5,8,3,9,4,1,-5,8,3,9,4,1,-5,8,3};
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static int partition(int arr[], int left, int right)
	{
	      int tmp; //define swap variable
	      int pivot = arr[(left + right) / 2]; //get the pivot element   
	      while (left <= right) { //find the searched index
	            while (arr[left] < pivot)
	                  left++; //the value is at it's place increase the left index
	            while (arr[right] > pivot)
	                  right--; //the value is at it's place decrease the right index
	            // we found the most left index that is bigger than the pivot
	            // we found the most right index that is smaller than the pivot
	            // now we swap them
	            if (left <= right) {
	                  tmp = arr[left];
	                  arr[left] = arr[right];
	                  arr[right] = tmp;
	                  //increase the indexes and continue
	                  left++;
	                  right--;
	            }
	      };
	      return left; // we have swapped all the elements
	}

	public static void quickSort(int arr[], int left, int right) {
	      int index = partition(arr, left, right);
	      if (left < index - 1){
	    	  	//call quicksort for the left of the pivot
	            quickSort(arr, left, index - 1);
	      }
	      if (index < right){
	    	  	//call quicksort for the right of the pivot
	            quickSort(arr, index, right);
	      }
	}
}
