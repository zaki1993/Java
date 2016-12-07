import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		System.out.println("Please enter a value for a: ");
		a = input.nextInt();
		boolean prime = true;
		for(int i = 2;i<=Math.sqrt(a);i++){
			if(a % i == 0){
				prime = false;
				break;
			}
		}
		if(prime){
			System.out.println("Prime number");
		}
		else{
			System.out.println("Not prime number");
		}
		
	}

}
