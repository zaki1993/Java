import java.util.Scanner;

public class MinMaxAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do{
			System.out.println("Enter a positive number: ");
			n = sc.nextInt();
		}while(n<0);
		int[] arr = new int[n];
		for(int i = 0;i<arr.length;i++){
			System.out.println("Enter a value for arr[" + i + "]: ");
			arr[i] = sc.nextInt();
		}
		int min,max;
		int minPos = 0, maxPos = 0;
		double avg = 0;
		min = max = arr[0];
		for(int i = 0;i<n;i++){
			if(min < arr[i]){
				min = arr[i];
				minPos = i;
			}
			if(max > arr[i]){
				max = arr[i];
				maxPos = i;
			}
			avg += arr[i];
		}
		
		System.out.println("The min element positions is: " + minPos);
		System.out.println("The max element position is :" + maxPos);
		System.out.println("The avarage is: " + avg/n);
	}

}
