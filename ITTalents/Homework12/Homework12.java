import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Scanner;

public class Homework12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		input = input.toUpperCase();
		
		
		HashMap<String, Integer> text = new HashMap();
		
		for (int i = 0; i < input.length(); i++) {
			char currentLetter = input.charAt(i);
			if(currentLetter >= 'A' && currentLetter <= 'Z'){
				if(text.get(currentLetter + "") == null){
					text.put(currentLetter + "", 1);
				}
				else{
					text.put(currentLetter + "", text.get(currentLetter + "") + 1);
				}
				
			}
		}
		printResult(text);
	}
	
	public static void printResult(HashMap<String, Integer> toSort){
		// Create a set of keys and values
		LinkedList<Entry<String, Integer>> hashToList = new LinkedList<>(toSort.entrySet());
		
		// sort the set of keys and values by value
		Collections.sort(hashToList, new HashValueComparable());
		
		double totalLetters = 0;
		int differentLetters = hashToList.size();
		
		// loop through each of the pairs <key, value>
		for(Entry<String, Integer> i : hashToList){
			// find the total letters
			totalLetters += i.getValue();
		}

		// loop again
		for(Entry<String, Integer> i : hashToList){
			double percentage = i.getValue() / totalLetters;
			System.out.println(i.getKey() + ": " + i.getValue() + " " + multiplyString("#", (int)(percentage * 100)));
		}
	}
	
	public static String multiplyString(String toMultiply, int times){
		String result = toMultiply;
		for (int i = 0; i < times - 1; i++) {
			result += toMultiply;
		}
		return result;
	}

}
