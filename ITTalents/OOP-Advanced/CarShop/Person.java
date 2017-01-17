
public class Person {
	private Car ownedCars[];
	private final String name;
	private int age;
	private final int MAX_CARS;
	private int currentCars;
	
	public Person(){
		this.MAX_CARS = 10;
		this.ownedCars = new Car[MAX_CARS];
		this.age = 20;
		this.name = "Zaki";
		this.currentCars = 0;
	}
	
	public Person(String name, int age, int maxCars){
		this.MAX_CARS = maxCars;
		this.ownedCars = new Car[MAX_CARS];
		this.name = name;
		this.age = age;
		this.currentCars = 0;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setAge(int age){
		if(age >= this.age){
			this.age = age;
		}
	}
	
	public int getMaxCars(){
		return this.MAX_CARS;
	}
	
	public void printOwnedCarsInfo(){
		for (int i = 0; i < this.currentCars;i++) {
			this.ownedCars[i].printInfo();
		}
	}
	
	public void buyCar(Car newCar){
		if(this.currentCars + 1 == this.MAX_CARS){
			return;
		}
		this.ownedCars[this.currentCars] = newCar;
		this.currentCars++;
	}
}
