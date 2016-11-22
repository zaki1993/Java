import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b;
		System.out.println("Enter a: ");
		a = input.nextInt();
		System.out.println("Enter b: ");
		b = input.nextInt();
		int sum = 0;
		for(int i = a;i<=b;i++){
			if(sum > 200){
				break;
			}
			if(i % 3 == 0){
				System.out.println("skip 3");
				continue;
			}
			sum+=i*i;
			if(i == b || sum > 200){
				System.out.print(i*i);
			}
			else{
				System.out.print(i*i + ", ");
			}
		}
	}

}
