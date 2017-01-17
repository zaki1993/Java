
public class CarShop {
	private Car cars[];
	private int capacity;
	private int currentCars;
	public CarShop(int capacity){
		if(capacity < 0){
			capacity = 2;
		}
		this.cars = new Car[capacity];
		this.capacity = capacity;
		this.currentCars = 0;
	}
	
	public boolean addCar(Car newCar){
		if(newCar == null){
			return false;
		}
		if(this.currentCars + 1 == capacity){
			System.out.println("Not enough space!");
			return false;
		}
		this.cars[this.currentCars++]= newCar;
		return true;
	}
	
	public Car getNextCar(){
		return this.cars[currentCars - 1];
	}
	
	public void sellNextCar(Person buyer){
		Car next = getNextCar();
		buyer.buyCar(next);
		removeCar(next);
	}
	
	public void removeCar(Car toRemove){
		this.cars[this.currentCars] = null;
		this.currentCars--;
	}
	
	public void showAllCarsInTheShop(){
		for (int i = 0; i < this.currentCars; i++) {
			this.cars[i].printInfo();
		}
	}
	
}
