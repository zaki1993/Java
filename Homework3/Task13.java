import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Please enter a number: ");
		num = input.nextInt();
		int len = 0, copy = num;
		while(copy != 0){
			copy/=2;
			len++;
		}
		int[] arr = new int[len];
		while(num!=0){
			arr[arr.length - 1 - (len - 1)] = num%2;
			num/=2;
			len--;
		}
		for(int i = arr.length-1;i>=0;i--){
			System.out.print(arr[i]);
		}
	}

}
