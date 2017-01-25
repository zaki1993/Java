
public abstract class Task {
	private final String name;
	private int workingHours;
	
	Task(String name, int workingHours){
		this.name = name;
		this.workingHours = workingHours;
	}
	
	String getName(){
		return this.name;
	}
	
	int getWorkingHours(){
		return this.workingHours;
	}
	
	void setWorkingHours(int hours){
		if(hours < 0){
			return;
		}
		this.workingHours = hours;
	}
}
