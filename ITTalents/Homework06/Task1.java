
public class Task1 {

	public static void main(String[] args) {
		System.out.println(fibonacci(8));
	}
	public static long fibonacci(int index){
		if(index == 1 || index == 2){
			return 1;
		}
		return fibonacci(index - 1) + fibonacci(index - 2);
	}
}
