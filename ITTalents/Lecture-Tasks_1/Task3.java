import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b;
		System.out.println("Enter a: ");
		a = input.nextInt();
		System.out.println("Enter b: ");
		b = input.nextInt();
		if(a > b){
			a = a + b;
			b = a - b;
			a = a - b;
		}
		for(int i = a;i <= b;i++){
			System.out.print(i + " ");
		}
	}

}
