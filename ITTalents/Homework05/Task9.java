import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		int sum = 0;
		int currentNumber = 0;
		int getIndex = -1;		
		
		for (int i = 0; i < x.length(); i++) { 
			if(x.charAt(i)>='0' && x.charAt(i)<='9'){
				for (int j = i; j < x.length(); j++) {
					if(x.charAt(j)<'0' || x.charAt(j)>'9'){
						getIndex = j;
						break;
					}
					if(j == x.length() - 1 && (x.charAt(j)>='0' || x.charAt(j)<='9')){
						getIndex = j + 1;
						break;
					}
				}	
				if(getIndex != -1){
					for (int j = 0; j < x.substring(i, getIndex).length(); j++) {
						currentNumber*=10;
						currentNumber+=(int)x.substring(i,getIndex).charAt(j) - 48;
					}
					
					if(i-1>=0 && x.charAt(i-1) == '-'){
						currentNumber*=-1;
					}
					i = getIndex;
					getIndex = -1;
					System.out.println(currentNumber);
				}
			}
			sum+=currentNumber;
			currentNumber=0;
		}
		System.out.println("The sum is: " + sum);
		
	}
}
