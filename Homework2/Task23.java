import java.util.Scanner;

public class Task23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 1;
		int y = 1;
		while(x <= 9){
			while(y <= 9){
				System.out.print(x + "*" + y + " = " + x*y + " ");
				y++;
			}
			System.out.println();
			y = x + 1;
			x++;
		}
	}

}
