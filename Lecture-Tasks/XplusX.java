import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		System.out.println("Enter x > 3 and odd: ");
		x = input.nextInt();
		int spacesCenter = x-1;
		int spacesLeft = 0;
		int spacesRight = 0;
		
		boolean increaseLeft = true;
		boolean increaseRight = true;
		boolean increaseCenter = false;
		
		int spacesBetween = x;
		
		if(x % 2 == 0 || x < 3){
			System.out.println("Invalid input");
		}
		else{
			for(int i = 0;i<x;i++){
				//FIRST X
				
				for(int j = 0;j<spacesLeft;j++){
					System.out.print(" ");
				}
				if(spacesCenter>0){
					System.out.print("*");
				}
				for(int j = 0;j<spacesCenter-1;j++){
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j = 0;j<spacesRight;j++){
					System.out.print(" ");
				}
				
				//PLUS
				if(spacesCenter>0){
					for(int j = 0;j<spacesBetween;j++){
						System.out.print(" ");
					}
					System.out.print("*");
					for(int j = 0;j<spacesBetween;j++){
						System.out.print(" ");
					}
				}
				else{
					System.out.print(" ");
					for(int j = 0;j<x;j++){
						System.out.print("* ");
					}
				}
				
				//SECOND X
				for(int j = 0;j<spacesLeft;j++){
					System.out.print(" ");
				}
				if(spacesCenter>0){
					System.out.print("*");
				}
				for(int j = 0;j<spacesCenter-1;j++){
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j = 0;j<spacesRight;j++){
					System.out.print(" ");
				}
				
				//LEFT
				if(spacesLeft == x/2){
					increaseLeft = false;
				}
				if(increaseLeft){
					spacesLeft++;
				}
				else{
					spacesLeft--;
				}
				
				//RIGHT
				if(spacesRight == x/2){
					increaseRight = false;
				}
				if(increaseRight){
					spacesRight++;
				}
				else{
					spacesRight--;
				}
				
				//CENTER
				if(!increaseCenter){
					spacesCenter-=2;
				}
				else{
					spacesCenter+=2;
				}
				if(spacesCenter <= 0){
					increaseCenter = true;
				}
				
				System.out.println();
			}
		}
	}

}
