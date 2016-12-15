import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [][] arr = new char[10][10];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = '0';
			}
		}
		int xCoord = 0;
		int yCoord = 0;
		int numberMines = 5;
		int[][] coords = new int[numberMines][2];
		do{
			System.out.println("Please enter mine[" + numberMines + "][X]: ");
			xCoord = sc.nextInt();
			System.out.println("Please enter mine[" + numberMines + "][Y]: ");
			yCoord = sc.nextInt();
			if((xCoord < 0 || xCoord > arr.length) ||
					(yCoord < 0 || yCoord > arr.length) &&
					(!contains(arr,xCoord,yCoord))){
				continue;
			}
			numberMines--;
			arr[xCoord][yCoord] = '*';		
			coords[numberMines][0] = xCoord;
			coords[numberMines][1] = yCoord;
		}while(numberMines>0);
		minesweeper(arr, coords, 0);
		print(arr);
	}
	
	public static void minesweeper(char[][] arr,int[][] coords,int current){
		if(current == coords.length){
			return;
		}
		if(canStep(arr,coords[current][0] + 1,coords[current][1])){
			(arr[coords[current][0] + 1][coords[current][1]]) +=1;
		}
		if(canStep(arr,coords[current][0] - 1,coords[current][1])){
			(arr[coords[current][0] - 1][coords[current][1]]) +=1;
		}
		if(canStep(arr,coords[current][0],coords[current][1] + 1)){
			(arr[coords[current][0]][coords[current][1] + 1]) +=1;
		}
		if(canStep(arr,coords[current][0],coords[current][1] - 1)){
			(arr[coords[current][0]][coords[current][1] - 1]) +=1;
		}
		if(canStep(arr,coords[current][0] - 1,coords[current][1] - 1)){
			(arr[coords[current][0] - 1][coords[current][1] - 1]) +=1;
		}
		if(canStep(arr,coords[current][0] + 1,coords[current][1] + 1)){
			(arr[coords[current][0] + 1][coords[current][1] + 1]) +=1;
		}
		if(canStep(arr,coords[current][0] + 1,coords[current][1] - 1)){
			(arr[coords[current][0] + 1][coords[current][1] - 1]) +=1;
		}
		if(canStep(arr,coords[current][0] - 1,coords[current][1] + 1)){
			(arr[coords[current][0] - 1][coords[current][1] + 1]) +=1;
		}
		minesweeper(arr,coords,current+1);
	}
	
	public static boolean canStep(char[][] arr, int x, int y){
		return (x >= 0 && x <arr.length && y>= 0 && y <arr[0].length) && arr[x][y] != '*';
	}
	
	public static boolean contains(char[][] arr, int x,int y){
		return arr[x][y] == '*';
	}
	
	public static void print(char[][] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == '0'){
					System.out.print("X");
					continue;
				}
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
