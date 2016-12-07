import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		System.out.println("Enter a: ");
		a = input.nextInt();
		boolean prime = true;
		for(int i = 2;i<= Math.sqrt(a); i++){
			if(a % i == 0){
				prime = false;
				break;
			}
		}
		if(prime){
			System.out.println("The number is prime");
		}
		else{
			System.out.println("The number is not prime");
		}
	}

}
