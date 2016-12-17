import java.util.Scanner;

public class Task_words {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] sequence = {"Hello", "World", "in", "a", "frame"};
		printWords(sequence);
	}
	
	public static void printWords(String[] sequence){
		int longestWord = 0;
		int spacesPrint = 0;
		for (int i = 0; i < sequence.length; i++) {
			if(longestWord < sequence[i].length()){
				longestWord = sequence[i].length();
			}
		}
		for (int i = 0; i < longestWord + 2; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < sequence.length; i++) {
			
			System.out.print("*" + sequence[i]);
			for (int j = 0; j < longestWord - sequence[i].length(); j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		for (int i = 0; i < longestWord + 2; i++) {
			System.out.print("*");
		}
	}

}
