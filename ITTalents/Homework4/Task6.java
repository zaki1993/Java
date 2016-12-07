
public class Task6 {

	public static void main(String[] args) {
		int[][] arr = {{11,12,13,14,15,16},
					   {21,22,23,24,25,26},
					   {31,32,33,34,35,36},
					   {41,42,43,44,45,46},
					   {51,52,53,54,55,56},
					   {61,62,63,64,65,66}};
		int sumAll = 0, sumCurrent = 0;
		
		for(int i = 0;i<arr.length;i++){
			for (int j = 0; j < arr[i].length; j++) {
				if(i%2 != 0){
					sumCurrent += arr[i][j];
					System.out.print(arr[i][j] + " ");
				}
			}
			if(i%2 != 0){
				System.out.println("sum " + sumCurrent);
				sumAll += sumCurrent;
				sumCurrent = 0;
			}
		}
		System.out.println("Sum of the elements is: " + sumAll);
	}

}
