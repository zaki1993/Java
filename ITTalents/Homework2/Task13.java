import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int givenNumber;
		int sum = 0;
		System.out.println("Please enter the sum: ");
		givenNumber = input.nextInt();
		for(int i = 100;i<=999;i++){
			sum = i%10 + (i/10)%10 + i/100;
			if(sum == givenNumber){
				System.out.println(i);
			}
			sum = 0;			
		}
	}

}
