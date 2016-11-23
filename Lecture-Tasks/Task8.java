import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Please enter a value for n: ");
		n = input.nextInt();
		int spaces = n;
		for(int i = 1;i<=n*2;i+=2){
			for(int j = 0;j<spaces;j++){
				System.out.print(" ");
			}
			for(int j = 0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
			spaces--;
		}
		
	}

}
