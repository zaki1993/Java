import java.util.Scanner;

public class Task17 {

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
		boolean isZigZag = true;
		for(int i = 1;i<arr.length-1;i++){
			if(i%2==0 && (!(arr[i]<arr[i-1] && arr[i]<arr[i+1]))){
				isZigZag = false;
				break;
			}
		}
		System.out.println(isZigZag?"Yes":"No");
	}

}
