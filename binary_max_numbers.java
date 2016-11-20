package Max;
import java.util.Scanner;

public class Max {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int a = 2;
		int b = 16;
		int c = a - b;  
	    int k = (c >> 31) & 0x1;  
	    int max = a - k * c;  
		System.out.println(max);
	}
}
