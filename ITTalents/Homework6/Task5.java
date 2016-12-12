
public class Task5 {

	public static void main(String[] args) {
		System.out.println(palindrome(504005));
	}
	
	public static boolean palindrome(int number){
		if(number < 0){
			return palindrome(-1*number);
		}
		if(number < 10){
			return true;
		}
		if(number%10 != (number/(power(10,length(number) - 1)))){
			return false;
		}
		int dummy = (number - ((number%10*power(10,length(number) - 1)) + number%10))/10;
		if(length(dummy) == 0){
			return true;
		}
		else if(frontZeros(number) - (length(dummy) - nonZeros(dummy)) != 0){
			return false;
		}
		else{
			return palindrome((number - ((number%10*power(10,length(number) - 1)) + number%10))/power(10,length(number) - length(dummy) - 2 + nonZeros(dummy)));
		}
	}
	
	public static int length(int number){
		int result = 0;
		while(number!=0){
			result++;
			number/=10;
		}
		return result;
	}
	
	public static int power(int x, int y){
		int result = 1;
		for (int i = 0; i < y;i++) {
			result*=x;
		}
		return result;
	}
	
	public static int nonZeros(int num){
		int result = 0;
		while(num!=0){
			if(num%10 != 0){
				result++;
			}
			num/=10;
		}
		return result;
	}
	
	public static int frontZeros(int num){
		int result = 0;
		int counter = 2;
		while(num/power(10, length(num) - counter)%10 == 0){
			result++;
			counter++;
		}
		return result;
	}
	
}
