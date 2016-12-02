
public class Task4 {

	public static void main(String[] args) {
		int[][] arr = {{48,72,13,14,15},
					   {21,22,53,24,75},
					   {31,57,33,34,35},
					   {41,95,43,44,45},
					   {59,52,53,54,55},
					   {7,-4,10,11,125}};
		for(int i = 0;i<arr[0].length;i++){
			for(int j = 0;j<arr.length;j++){
				System.out.print(arr[arr.length - 1 - j][i] + " ");
			}
			System.out.println();
		}

		
	}

}
