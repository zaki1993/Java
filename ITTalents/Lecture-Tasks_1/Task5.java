import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		System.out.println("Enter a: ");
		a = input.nextInt();
		System.out.println(Integer.toBinaryString(a));
		int res = 0;
		int power = 1;
		while(a!=0){
			res*=power;
			res += a%2;
			power*=10;
			a/=2;
		}
	}

}
