import java.util.Scanner;

public class NumOnes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num ;
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		int uCount = 0;
	
		uCount = num - ((num >> 1) & 033333333333) - ((num >> 2) & 011111111111);
		//uCount = num - (num >> 1) - (num >> 2) - (num >> 3) - ... - (num >>31)
		
	     System.out.println(((uCount + (uCount >> 3)) & 030707070707) % 63);
	     
	}

}
