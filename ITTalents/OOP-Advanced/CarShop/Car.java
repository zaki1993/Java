
public class Car {
	private final String model;
	private final int year;
	private String color;
	private static final String[] colors = {"Red", "Blue", "Black", "White", "Yellow", "Cyan"};
	private static boolean include(String color){
		for (int i = 0; i < Car.colors.length; i++) {
			if(Car.colors[i].equals(color)){
				return true; //check if the current color is in the array with colors
			}
		}
		return false;
	}
	
	public Car(){
		model = "Lada";
		year = 1995;
		color = "Red";
	}
	
	public Car(String model, int year, String color){
		this.model = model;
		this.year = year;
		if(Car.include(color)){
			this.color = color;
		}
		else{
			this.color = colors[0];
		}
	}
	
	public boolean compare(Car compareCar){
		return this.model == compareCar.model && this.year == compareCar.year && this.color == compareCar.color;
	}
	
	public String getModel(){
		return this.model;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public void setColor(String color){
		if(Car.include(color)){
			this.color = color;
		}
	}
	
	public void printInfo(){
		System.out.println("Model: " + this.model + " " +
						   "Year: " + this.year + " " + 
						   "Color: " + this.color);	
	}
}

