import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b;
		System.out.println("Please enter a value for a: ");
		a = input.nextInt();
		System.out.println("Please enter a value for b: ");
		b = input.nextInt();
		for(int i = (a<b?a:b);i<=(a<b?b:a);i++){
			System.out.println(i);
		}
	}

}
