import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String x = sc.nextLine();
		int lengthHolder = x.length();
		
		for (int i = 0; i < lengthHolder; i++) {
			x+=(char)((int)x.charAt(i)+5);
		}
		x=x.replace(x.substring(0, x.length()/2), "");
		System.out.println(x);
	}

}
