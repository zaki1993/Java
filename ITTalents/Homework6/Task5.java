
public class Task5 {

	public static void main(String[] args) {
		System.out.println(palindrome(101050101));
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
		else if(frontZeros(number) == backZeros(dummy)){
			return palindrome(dummy/power(10, backZeros(dummy)));
		}
		return false;
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
	
	//Връща броя на нулите след числото след прeмахване на цифра
	public static int backZeros(int num){
		int result = 0;
		while(num%10==0){
			result++;
			num/=10;
		}
		return result;
	}
	
	//Връща броя на нулите пред числото след премахване на цифра
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
