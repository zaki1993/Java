
public class Task9 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4,5},
					   {6,7,8,9,10},
					   {11,12,13,15,16},
					   {-5,3,8,9,-7},
					   {-8,9,0,-3,3}};
		
		int max = -2147483648;
		int currentSum = 0;
		int[][] maxSubMatrix = new int[2][2];
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				currentSum+=arr[i-1][j-1];
				currentSum+=arr[i-1][j];
				currentSum+=arr[i][j-1];
				currentSum+=arr[i][j];
				if(max < currentSum){
					max = currentSum;
					maxSubMatrix[0][0] = arr[i-1][j-1];
					maxSubMatrix[0][1] = arr[i-1][j];
					maxSubMatrix[1][0] = arr[i][j-1];
					maxSubMatrix[1][1] = arr[i][j];
				}
			}
			currentSum = 0;
		}
		for (int i = 0; i < maxSubMatrix.length; i++) {
			for (int j = 0; j < maxSubMatrix[i].length; j++) {
				System.out.print(maxSubMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
