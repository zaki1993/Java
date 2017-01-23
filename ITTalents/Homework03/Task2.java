import java.util.Scanner;

public class Task2 {

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
		if(m%2!=0){
			m--;
		}
		int[] arr2 = new int[m];
		for(int i = 0;i<arr.length/2;i++){
			arr2[i] = arr[i];
		}
		for(int j = arr.length/2 - 1;j>=0;j--){
			arr2[arr2.length - 1 - j] = arr[j];
		}
			
		for(int i = 0;i<arr2.length;i++){
			System.out.println(arr2[i]);
		}
	}

}
