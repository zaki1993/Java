import java.util.Arrays;


public class quick_sort {
	public static void main(String[] args) {
		int[] arr = {9,4,1,-5,8,9,4,1,-5,8,9,4,1,-5,8,9,4,1,-5,8,9,4,1,-5,8,3};
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static int partition(int arr[], int left, int right)
	{	
	      int idxStart = left;
	      int tmp; //define swap variable
	      int pivot = arr[right]; //get the pivot element   
	      for (int i = left;i<right;i++) {
	    	  if(arr[i] <= pivot){
	    		  tmp = arr[i];
		    	  arr[i] = arr[idxStart];
		    	  arr[idxStart] = tmp;
		    	  idxStart++;
	    	  }
	      }
	      tmp = arr[right];
	      arr[right] = arr[idxStart];
	      arr[idxStart] = tmp;
	      
	      return idxStart; // we have swapped all the elements
	}

	public static void quickSort(int arr[], int left, int right) {
	      if(left >= right){
	      	    return;
	      }
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
