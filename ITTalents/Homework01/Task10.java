package Homework;
import java.util.Scanner;

public class Task10 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int cubic;
		System.out.println("Please, enter the amount of water: ");
		cubic = input.nextInt();
		//Tui kato pulnim ednovremenno s 2 i 3 litrovi kofi 2 + 3 = 5
		int getReminder = cubic%5;
		int getAmount = cubic/5;
		if(getReminder % 2 == 0){
			System.out.println(getAmount + " po 2 litra");
			System.out.println(getAmount + " po 3 litra");
			System.out.println(getReminder/2 + " dopulnitelno po 2 litra");
		}
		else if(getReminder % 3 == 0){
			System.out.println(getAmount + " po 2 litra");
			System.out.println(getAmount + " po 3 litra");
			System.out.println(getReminder/3 + " dopulnitelno po 3 litra");
		}
		else{
			System.out.println((getAmount - 1) + " po 2 litra");
			System.out.println((getAmount + 1) + " po 3 litra");
		}
	}
}

