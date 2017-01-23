
public class Task3 {

	public static void main(String[] args) {
		System.out.println(prime(5, 2));
	}
	
	public static boolean prime(int number, int counter){
		if(number <= 1 || number % counter == 0){
			return false;
		}
		if(counter == number - 1){
			return true;
		}
		return prime(number, counter + 1);
	}

	
}
