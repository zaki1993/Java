
public class Task_Hulm {

	public static void main(String[] args) {
		int[] arr = {14,13,12,11};
		for (int i = 1; i < arr.length - 1; i++) {
			if((arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) || (arr[i] > arr[i - 1] && (i + 1) + 1 == arr.length)){
				if(i+2 == arr.length){
					i++;
				}
				System.out.println(i + " Hulm!");
				break;
			}
			if((arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) || (arr[i] < arr[i - 1] && (i + 1) + 1 == arr.length)){
				if(i+2 == arr.length){
					i++;
				}
				System.out.println(i + " Padina!");
				break;
			}
		}
	}

}
