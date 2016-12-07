package Homework;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a,b;
		System.out.println("Please, enter a value for a: ");
		a = input.nextInt();
		System.out.println("Please, enter a value for b: ");
		b = input.nextInt();
		if(a>b){
			System.out.println(a + " " + b);
		}
		else{
			System.out.println(b + " " + a);
		}
	}
}
