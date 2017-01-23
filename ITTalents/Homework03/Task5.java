import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i = 0;i<arr.length;i++){
			arr[i] = i*3;
		}
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
