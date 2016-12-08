
public class Task8 {

	public static void main(String[] args) {
		boolean[][] arr = {{true,false,false,false,false},
						   {false,true,false,false,true},
						   {false,true,false,false,false},
						   {false,false,true,false,false},
						   {true,false,false,true,false}};
		
		boolean contains = false;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i + j < arr[i].length - 1 && arr[i][j]){
					contains = true;
					break;
				}
			}
		}
		System.out.println(contains?"Yes":"No");

	}

}
