
public class Demo {

	public static void main(String[] args) {

		Employee.allwork.addTask(new Task("Smqtane", 3));
		Employee.allwork.addTask(new Task("Qdene", 1));
		Employee.allwork.addTask(new Task("Spane", 12));
		Employee.allwork.addTask(new Task("Uchene", 9));
		Employee.allwork.addTask(new Task("Tichane", 4));
		Employee.allwork.addTask(new Task("Hakvane", 24));
		Employee.allwork.addTask(new Task("Bombandirane", 17));
		Employee.allwork.addTask(new Task("Qdene", 2));
		Employee.allwork.addTask(new Task("Piene", 10));
		Employee.allwork.addTask(new Task("Pazaruvane", 3));
		Employee.allwork.addTask(new Task("Murzeluvane", 5));
		Employee.allwork.addTask(new Task("Chistene", 8));
		
		Employee[] workers = new Employee[5];
		workers[0] = new Employee("Pesho");
		workers[1] = new Employee("Gosho");
		workers[2] = new Employee("Zaki");
		workers[3] = new Employee("Mitko");
		workers[4] = new Employee("Ivan");
		int countDays = 0;
		
		while(!Employee.allwork.isAllWorkDone()){
			for (int i = 0; i < workers.length; i++) {
				if(workers[i] != null){
					workers[i].work();
				}
			}
			countDays++;
		}
		System.out.println("The employees completed the tasks for: " + countDays + " days!");
	}
	
}
