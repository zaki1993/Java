import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char symbol;
		System.out.println("Enter a symbol");
		symbol = input.next().charAt(0);
		int b;
		System.out.println("Enter side: ");
		b = input.nextInt();
		for(int i = 0;i<b;i++){
			if(i == 0 || i == b - 1){
				for(int j = 0;j<b;j++){
					System.out.print("* ");
				}
			}
			if(i != 0 && i != b - 1){
				System.out.print("* ");
				for(int j = 2;j<b;j++){
					System.out.print(symbol + " ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
