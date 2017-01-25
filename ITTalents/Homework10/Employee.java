
public class Employee {
	private final String name;
	private Task currentTask;
	private int hoursLeft;
	private static AllWork allwork;
	
	public static AllWork getAllWork(){
		return Employee.allwork;
	}
	
	public static void setAllWork(AllWork newAllWork){
		if(newAllWork != null){
			Employee.allwork = newAllWork;
		}
	}
	
	Employee(String name){
		this.name = name;
		this.hoursLeft = 8;
		if(!allwork.isAllWorkDone()){	
			this.currentTask = allwork.getNextTask();
		}
	}
	
	void work(){
		if(currentTask == null){
			return;
		}
		int taskHours = this.currentTask.getWorkingHours();
		if(taskHours <= this.hoursLeft){
			this.hoursLeft -= taskHours;
			this.currentTask.setWorkingHours(0);
			allwork.setTaskHours(currentTask, 0);
			if(!allwork.isAllWorkDone()){
				this.currentTask = allwork.getNextTask();
				work();
			}
		}
		else{
			this.currentTask.setWorkingHours(taskHours - this.hoursLeft);
			allwork.setTaskHours(currentTask, taskHours - this.hoursLeft);
			this.hoursLeft = 0;
		}
		startWorkingDay();
	}
	
	void startWorkingDay(){
		this.hoursLeft = 8;
	}
	
	String getName(){
		return this.name;
	}
	
	Task getCurrentTask(){
		return this.currentTask;
	}
	
	void setCurrentTask(Task newTask){
		if(newTask != null){
			this.currentTask = newTask;
		}
	}
	
	int getHoursLeft(){
		return this.hoursLeft;
	}
	
	void setHoursLeft(int hours){
		if(hours > 0){	
			this.hoursLeft = hours;
		}
	}
}
