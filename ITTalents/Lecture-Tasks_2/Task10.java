
public class Task10 {

	public static void main(String[] args) {
		int[] arr = {4, 1, 1,4, 2, 3,4,4, 1, 2,4, 9, 3};
		int current = 0, maxCount = 0;
		int number = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = i;j< arr.length;j++){
				if(arr[i] == arr[j] && i != j){
					current++;
				}
				if(maxCount<current){
					number = arr[i];
					maxCount = current;
					current = 0;
				}
			}
		}
		System.out.println("The most frequently number is: " + number + " contained " + maxCount + " times");
	}

}
