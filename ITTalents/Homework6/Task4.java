
public class Task4 {

	public static void main(String[] args) {
		trianglePrint(1,9);

	}
	
	public static void trianglePrint(int start, int end){
		if(end == 0){
			return;
		}
		trianglePrint(start, end - 1);
		for (int i = start; i <= end; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
