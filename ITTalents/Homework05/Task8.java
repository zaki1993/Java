import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sequence;
		System.out.println("Enter a sequence: ");
		sequence = sc.nextLine();
		
		boolean palindrome = true;
		
		for (int i = 0; i < sequence.length(); i++) {
			if(sequence.charAt(i) != sequence.charAt(sequence.length() - 1 - i)){
				palindrome = false;
			}
		}
		System.out.println(palindrome?"Yes":"No");
	}

}
