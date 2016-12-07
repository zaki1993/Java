import java.util.Scanner;

public class Task4 {

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
		boolean mirror = true;
		for(int i = 0;i<arr.length/2;i++){
			if(arr[i] != arr[arr.length-i - 1]){
				mirror = false;
				break;
			}
		}
		System.out.println("The array is " + (mirror?"mirrored":"not mirrored"));
		
	}

}
