package Homework;
import java.util.Scanner;

public class Task13 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int celsium;
		System.out.println("Please enter a degree in celsium: ");
		celsium = input.nextInt();
		if(celsium<-100 || celsium > 100){
			System.out.println("Invalid entry data!");
		}
		else if(celsium < -20){
			System.out.println("Ledeno studeno!");
		}
		else if(celsium >=-20 && celsium <=0){
			System.out.println("Studeno!");
		}
		else if(celsium > 0 && celsium < 15){
			System.out.println("Hladno!");
		}
		else if(celsium >=15 && celsium <=25){
			System.out.println("Toplo!");
		}
		else{
			System.out.println("Goreshto!");
		}
	}
}
