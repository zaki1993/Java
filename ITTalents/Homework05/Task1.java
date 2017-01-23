import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first, second;
		do{
			System.out.println("Enter first word: ");
			first = sc.next();
		}while(first.length()>40);
		
		do{
			System.out.println("Enter second word: ");
			second = sc.next();
		}while(second.length()>40);
		
		System.out.println(first.toUpperCase());
		System.out.println(first.toLowerCase());

		System.out.println(second.toUpperCase());
		System.out.println(second.toLowerCase());
		
	}

}
