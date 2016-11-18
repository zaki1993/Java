package Homework;
import java.util.Scanner;

public class Task11 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int threeDigitNumber;
		System.out.println("Please enter a valid three digit number without zeros in it: ");
		threeDigitNumber = input.nextInt();
		if(threeDigitNumber%10 == 0 || (threeDigitNumber/10)%10 == 0 || (threeDigitNumber/100 == 0)){
			System.out.println("Please enter a valid 3 digit number!");
		}
		else{
			if(((threeDigitNumber % (threeDigitNumber%10)) != 0) || ((threeDigitNumber % ((threeDigitNumber/10)%10)) != 0) || ((threeDigitNumber % (threeDigitNumber/100)) != 0)){
				System.out.println("The number cannot be devided by all his digits!");
			}
			else{
				System.out.println("The number can be devided by all his digits!");
			}
		}
	}
}