package Homework;
import java.util.Scanner;

public class Task7 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int hour;
		double sum;
		boolean sick;
		System.out.println("The time is? ");
		hour = input.nextInt();
		System.out.println("How much money do i have? ");
		sum = input.nextDouble();
		System.out.println("Am i sick? ");
		sick = input.nextBoolean();
		if(sick){
			System.out.println("I wont go out");
		}
		if(sum>0){
			System.out.println("I will buy medicine!");
		}
		if(sum == 0){
			System.out.println("I will stay at home");
		}
		if(!sick){
			System.out.println("I will go to the cinema");
		}
		if(sum<10){
			System.out.println("I will go for a coffee!");
		}
	}
}
