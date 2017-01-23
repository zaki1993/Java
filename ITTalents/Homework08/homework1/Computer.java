public class Computer {
	private int year = 2_015;
	private double price = 1_500.99;
	private boolean isNotebook = true;
	private double hardDiskMemory = 1_024;
	private double freeMemory = 1_024;
	private String operationSystem = "Linux - Ubuntu";
	
	public Computer(){
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}
	
	public Computer(int year, double price, double hardDiskMemory, double freeMemory){
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}
	
	public Computer(int year, double price, double hardDiskMemory, double freeMemory, String operationSystem){
		this(year, price, hardDiskMemory, freeMemory);
		this.isNotebook = false;
		this.operationSystem = operationSystem;
	}
	
	public int comparePrice(Computer c){
		if(this.price > c.price){
			return -1;
		}
		else if(this.price < c.price){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public void changeOperationSystem(String newOperationSystem){
		this.operationSystem = newOperationSystem;
	}
	
	public void useMemory(int amount){
		if(this.freeMemory - amount >= 0){
			this.freeMemory-=amount;
		}
		else{
			System.out.println("Not enough free memory..!");
		}
	}
}
