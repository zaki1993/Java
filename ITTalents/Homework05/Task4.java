import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String namesContainer;
		String firstPerson = "";
		String secondPerson = "";
		
		do{
			System.out.println("Enter two names separated by ',': ");
			namesContainer = sc.nextLine();
		}while(!namesContainer.contains(","));
		
		for (int i = 0; i < namesContainer.length(); i++) {
			if(namesContainer.charAt(i) == ','){
				firstPerson = namesContainer.substring(0, i);
				secondPerson = namesContainer.substring(i+1);
				break;
			}
		}
		
		int firstPersonSum = 0;
		int secondPersonSum = 0;
		
		for (int i = 0; i < firstPerson.length(); i++) {
			firstPersonSum += (int)firstPerson.charAt(i);
		}
		
		for (int i = 0; i < secondPerson.length(); i++) {
			secondPersonSum += (int)secondPerson.charAt(i);
		}
		
		System.out.println(firstPersonSum < secondPersonSum ? secondPerson : firstPerson);
		
	}

}
