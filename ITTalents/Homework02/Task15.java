import java.util.Scanner;

public class Task15 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int n;
		System.out.println("Enter n: ");
		n = input.nextInt();
		do{
			sum+=n;
			n--;
		}while(n!=0);
		System.out.println(sum);
		
	}

}
