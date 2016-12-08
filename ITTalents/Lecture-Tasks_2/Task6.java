
public class Task6 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4,5},
					   {6,7,8,9,10},
					   {11,12,13,15},
					   {-5,3,8,9,-7},
					   {-8,9,0,-3,3}};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][i] + " ");
		}
	}

}
