import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int first, second, third;
		for(int i = 100;i <= 999;i++){
			first = i % 10;
			second = (i/10)%10;
			third = i/100;
			if(first != second && second != third && first != third){
				System.out.println(i);
			}
		}

	}

}
