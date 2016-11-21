import java.util.Scanner;

public class Task20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for(int i = 1;i<=9;i++){
			for(int j = i;j<=9;j++){
				System.out.print(j + " ");
			}
			for(int j = 0;j<i;j++){
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for(int i = 0;i<=9;i++){
			System.out.print(i + " ");
		}
	}

}
