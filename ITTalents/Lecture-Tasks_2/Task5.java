
public class Task5 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4,5},
					   {6,7,8,9,10},
					   {11,12,13,15},
					   {-5,3,8,9,-7}};
		int max = -2147483648;
		int currentSum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				currentSum+=arr[i][j];
			}
			if(max < currentSum){
				max = currentSum;
			}
			currentSum = 0;
		}
			
		System.out.println("The max sum is: " + max);

	}

}
