
public class Demo {

	public static void main(String[] args) {
		AllWork allwork = new AllWork(21);
		allwork.addTask(new TaskTichane("ticham1", 5));
		allwork.addTask(new TaskTichane("ticham1", 5));
		allwork.addTask(new TaskTichane("ticham1", 5));
		allwork.addTask(new TaskTichane("ticham1", 5));
		allwork.addTask(new TaskTichane("ticham1", 5));
		allwork.addTask(new TaskTichane("ticham1", 5));
		allwork.addTask(new TaskTichane("ticham1", 5));
		allwork.addTask(new TaskTichane("ticham1", 5));
		allwork.addTask(new TaskTichane("ticham1", 5));
		allwork.addTask(new TaskTichane("ticham1", 5));
		allwork.addTask(new TaskTichane("ticham1", 5));
		allwork.addTask(new TaskQdene("qm", 4));
		allwork.addTask(new TaskQdene("qm", 4));
		allwork.addTask(new TaskQdene("qm", 4));
		allwork.addTask(new TaskQdene("qm", 4));
		allwork.addTask(new TaskQdene("qm", 4));
		allwork.addTask(new TaskQdene("qm", 4));
		allwork.addTask(new TaskQdene("qm", 4));
		allwork.addTask(new TaskQdene("qm", 4));
		allwork.addTask(new TaskQdene("qm", 4));
		allwork.addTask(new TaskQdene("qm", 4));
		allwork.addTask(new TaskQdene("qm", 4));
		Employee.setAllWork(allwork);
		
		Employee[] workers = new Employee[5];
		workers[0] = new Employee("Pesho");
		workers[1] = new Employee("Gosho");
		workers[2] = new Employee("Zaki");
		workers[3] = new Employee("Mitko");
		workers[4] = new Employee("Ivan");
		int countDays = 0;
		
		while(true){
			for (int i = 0; i < workers.length; i++) {
				if(workers[i] != null){
					workers[i].work();
				}
			}
			countDays++;
			if(Employee.getAllWork().isAllWorkDone()){
				break;
			}
		}
		System.out.println("The employees completed the tasks for: " + countDays + " days!");
	}
	
}
