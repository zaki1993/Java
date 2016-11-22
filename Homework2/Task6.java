import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		System.out.println("Please enter a value for a: ");
		a = input.nextInt();
		long sum = 0;
		for(long i = 1;i<=a;i++){
			sum+=i;
		}
		System.out.println(sum);
	}

}
