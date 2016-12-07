import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Enter n: ");
		n = input.nextInt();
		int card_color;
		int card_type;
		for(int i = n;i<=52;i++){
			card_color = (i-1)%4;
			card_type = ((i-1)/4)%13;
			switch(card_type){
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
					System.out.print(card_type + 2);
					break;
				case 9:
					System.out.print("J");
					break;
				case 10:
					System.out.print("Q");
					break;
				case 11:
					System.out.print("K");
					break;
				case 12: 
					System.out.print("A");
					break;
			}
			switch(card_color){
				case 0:
					System.out.println(" Spades");
					break;
				case 1:
					System.out.println(" Diamonds");
					break;
				case 2:
					System.out.println(" Hearts");
					break;
				case 3:
					System.out.println(" Clubs");
					break;
			}
			
		}
	}
}
