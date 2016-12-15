
public class Task3 {

	public static void main(String[] args) {
		int[] arr1 = {-5,-4,-3,-2,-1,5,6,7};
		int[] arr2 = {7,6,5,-1,-2,-3,-4,-5};
		System.out.println(findNegative(arr2, 0));
	}
	public static int findNegative(int[] arr,int current){
		if(current == arr.length){
			return 0;
		}
		if(arr[current] < 0){
			return 1 + findNegative(arr, current + 1);
		}
		return findNegative(arr,  current + 1);
	}
}
