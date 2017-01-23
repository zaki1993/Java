import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String wordOne, wordTwo;
		
		System.out.println("Enter a word one: ");
		wordOne = sc.next();
		System.out.println("Enter a word two: ");
		wordTwo = sc.next();
		
		boolean flag = false;
		
		for (int i = 0; i < wordOne.length(); i++) {
			for (int j = 0; j < wordTwo.length(); j++) {
				if(wordOne.charAt(i) == wordTwo.charAt(j)){
					for (int j2 = 0; j2 < i; j2++) {
						for (int k = 0; k < j; k++) {
							System.out.print(" ");
						}
						System.out.println(wordOne.charAt(j2));
					}
					System.out.println(wordTwo);
					for (int j2 = i+1; j2 <wordOne.length() ; j2++) {
						for (int k = 0; k < j; k++) {
							System.out.print(" ");
						}
						System.out.println(wordOne.charAt(j2));
					}
					flag = true;
				}
				if(flag){
					break;
				}
			}
			if(flag){
				break;
			}
		}
		if(!flag){
			System.out.println("The words arent crossing!");
		}
		
	}

}
