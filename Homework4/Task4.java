
public class Task4 {

	public static void main(String[] args) {
		int[][] arr = new int[][]{{48,72,13,14,15},
					   {21,22,53,24,75},
					   {31,57,33,34,35},
					   {41,95,43,44,45},
					   {59,52,53,54,55},
				       {61,69,63,64,65}};
		int temp = 0;
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[i].length;j++){
				temp = arr[i][j];
				//arr[i][j] = arr[j][i];
				//System.out.println(arr[arr[i].length - 1 - j][i]);
				//arr[arr.length - 1 - i][i] = arr[arr.length - 1 - i][arr.length - 1 - j];
//				arr[arr.length - 1 - i][arr.length - 1 - j] = arr[i][arr.length - 1 - i];
				//arr[i][arr.length - 1 - i] = temp;
			}
		}

		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[i].length;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
