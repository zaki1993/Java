import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter some text: ");
		String sequence = sc.nextLine();
		System.out.println(ratio(sequence));
	}
	public static String ratio(String sequence){
		int upperLetter = 0;
		int lowerLetter = 0;
		for (int i = 0; i < sequence.length(); i++) {
			if(sequence.charAt(i)>='a' && sequence.charAt(i) <= 'z'){
				lowerLetter++;
			}
			if(sequence.charAt(i)>='A' && sequence.charAt(i) <= 'Z'){
				upperLetter++;
			}
		}
		return new String(lowerLetter + ":" + upperLetter);
	}
}
