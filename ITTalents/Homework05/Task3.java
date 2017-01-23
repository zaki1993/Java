import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String wordOne, wordTwo;
		boolean different = false;
		do{
			System.out.println("Enter a word: ");
			wordOne = sc.next();
			System.out.println("Enter an another word: ");
			wordTwo = sc.next();			
		}while(wordOne.contains(" ") || wordTwo.contains(" "));
		
		if(wordOne.length() != wordTwo.length()){
			System.out.println("The words are with different length!");
			different = true;
		}
		else{
			System.out.println("The words are with same length!");
		}
		
		int smallLength = (wordOne.length() < wordTwo.length()?wordOne.length():wordTwo.length());
		
		for (int i = 0; i < smallLength; i++) {
			if(wordOne.charAt(i)!= wordTwo.charAt(i)){
				System.out.println(i + " : " + wordOne.charAt(i) + " - " + wordTwo.charAt(i));
			}
		}
		
		if(different){
			int bigLength = (wordOne.length() > wordTwo.length()?wordOne.length():wordTwo.length());
			char wordPrint = (bigLength == wordOne.length()?'1':'2');
			for (int i = smallLength; i < bigLength; i++) {
				System.out.println(i + " : " + (wordPrint == '1'?wordOne.charAt(i):wordTwo.charAt(i)) + " - " + " ");
			}
		}
		
	}

}
