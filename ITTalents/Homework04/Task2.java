import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.println("Enter n :");
		n = sc.nextInt();
		int arr[][] = new int[n][n];
		for(int i = 0;i<n;i++){
			for(int j = 0;j<n;j++){
				System.out.println("Enter arr["+i+"]["+j+"]: ");
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[i].length;j++){
				if(i == j){
					System.out.print(arr[i][j] + " ");
				}
			}
		}
		
		System.out.println();
		
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[i].length;j++){
				if(i + j == arr.length - 1){
					System.out.print(arr[i][j] + " ");
				}
			}
		}
		
	}

}
