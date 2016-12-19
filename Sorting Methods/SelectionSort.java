import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {8,4,7,2,8,2,5,1,9,0,7};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void selectionSort(int[] arr){
		int minIndex = 0;
		int maxIndex = 0;
		int counter = 0;
		for (int i = 0; i < (arr.length/2); i++) {
			minIndex = i;
			maxIndex = i;
			for (int j = i; j < arr.length - i - 1; j++) {
				if(arr[j] <= arr[minIndex]){
					minIndex = j;
				}
				if(arr[j] >= arr[maxIndex]){
					maxIndex = j;
				}
				counter++;
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			
			if(i == maxIndex){
				maxIndex = minIndex;
			}
			
			int temp1 = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = arr[maxIndex];
			arr[maxIndex] = temp1;
		}
		System.out.println(counter);
	}
	
}
