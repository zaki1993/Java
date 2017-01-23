
public class Demo {
	public static void main(String[] args){
		Person[] group = new Person[10];
		Person zaki = new Person("Zaki", 20, true);
		Person gosho = new Person("Gosho", 17, true);
		Student ivan = new Student();
		Student pesho = new Student("Pesho", 22, true, 4);
		Employee mariika = new Employee("Mariika", 19, false, 30.4);
		Employee ivancho = new Employee("ivancho", 19, true, 20.5);
		group[0] = zaki;
		group[1] = gosho;
		group[2] = ivan;
		group[3] = pesho;
		group[4] = mariika;
		group[5] = ivancho;
		
		for (int i = 0; i < 6; i++) {
			if(group[i] instanceof Student){
				((Student)group[i]).showStudentInfo();
			}
			else if(group[i] instanceof Employee){
				((Employee)group[i]).showEmployeeInfo();
			}
			else{
				group[i].showPersonInfo();
			}
		}
		
		for (int i = 0; i < 6; i++) {
			if(group[i] instanceof Employee){
				double res = ((Employee)group[i]).calculateOvertime(2);
				System.out.println(res);
			}
		}
	}
	
}
