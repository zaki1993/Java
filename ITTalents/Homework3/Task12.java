import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[7];
		for(int i = 0;i<arr.length;i++){
			System.out.println("Please enter element number[" + i + "]: ");
			arr[i] = input.nextInt();
		}
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		
		arr[2] = arr[2] + arr[3];
		arr[3] = arr[2] - arr[3];
		arr[2] = arr[2] - arr[3];
		
		arr[4] = arr[4] * arr[5];
		arr[5] = arr[4] / arr[5];
		arr[4] = arr[4] / arr[5];
		
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
