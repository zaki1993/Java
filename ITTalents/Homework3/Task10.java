import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		double sum = 0;
		int[] arr = new int[7];
		for(int i = 0;i<arr.length;i++){
			System.out.println("Please enter element number[" + i + "]: ");
			arr[i] = input.nextInt();
			sum += arr[i];
		}
		sum/=7;
		int epsilon = (int)Math.abs(sum - arr[0]);
		int number = arr[0];
		for(int i = 0;i<arr.length;i++){
			if(Math.abs(sum - arr[i]) < epsilon){
				epsilon = (int)Math.abs(sum - arr[i]);
				number = arr[i];
			}
		}
		System.out.println(number);
	}

}
