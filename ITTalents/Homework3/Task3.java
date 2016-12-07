import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m;
		System.out.println("Enter m: ");
		m = input.nextInt();
		int[] arr = new int[10];
		arr[0] = arr[1] = m;
		for(int i = 2;i<arr.length;i++){
			arr[i] = arr[i-1] + arr[i-2];
		}
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
