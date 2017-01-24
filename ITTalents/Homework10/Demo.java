
public class Demo {

	public static void main(String[] args) {
		AllWork allwork = new AllWork(12);
		
		allwork.addTask(new Task("Smqtane", 3));
		allwork.addTask(new Task("Qdene", 1));
		allwork.addTask(new Task("Spane", 12));
		allwork.addTask(new Task("Uchene", 9));
		allwork.addTask(new Task("Tichane", 4));
		allwork.addTask(new Task("Hakvane", 24));
		allwork.addTask(new Task("Bombandirane", 17));
		allwork.addTask(new Task("Qdene", 2));
		allwork.addTask(new Task("Piene", 10));
		allwork.addTask(new Task("Pazaruvane", 3));
		allwork.addTask(new Task("Murzeluvane", 5));
		allwork.addTask(new Task("Chistene", 8));
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
