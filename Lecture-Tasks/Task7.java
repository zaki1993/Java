import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		short a,b,c;
		System.out.println("Enter a: ");
		a = input.nextShort();
		System.out.println("Enter b: ");
		b = input.nextShort();
		System.out.println("Enter c: ");
		c = input.nextShort();
		if(b >= 7 || c >= 7){
			System.out.println("Invalid input");
		}
		else{
			if(b == c){
				System.out.println(a + " : " + Integer.toBinaryString(a));
			}
			else{
				a^= (1 << b - 1);
				a^= (1 << c - 1);
				System.out.println(a + " : " + Integer.toBinaryString(a));
			}
		}
		
	}

}
