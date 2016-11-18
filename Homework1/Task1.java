package Homework;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double a,b,c;
		System.out.println("Please, enter a value for a: ");
		a = input.nextDouble();
		System.out.println("Please, enter a value for b: ");
		b = input.nextDouble();
		System.out.println("Please, enter a value for c: ");
		c = input.nextDouble();
		if(c > a && c < b){
			System.out.println("The number c is between a and b!");
		}
		else{
			System.out.println("The number c is not between a and b!");
		}
	}
}
