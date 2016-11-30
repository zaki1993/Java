
public class Task1 {

	public static void main(String[] args) {
		int[][] arr = {{48,72,13,14,15},
						{21,22,53,24,75},
						{31,57,33,34,35},
						{41,95,43,44,45},
						{59,52,53,54,55},
						{61,69,63,64,65}};
		int min = arr[0][0];
		int max = arr[0][0];
		
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[i].length;j++){
				if(min>arr[i][j]){
					min = arr[i][j];
					continue;
				}
				if(max<arr[i][j]){
					max = arr[i][j];
				}
			}
		}
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		

	}

}
