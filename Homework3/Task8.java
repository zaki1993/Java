import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int current = 1, previous = 1;
		int m;
		System.out.println("Enter the length of the array: ");
		m = input.nextInt();
		int[] arr = new int[m];
		int number = 0;
		for(int i = 0;i<arr.length;i++){
			System.out.println("Please enter element number[" + i + "]: ");
			arr[i] = input.nextInt();
		}
		for(int i = 1;i<arr.length;i++){
			if(arr[i] == arr[i-1]){
				current++;
				number = arr[i];
			}
			else{
				if(previous<current){
					previous = current;
				}
				current = 1;
			}
		}
		for(int i = 0 ;i<current;i++){
			System.out.print(number + " ");
		}
	}

}
