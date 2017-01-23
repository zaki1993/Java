package Homework;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a,b;
		System.out.println("Please, enter a value for a: ");
		a = input.nextInt();
		System.out.println("Please, enter a value for b: ");
		b = input.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
}
