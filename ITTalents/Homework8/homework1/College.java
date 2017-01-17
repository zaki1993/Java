
public class College {

	public static void main(String[] args) {
		Student zaki = new Student("zaki", 20, "Math");
		Student pesho = new Student("pesho", 20, "Math");
		Student gosho = new Student("gosho", 21, "Math");
		Student mitko = new Student("mitko", 22, "Math");
		
		mitko.receiveScholarship(3.5, 1500);
		zaki.upYear();
		gosho.upYear();
		
		StudentGroup nerds = new StudentGroup("Math");
		nerds.addStudent(zaki);
		nerds.addStudent(gosho);
		
		StudentGroup playaas = new StudentGroup("Math");
		playaas.addStudent(pesho);
		playaas.addStudent(mitko);
		
		System.out.println("Nerds best student is " + nerds.bestStudent());
		System.out.println("Playaas best studet is " + playaas.bestStudent());
		
	}

}
