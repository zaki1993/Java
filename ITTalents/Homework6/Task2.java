
public class Task2 {

	public static void main(String[] args) {
		System.out.println(product(4,5));
	}
	
	public static long product(int a, int b){
		if(b == 1){
			return a;
		}
		return a + product(a, b - 1);
	}

}
