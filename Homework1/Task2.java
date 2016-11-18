package Homework;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int numOne, numTwo;
		System.out.print("Please, enter value for numOne: ");
		numOne = input.nextInt();
		System.out.print("Please, enter value for numTwo: ");
		numTwo = input.nextInt();
		int plus = numOne + numTwo;
		int minus = numOne - numTwo;
		int mult = numOne * numTwo;
		int devide = numOne / numTwo;
		int mod = numOne % numTwo;
		System.out.println("numOne + numTwo= " + plus);
		System.out.println("numOne - numTwo= " + minus);
		System.out.println("numOne * numTwo= " + mult);
		System.out.println("numOne / numTwo= " + devide);
		System.out.println("numOne % numTwo= " + mod);
		
		double doubleNumOne, doubleNumTwo;
		System.out.print("Please, enter value for doubleNumOne: ");
		doubleNumOne = input.nextDouble();
		System.out.print("Please, enter value for doubleNumTwo: ");
		doubleNumTwo = input.nextDouble();
		double doubleMinus = doubleNumOne + doubleNumTwo;
		double doublePlus = doubleNumOne - doubleNumTwo;
		double doubleMult = doubleNumOne * doubleNumTwo;
		double doubleDevide = doubleNumOne / doubleNumTwo;
		double doubleMod = doubleNumOne % doubleNumTwo;
		System.out.println("numOne + numTwo= " + doublePlus);
		System.out.println("numOne - numTwo= " + doubleMinus);
		System.out.println("numOne * numTwo= " + doubleMult);
		System.out.println("numOne / numTwo= " + doubleDevide);
		System.out.println("numOne % numTwo= " + doubleMod);
	}
}
