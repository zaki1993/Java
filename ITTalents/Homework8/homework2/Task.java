
public class Task {
	private final String name;
	private int workingHours;
	
	public Task(){
		this.name = "Task";
		this.workingHours = 0;
	}
	
	public Task(String name, int workingHours){
		this.name = name;
		this.workingHours = workingHours;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getHours(){
		return this.workingHours;
	}
	
	public void setHours(int hour){
		if(hour < 0){
			return;
		}
		this.workingHours = hour;
	}
}
