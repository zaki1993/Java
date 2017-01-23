
public class Student extends Person{
	private double score;
	
	Student(){
		// Отговор на въпроса
		// Мисля че по този начин става
		super("Pesho", 222, true);
		this.score = 2;
	}
	
	Student(String name, int age, boolean isMale, double score){
		super(name, age, isMale);
		this.score = score;
	}
	
	public double getScore(){
		return this.score;
	}
	
	public void showStudentInfo(){
		super.showPersonInfo();
		System.out.println("Score: " + this.score);
	}
}
