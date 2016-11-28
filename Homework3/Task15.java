import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m;
		System.out.println("Enter the length of the array: ");
		m = input.nextInt();
		double[] arr = new double[m];
		for(int i = 0;i<arr.length;i++){
			System.out.println("Please enter element number[" + i + "]: ");
			arr[i] = input.nextDouble();
		}
		double first = 0, second = 0, third = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>first){
				first = arr[i];
			}
		}
		for(int i = 0;i<arr.length;i++){
			if(arr[i]>second && arr[i]!= first){
				second = arr[i];
			}
		}
		for(int i = 0;i<arr.length;i++){
			if(arr[i]>third && arr[i]!= second && arr[i]!=first){
				third = arr[i];
			}
		}
		System.out.println(first + " " + second + " " + third);
	}

}
