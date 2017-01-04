public class binary_search {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(binary_search(arr,7,0, arr.length - 1));
	}
	
	public static int binary_search(int[] arr,int x, int left, int right){
		int middle = (left + right)/2;
		if(arr[0] > x || arr[arr.length - 1] < x){
			return -1; //if the given value is not in the array
		}
		if(arr[middle] < x){
			return binary_search(arr, x, middle + 1, right); //check the left half if the given element is smaller than the middle
		}	
		if(arr[middle] > x){
			return binary_search(arr, x, left, middle - 1); //check the right half if the given element is bigger than the middle
		}
		return middle;
	}

}
