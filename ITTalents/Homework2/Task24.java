import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Enter n: ");
		n = input.nextInt();
		int reverse = 0 ;
		int copyN = n;
		do{
			reverse*=10;
			reverse+=copyN%10;
			copyN/=10;
		}while(copyN!=0);
		if(reverse == n){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not palindrome");
		}
		System.out.println(reverse);
	}

}
