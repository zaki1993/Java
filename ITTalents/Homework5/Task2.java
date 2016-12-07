import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String wordOne, wordTwo;
		
		do{
			System.out.println("Enter a word with 10 symbols: ");
			wordOne = sc.next();
		}while(wordOne.length()>10 || wordOne.length() < 5);
		
		do{
			System.out.println("Enter a word with 20 symbols: ");
			wordTwo = sc.next();
		}while(wordTwo.length()>20 || wordTwo.length() < 5);
		
		String replaceHelper = wordTwo.substring(0, 5);
		wordTwo = wordTwo.replace(replaceHelper, wordOne.substring(0, 5));
		wordOne = wordOne.replace(wordOne.substring(0,5), replaceHelper);
		
		System.out.println(wordOne.length()<wordTwo.length()?wordTwo.length():wordOne.length());
		System.out.println(wordOne);
		System.out.println(wordTwo);
		
		System.out.println(replaceHelper.substring(0,20));
		
	}

}
