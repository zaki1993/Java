import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String words = "";
		do{
			System.out.println("Enter a sequence: ");
			words = sc.nextLine();
		}while(words.contains("  "));
		
		System.out.println(mostFrequent(words));
		
	}
	public static String mostFrequent(String words){
		String[] splitWords = words.split(" ");
		int count = 0;
		int nextCount = 0;
		int index = 0;
		for (int i = 0; i < splitWords.length; i++) {
			for (int j = 0; j < splitWords.length; j++) {
				if(splitWords[i].equals(splitWords[j])){
					count++;
				}
			}
			if(count > nextCount){
				nextCount = count;
				index = i;
			}
			count=0;
		}
		return splitWords[index];
	}

}
