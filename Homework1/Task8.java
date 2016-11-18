package Homework;
import java.util.Scanner;

public class Task8 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int fourDigitNumber;
		System.out.println("Please enter a four digit number: ");
		fourDigitNumber = input.nextInt();
		int first = (fourDigitNumber/1000)*10 + (fourDigitNumber%10);
		int second = ((fourDigitNumber/100)%10)*10 + (fourDigitNumber/10)%10;
		if(first > second){
			System.out.println("The first is > than the second!");
		}
		else if(first == second){
			System.out.println("The first is equal to the second!");
		}
		else{
			System.out.println("The first is < than the second!");
		}
	}
}
