import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[7];
		for(int i = 0;i<arr.length;i++){
			System.out.println("Please enter element number[" + i + "]: ");
			arr[i] = input.nextInt();
		}
		for(int i = 0;i<arr.length;i++){
			if(arr[i]%5 == 0 && arr[i]>5){
				System.out.println(arr[i]);
			}
		}
	}

}
