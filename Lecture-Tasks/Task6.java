import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		short a;
		System.out.println("Enter a: ");
		a = input.nextShort();
		int counter = 0;
		while(a != 0){
			if(a % 2 == 1){
				counter++;
			}
			a/=2;
		}
		System.out.println("The number has " + counter + " ones in it's bit representation");
	}

}
