package Homework;
import java.util.Scanner;

public class Binary {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int x = 3;
		int y = 7;
		
		//sums two numbers
		int sum = (x ^ y) + 2 * (x & y);
		
		//subtract two numbers
		int subtract = ~y - ~x;
		
		//checks the fifth bit
		int fifthBit = (y >> 5) % 2;
		
		//checks the number of ones in the number
		int number = 3;
		int numberOfOnes = 32 - Integer.numberOfLeadingZeros(number); // 32 is the size of the int
		
		//checks the general zeros and ones in 2 numbers
		int number1 = 3;
		int number2 = 5;
		int generalNumbers = 32 - Integer.numberOfLeadingZeros(number1 & number2);
		
		System.out.println(sum);
		System.out.println(subtract);
		System.out.println(fifthBit);
		System.out.println(numberOfOnes);
		System.out.println(generalNumbers);
		System.out.println(generalNumbers);
	}
}
