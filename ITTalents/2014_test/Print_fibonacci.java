import java.util.Scanner;

public class Print_fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long first = 0, second = 1;
		long next = 0, sum = 0;
		int n ;
		System.out.println("Enter n: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(first);
			sum +=second;
			next = first + second;
			first = second;
			second = next;
		}
		System.out.println("The sum is: " + sum);
	}	
	
}
