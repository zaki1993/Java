import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sequence;
		
		System.out.println("Enter a word one: ");
		sequence = sc.nextLine();
		
		for (int i = 0; i < sequence.length(); i++) {
			if(i == 0 || sequence.charAt(i - 1) == ' '){
				System.out.print(sequence.toUpperCase().charAt(i));
				continue;
			}
			if(sequence.charAt(i) == ' '){
				System.out.print(" ");
				continue;
			}
			if((int)sequence.charAt(i)>96){
				System.out.print(sequence.charAt(i));
			}
			else if((int)sequence.charAt(i) < 91){
				System.out.print(sequence.charAt(i) + 32);
			}
		}
	}

}
