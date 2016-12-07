import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Enter n: ");
		n = input.nextInt();
		int product = 1;
		do{
			product *= n;
			n--;
		}while(n!=0);
		System.out.println(product);
	}

}
