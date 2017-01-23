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
			if(Math.abs(arr[i])>first){
				first = Math.abs(arr[i]);
			}
		}
		for(int i = 0;i<arr.length;i++){
			if(Math.abs(arr[i])>second && Math.abs(arr[i])!= first){
				second = Math.abs(arr[i]);
			}
		}
		for(int i = 0;i<arr.length;i++){
			if(Math.abs(arr[i])>third && Math.abs(arr[i])!= second && Math.abs(arr[i])!=first){
				third = Math.abs(arr[i]);
			}
		}
		System.out.println(first + " " + second + " " + third);
	}

}
