
public class Task3 {

	public static void main(String[] args) {
		int[][] arr = {{48,72,13,14,15},
				{21,22,53,24,75},
				{31,57,33,34,35},
				{41,95,43,44,45},
				{59,52,53,54,55},
				{61,69,63,64,65}};
		int sum = 0;
		double avg = 0;
		
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[i].length;j++){
				sum+=arr[i][j];
				avg+=(double)arr[i][j]/(arr.length*arr[i].length);
			}
		}
		System.out.println("Sum: " + sum);
		System.out.println("Avarage: " + avg);

	}

}
