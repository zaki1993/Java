import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Please enter a value for n: ");
		n = input.nextInt();
		int printNum = n-1;
		for(int i = 1; i<=n;i++){
			for(int j = 1;j<=n;j++){
				System.out.print(printNum);
			}
			System.out.println();
			printNum+=2;
		}
	}

}
