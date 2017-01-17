
public class Employee {
	private final String name; // Направих го final, защото според мен работника не трябва да си сменя името.
	private Task currentTask;
	private int hoursLeft;
	
	public Employee(String name){
		if(name.split(" ").length <= 1 && name.length() != 1){
			name = "PIPIPI"; //set default value
		}
		this.name = name;
		currentTask = new Task();
		hoursLeft = 0;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setTask(Task newTask){
		if(newTask == null){
			return;
		}
		this.currentTask = newTask;
	}
	
	public Task getTask(){
		return this.currentTask;
	}
	
	public int getHoursLeft(){
		return this.hoursLeft;
	}
	
	public void setHourLeft(int hours){
		if(hours < 0){
			return;
		}
		this.hoursLeft = hours;
	}
	
	public void work(){
		if(this.hoursLeft >= this.currentTask.getHours()){
			this.hoursLeft -= this.currentTask.getHours();
			this.currentTask.setHours(0);
		}
		else{
			this.currentTask.setHours(this.currentTask.getHours() - this.hoursLeft);
			this.hoursLeft = 0;	
		}
		showReport();
	}
	
	public void showReport(){
		System.out.println("Name: " + this.name + " " +
						   "Task name: " + this.currentTask.getName() + " " +
						   "Employee hours left: " + this.hoursLeft + " " +
						   "Current task hours left: " + this.currentTask.getHours());
	}
}
