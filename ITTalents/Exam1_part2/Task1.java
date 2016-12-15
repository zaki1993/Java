import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int diceOne = 0;
		int diceTwo = 0;
		int numDices = 0;
		int numTries = 0;
		do{
			System.out.println("Row dice: ");
			diceOne = sc.nextInt();
			diceTwo = sc.nextInt();
			if(diceOne>0 && diceOne <=6 && diceTwo>0 && diceTwo <=6){
				if(diceOne+diceTwo == 7){
					numDices++;
				}
			}
			else{
				numDices = 0;
			}
			numTries++;
		}while(numDices<7);
		System.out.println("Total tries: " + numTries);
	}

}
