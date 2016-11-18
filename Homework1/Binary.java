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
		int fifthBit = (y >> 5) % 10;
		
		//checks the number of ones in the number
		int numberOfOnes = 3;
		numberOfOnes = numberOfOnes - ((numberOfOnes >>> 1) & 0x55555555);
		numberOfOnes = (numberOfOnes & 0x33333333) + ((numberOfOnes >>> 2) & 0x33333333);
		numberOfOnes = (numberOfOnes + (numberOfOnes >>> 4)) & 0x0f0f0f0f;
		numberOfOnes = numberOfOnes + (numberOfOnes >>> 8);
		numberOfOnes = numberOfOnes + (numberOfOnes >>> 16);
		
		System.out.println(sum);
		System.out.println(subtract);
		System.out.println(fifthBit);
		System.out.println(numberOfOnes);
	}
}
