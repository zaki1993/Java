
public class Task5 {

	public static void main(String[] args) {
		System.out.println(palindrome(5));
	}
	
	public static boolean palindrome(int number){
		if(number < 10){
			return true;
		}
		if(length(number) != length(reverseNum(number))){
			return palindrome(number/10);
		}
		if(number%10 != reverseNum(number)%10){
			return false;
		}
		return palindrome(number - (number%10*power(10,length(number) - 1) + number%10));
	}
	
	public static int reverseNum(int number){
		int result = 0;
		while(number!=0){
			result*=10;
			result+=number%10;
			number/=10;
		}
		return result;
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
	
}
