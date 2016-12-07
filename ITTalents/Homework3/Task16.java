import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float[] arr = new float[10];
		for(int i = 0;i<arr.length;i++){
			System.out.println("Please enter element number[" + i + "]: ");
			arr[i] = input.nextFloat();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] <-0.231){
				arr[i] = (float)((i+1)*(i+1) + 41.25);
				continue;
			}
			arr[i] *= (float)(i+1);
		}	
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
				System.out.printf("%-10.2f", arr[i]);
		}
	}

}
