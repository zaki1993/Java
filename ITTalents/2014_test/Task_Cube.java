
public class Task_Cube {

	public static void main(String[] args) {
		cubeNumber(8);

	}
	public static void cubeNumber(int number){
		for (int i = 0; i < Math.sqrt(number); i++) {
			if(i*i*i == number){
				System.out.println(number + " is a cube of " + i);
				return;
			}
		}
		System.out.println(number + " is not a cube");
	}
}
