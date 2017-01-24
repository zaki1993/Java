
public class AllWork {
	private Task[] tasks;
	private int freePlacesForTask;
	private int currentUnassignedTask;
	private int capacity;
	
	AllWork(int capacity){
		this.capacity = capacity;
		this.freePlacesForTask = this.capacity;
		this.tasks = new Task[freePlacesForTask];
		this.currentUnassignedTask = 0;
	}
	
	void addTask(Task newTask){
		if(this.freePlacesForTask > 0){
			this.tasks[this.capacity - this.freePlacesForTask--] = newTask;
		}
	}
	
	Task getNextTask(){
		if(this.currentUnassignedTask == this.capacity){
			return null;
		}
		return this.tasks[this.currentUnassignedTask++];
	}
	
	boolean isAllWorkDone(){
		for (int i = 0; i < tasks.length; i++) {
			if(tasks[i] != null){
				if(tasks[i].getWorkingHours() != 0){
					return false;
				}
			}
		}
		return true;
	}
	
	void setTaskHours(Task task, int hours){
		for (int i = 0; i < tasks.length; i++) {
			if(tasks[i] == task && tasks[i] != null){
				tasks[i].setWorkingHours(hours);
			}
		}
	}
}
