package Homework;
import java.util.Scanner;

public class Task9 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a,b;
		System.out.println("Please, enter a value for a: ");
		a = input.nextInt();
		System.out.println("Please, enter a value for b: ");
		b = input.nextInt();
		if(a>=10 && a<=99 && b>=10 && b <= 99){
			if(((a*b)%10) % 2 == 0){
				System.out.println(((a*b)%10) + " is even!");
			}
			else{
				System.out.println(((a*b)%10) + " is not even!");
			}
		}
		else{
			System.out.println("Enter two digit numbers, please!");
		}
	}
}
