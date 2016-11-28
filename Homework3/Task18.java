import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m;
		System.out.println("Enter the length of the array 1: ");
		m = input.nextInt();
		int[] arr = new int[m];
		for(int i = 0;i<arr.length;i++){
			System.out.println("Please enter element number[" + i + "]: ");
			arr[i] = input.nextInt();
		}

		int m1;
		System.out.println("Enter the length of the array 2: ");
		m1 = input.nextInt();
		int[] arr1 = new int[m1];
		for(int i = 0;i<arr1.length;i++){
			System.out.println("Please enter element number[" + i + "]: ");
			arr1[i] = input.nextInt();
		}
		int[] arr3 = new int[m1<m?m1:m];
		for(int i = 0;i<(m1<m?m1:m);i++){
			if(arr[i]<=arr1[i]){
				arr3[i] = arr1[i];
				continue;
			}
			arr3[i] = arr[i];
		}	
		
		for(int i = 0;i<arr3.length;i++){
			System.out.print(arr3[i] + " ");
		}
	}

}
