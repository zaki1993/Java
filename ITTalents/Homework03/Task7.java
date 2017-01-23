import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m;
		System.out.println("Enter the length of the array: ");
		m = input.nextInt();
		int[] arr = new int[m];
		for(int i = 0;i<arr.length;i++){
			System.out.println("Please enter element number[" + i + "]: ");
			arr[i] = input.nextInt();
		}
		int[] arr2 = new int[m];
		arr2[0] = arr[0];
		arr2[arr2.length - 1] = arr[arr.length - 1];
		for(int i = 1;i<arr.length - 1;i++){
			arr2[i] = arr[i - 1] + arr[i + 1];
		}
		for(int i = 0;i<arr2.length;i++){
			System.out.println(arr2[i]);
		}
	}

}
