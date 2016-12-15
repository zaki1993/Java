import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter n: ");
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter arr["+i+"]: ");
			arr[i] = sc.nextInt();
		}
		System.out.println(difference(arr, 0, arr[0], arr[0]));
	}
	public static int difference(int[] arr,int current,int max,int min){
		if(current == arr.length){
			return max - min;
		}
		if(min > arr[current]){
			return difference(arr,current+1,max,arr[current]);
		}
		if(max < arr[current]){
			return difference(arr, current + 1, arr[current], min);
		}
		return difference(arr, current + 1, max, min);
	}

}
