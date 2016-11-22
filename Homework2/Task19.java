import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		System.out.println("Please enter a from 10 to 99");
		a = input.nextInt();	
		for(;;){
			if(a == 1){
				break;
			}
			if(a % 2 == 0){
				System.out.print(a/2 + " ");
				a/=2;
			}
			else{
				System.out.print((3*a + 1) + " ");
				a = 3*a + 1;
			}
		}
	}

}
