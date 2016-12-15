import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [][] arr = {{'b',' ',' ',' ',' ','b'},
						 {' ','b',' ',' ','b',' '},
						 {' ',' ','b','b',' ',' '},
						 {' ',' ',' ',' ',' ',' '},
						 {' ',' ',' ',' ',' ',' '},
						 {' ',' ',' ',' ',' ',' '},
						 {' ',' ',' ',' ',' ',' '}};
		print(arr);
		paintBrush(arr,3,0);
		print(arr);
	}
	
	public static void paintBrush(char[][] arr, int x,int y){
		if(x<0 || x>= arr.length || y < 0 || y >= arr.length || arr[x][y] != ' '){
			return;
		}
		arr[x][y] = 'r';
		if(!canPaint(arr,x+1,y) && !canPaint(arr,x, y+1) && !canPaint(arr,x,y-1) && !canPaint(arr,x-1,y)){
			return;
		}
		if(canPaint(arr,x+1,y)){
			paintBrush(arr, x + 1, y);
		}
		if(canPaint(arr,x,y+1)){
			paintBrush(arr, x, y + 1);
		}
		if(canPaint(arr,x,y-1)){
			paintBrush(arr, x, y - 1);
		}
		if(canPaint(arr,x-1,y)){
			paintBrush(arr, x - 1, y);
		}
	}
	
	public static boolean canPaint(char[][] arr, int x, int y){
		return (x>=0 && x<arr.length && y >= 0 && y <arr[0].length) && arr[x][y] == ' ';
	}
	
	public static void print(char[][] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
