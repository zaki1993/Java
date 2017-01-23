
public class Student {
	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;
	
	public Student(){
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}
	
	public Student(String name, int age, String subject){
		this();
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	public void upYear(){
		if(this.isDegree){
			return;
		}
		if(++this.yearInCollege == 4){
			this.isDegree = true;
		}
	}
	
	public double receiveScholarship(double min, double amount){
		if(this.grade >= min && age < 30){
			this.money += amount;
		}
		return this.money;
	}
	
	public boolean isDegree(){
		return this.isDegree;
	}
	
	public double getMoney(){
		return this.money;
	}
	
	public String getSubject(){
		return this.subject;
	}
	
	public String getName(){
		return this.name;
	}
	
	public double getGrade(){
		return this.grade;
	}
	
	public int getYearInCollege(){
		return this.yearInCollege;
	}
	
	public int getAge(){
		return this.age;
	}
}
