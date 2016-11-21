import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Please enter n: ");
		n = input.nextInt();
		if(n>=10 && n <=200){
			for(int i = n;i>=1;i--){
				if(i % 7 == 0){
					System.out.println(i);
				}
			}
		}
		else{
			System.out.println("Invalid input");
		}
	}

}
