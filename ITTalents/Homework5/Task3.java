import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String wordOne, wordTwo;
		
		do{
			System.out.println("Enter a word: ");
			wordOne = sc.next();
			System.out.println("Enter an another word: ");
			wordTwo = sc.next();			
		}while(wordOne.contains(" ") || wordTwo.contains(" ") || wordOne.length() != wordTwo.length());
		
		for (int i = 0; i < wordOne.length(); i++) {
			if(wordOne.charAt(i)!= wordTwo.charAt(i)){
				System.out.println(i + " : " + wordOne.charAt(i) + " - " + wordTwo.charAt(i));
			}
		}
	}

}
