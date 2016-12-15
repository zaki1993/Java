import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String coinToss = "";
		int numberHeads = 0;
		do{
			System.out.println("Heads or Tails?");
			coinToss = sc.next();
			if(coinToss.equals("Heads")){
				numberHeads++;
				continue;
			}
			numberHeads = 0;
		}while(numberHeads<5);
	}

}
