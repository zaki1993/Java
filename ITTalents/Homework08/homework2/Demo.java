
public class Demo {

	public static void main(String[] args) {
		Employee pesho = new Employee("Pesho Prashtinata");
		Employee gosho = new Employee("");
		Employee tosho = new Employee("  ");
		Employee misho = new Employee("Misho Smoka");
		Task variRakiq= new Task("Vari Rakiq", 35);
		Task degustaciq = new Task("Degustira rakiqta", 62);
		pesho.showReport();
		gosho.showReport();
		tosho.showReport();
		misho.showReport();
		pesho.setTask(variRakiq);
		gosho.setTask(variRakiq);
		tosho.setTask(degustaciq);
		misho.setTask(degustaciq);
		pesho.work();
		gosho.work();
		tosho.work();
		misho.work();
		pesho.showReport();
		misho.showReport();
		pesho.setHourLeft(8);
		gosho.setHourLeft(8);
		tosho.setHourLeft(8);
		misho.setHourLeft(8);
		pesho.work();
		gosho.work();
		tosho.work();
		misho.work();
		pesho.showReport();
		misho.showReport();
		pesho.setHourLeft(8);
		gosho.setHourLeft(8);
		tosho.setHourLeft(8);
		misho.setHourLeft(8);
		pesho.work();
		gosho.work();
		tosho.work();
		misho.work();
		pesho.showReport();
		misho.showReport();
		
		System.out.println("    ".split(" ").length);
	}

}
