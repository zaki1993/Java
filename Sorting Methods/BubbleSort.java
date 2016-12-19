import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {5,8,1,-4,6,10,88,-20,10,-500,101,0,1,1000};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void bubbleSort(int[] arr){
		int counter = 0;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			flag = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				counter++;
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}

			if(!flag){
				break;
			}
		}
		System.out.println(counter);
	}
}
