import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = 0;
		System.out.println("Enter the length of the array: ");
		m = input.nextInt();
		char[] arr = new char[m];
		
		for(int i = 0;i<arr.length;i++){
			System.out.println("Please enter element number[" + i + "]: ");
			arr[i] = input.next().charAt(0);
		}

		char ch = ' ';
		System.out.println("Enter character: ");
		ch = input.next().charAt(0);
		boolean contains = false;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == ch){
				index = i;
				contains = true;
				break;
			}
		}
		System.out.println(contains?"The index is: " + index:"Nope");
		
	}

}
