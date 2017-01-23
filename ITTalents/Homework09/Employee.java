
public class Employee extends Person {
	private double daySalary;
	
	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		this.daySalary = daySalary;
	}
	
	public double calculateOvertime(double hours){
		if(this.getAge() < 18){
			return 0;
		}
		return hours*daySalary*1.5;
	}
	
	public double getDaySalary(){
		return this.getDaySalary();
	}
	
	public void showEmployeeInfo(){
		super.showPersonInfo();
		System.out.println("daySalary: " + this.daySalary);
	}
}
