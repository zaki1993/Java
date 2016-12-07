import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m;
		System.out.println("Enter the length of the array: ");
		m = input.nextInt();
		double[] arr = new double[m];
		int len = 0;
		for(int i = 0;i<arr.length;i++){
			System.out.println("Please enter element number[" + i + "]: ");
			arr[i] = input.nextDouble();
			if(arr[i] >= -2.99 && arr[i]<=2.99){
				len++;
			}
		}
		double[] arr2 = new double[len];
		int index = 0;
		for(int i = 0;i<arr.length;i++){
			if(arr[i]>=-2.99 && arr[i]<=2.99){
				arr2[index++] = arr[i];
				System.out.print(arr2[index-1] + " ");
			}
		}
	}

}
