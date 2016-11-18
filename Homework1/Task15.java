package Homework;
import java.util.Scanner;

public class Task15 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number;
		System.out.println("Please enter a number between 0 and 24: ");
		number = input.nextInt();
		if(number >= 0 && number <=24){
			if((number > 18 && number <=24) || (number >= 0 && number <4)){
				System.out.println("Dobar vecher!");
			}
			else if(number>=4 && number <=9){
				System.out.println("Dobro utro!");
			}
			else{
				System.out.println("Dobar den!");
			}
		}
		else{
			System.out.println("Please enter a valid number between 0 and 24!");
		}
	}
}
