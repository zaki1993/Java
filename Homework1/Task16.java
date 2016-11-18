package Homework;
import java.util.Scanner;

public class Task16 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int threeDigitNumber;
		System.out.println("Please enter a three digit number: ");
		threeDigitNumber = input.nextInt();
		if(threeDigitNumber%10 == (threeDigitNumber/10)%10  && ((threeDigitNumber/10)%10 == (threeDigitNumber/100))){
			System.out.println("a = b = c");
		}
		else if(threeDigitNumber%10 < (threeDigitNumber/10)%10  && ((threeDigitNumber/10)%10 < (threeDigitNumber/100))){
			System.out.println("a > b > c");
		}
		else if(threeDigitNumber%10 > (threeDigitNumber/10)%10  && ((threeDigitNumber/10)%10 > (threeDigitNumber/100))){
			System.out.println("a < b < c");
		}
		else{
			System.out.println("Nenaredeni!");
		}
	}
}
