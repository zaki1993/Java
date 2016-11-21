import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Please enter a value for n: ");
		n = input.nextInt();
		int spaces = n/2;
		for(int i = 1;i<=n;i+=2){
			for(int j = 0;j<spaces;j++){
				System.out.print(" ");
			}
			for(int j = 0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
			spaces--;
		}
		System.out.println();
		for(int i = 1;i<=n;i+=2){
			for(int j = 0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
