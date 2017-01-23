import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,m;
		System.out.println("Enter n: ");
		n = input.nextInt();
		System.out.println("Enter m: ");
		m = input.nextInt();
		for(int i = (n>m?n:m);i>=(n>m?m:n);i--){
			if(i % 50 == 0){
				System.out.println(i);
			}
		}
	}

}
