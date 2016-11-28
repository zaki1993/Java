import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m,n;
		System.out.println("Enter the length of the array 1: ");
		m = input.nextInt();
		int[] arr = new int[m];
		for(int i = 0;i<arr.length;i++){
			System.out.println("Please enter element number[" + i + "]: ");
			arr[i] = input.nextInt();
		}
		
		System.out.println("Enter the length of the array 2: ");
		n = input.nextInt();
		int[] arr2 = new int[n];
		for(int i = 0;i<arr2.length;i++){
			System.out.println("Please enter element number[" + i + "]: ");
			arr2[i] = input.nextInt();
		}
		
		boolean equal = true;
		if(arr.length != arr2.length){
			equal = false;
		}
		if(equal){
			for(int i = 0;i<arr.length;i++){
				if(arr[i] != arr2[i]){
					equal = false;
					break;
				}
			}
			System.out.println("They are " + (equal?"equal":"not equal"));
		}
		else{
			System.out.println("They are not equal");
		}
		
	}	

}
