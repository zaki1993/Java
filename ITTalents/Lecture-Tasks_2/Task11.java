import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,n;
		
		System.out.println("Please enter n: ");
		n = sc.nextInt();
		
		System.out.println("Please enter m: ");
		m = sc.nextInt();
		
		int[][] arr = new int[n][m];
		
		//first one
		for (int i = 0; i <arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (j+1) + (i*arr[i].length);
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//second one
		for (int i = 0; i <arr.length; i++) {	
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i+1) + (j*arr.length);
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//third one
		int currentNumber = 1;
		int holder = 0;
		int fencer = 1;
		
		for(int i=0; i<n; i++){
			holder=i;
			for(int j=0; j<i+1; j++){
				if(j==m){
					break;
				}
				arr[holder][j]=currentNumber++;
				holder--;
			}
		}
		for(int j=1; j<m-n+1; j++){
			holder=j;
			for(int i=n-1; i>=0; i--){
			arr[i][holder]=currentNumber++;
			holder++;
			}
		}
		
		for(int j=m-n+1; j<m; j++){
			holder=j;
			for(int i=n-1;i>=fencer;i--){
				if(holder==m){
					break;
				}
				arr[i][holder]=currentNumber++;
				holder++;
			}
			fencer++;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		

		System.out.println();
		
		//fourth one
		for (int i = 0; i <arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(j % 2 != 0){
					arr[i][j] = (j+1)*arr.length - i;
					continue;
				}
				arr[i][j] = (i+1) + (j*arr.length);
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
	}

}
