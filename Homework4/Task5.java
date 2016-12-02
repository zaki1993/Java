
public class Task5 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},
					   {5,6,7,8},
					   {9,10,11,12},
					   {13,14,15,16}};
		
		int sumRow, sumCol;
		int maxRow = 0, maxCol = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sumRow = sumCol = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sumRow += arr[i][j];
				sumCol += arr[j][i];
			}
			if(maxRow < sumRow){
				maxRow = sumRow;
			}
			if(maxCol < sumCol){
				maxCol = sumCol;
			}
		}
		System.out.println("The ratio is: " + (double)maxRow / (double)maxCol + " => maxCol is " + ((maxCol<maxRow)?"less":"bigger") + " than maxRow!");
	}

}
