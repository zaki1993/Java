import java.util.Arrays;

public class Count_sort {

	public static void main(String[] args) {
		int[] arr = {8,4,7,2,-3,8,2,5,1,9,0,7};
		int[] arr1 = countingSort(arr);
		System.out.println(Arrays.toString(arr1));
	}
	
	public static int[] countingSort(int[] arr){
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max){
				max = arr[i]; 
			}
			if(arr[i] < min){
				min = arr[i];
			}
		}
		int holder[] = new int[max - min + 1];
		int result[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			holder[arr[i] - min] += 1; 
		}
		for (int i = 1; i < holder.length; i++) {
			holder[i] +=holder[i-1];
		}
		for (int i = 0; i < arr.length; i++) {
			holder[arr[i] - min]--; 
			int position = holder[arr[i] - min]; 
			result[position] = arr[i];
		}
		return result;
	}

}
