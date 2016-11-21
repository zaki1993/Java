import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b;
		System.out.println("Enter a: ");
		a = input.nextInt();
		System.out.println("Enter b: ");
		b = input.nextInt();
		for(int i = 1;i<=a;i++){
			for(int j = 1;j<=b;j++){
				System.out.print(i + "*" + j + " = " + i*j + " ");
			}
			System.out.println();
		}
	}

}
