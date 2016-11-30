import java.util.Scanner;

public class Task1 {

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
		int min = arr[0];
		for(int i = 0;i<arr.length;i++){
			if(arr[i]%3 == 0){
				min = arr[i];
				break;
			}
		}
		
		for(int i = 0;i<arr.length;i++){
			if(arr[i]%3 == 0 && arr[i]<min){
				min = arr[i];
			}
		}
		System.out.println(min%3!=0?"No such element":min);
	}

}
