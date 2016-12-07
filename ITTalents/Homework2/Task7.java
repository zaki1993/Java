import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Please enter a value for n: ");
		n = input.nextInt();
		for(int i = 3;i<=3*n;i+=3){
			System.out.println(i);
		}

	}

}
