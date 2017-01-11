public class Computer {
	int year = 2_015;
	float price = 1_500.99f;
	boolean isNotebook = true;
	int hardDiskMemory = 1_024;
	int freeMemory = 1_024;
	String operationSystem = "Linux - Ubuntu";
	void changeOperationSystem(String newOperationSystem){
		operationSystem = newOperationSystem;
	}
	void useMemory(int amount){
		if(freeMemory - amount >= 0){
			freeMemory-=amount;
		}
		else{
			System.out.println("Not enough free memory..!");
		}
	}
}
