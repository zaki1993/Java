import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sequence;
		System.out.println("Enter a sequence: ");
		sequence = sc.nextLine();
		int longestWordLength = 0;
		int numberWords = 1;
		int lastOccurence = 0;
		
		for (int i = 0; i < sequence.length(); i++) {
			if(sequence.charAt(i) == ' '){
				numberWords++;
				if(longestWordLength < sequence.substring(lastOccurence, i).length()){
					longestWordLength = sequence.substring(lastOccurence, i).length();
				}
				lastOccurence = i;
			}	
		}
		
		System.out.println(numberWords + " words, the longest of which is " + longestWordLength + " letters");
		
	}

}
