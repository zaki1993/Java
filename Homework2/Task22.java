import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Please enter n: ");
		n = input.nextInt();
		int counter = 0;
		int i = n;
		while(counter != 10){
			if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0 && i > n){
				counter++;	
				System.out.println(counter + ": " + i);
			}
			i++;
		}
	}

}
