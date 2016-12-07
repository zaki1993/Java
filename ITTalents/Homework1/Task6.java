package Homework;
import java.util.Scanner;

public class Task6 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a1,a2,a3;
		System.out.print("Please, enter value for a1: ");
		a1 = input.nextInt();
		System.out.print("Please, enter value for a2: ");
		a2 = input.nextInt();
		System.out.print("Please, enter value for a3: ");
		a3 = input.nextInt();
		int temp;
		temp = a1;
		a1 = a2;
		a2 = a3;
		a3 = temp;
		System.out.println(a1 + " " + a2 + " " + a3);
	}
}
