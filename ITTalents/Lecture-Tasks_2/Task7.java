
public class Task7 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4,5},
					   {6,7,8,9,10},
					   {11,12,13,15},
					   {59,39,8,9,-7},
					   {89,99,59,3,3}};
		
		long pr = 1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i > j){
					pr*=arr[i][j];
				}
			}
		}
		System.out.println("The product is: " + pr);

	}

}
