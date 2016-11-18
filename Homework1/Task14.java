package Homework;
import java.util.Scanner;

public class Task14 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int firstX, firstY;
		int secondX, secondY;
		System.out.println("Please, enter a value for firstX: ");
		firstX = input.nextInt();
		System.out.println("Please, enter a value for firstY: ");
		firstY = input.nextInt();
		System.out.println("Please, enter a value for secondX: ");
		secondX = input.nextInt();
		System.out.println("Please, enter a value for secondY: ");
		secondY = input.nextInt();
		if((firstX%2 == 0 && firstY%2!=0) && (secondX%2 != 0 && secondY%2==0)){
			System.out.println("They are on the same color"); //white color
		}
		else if((firstX%2 != 0 && firstY%2==0) && (secondX%2 == 0 && secondY%2!=0)){
			System.out.println("They are on the same color"); //black color
		}
		else{
			System.out.println("They are not on the same color");
		}
	}
}
