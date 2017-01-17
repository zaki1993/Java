
public class StudentGroup {
	private String groupSubject;
	private Student[] students;
	private int freePlaces;
	
	public StudentGroup(){
		this.students = new Student[5];
		this.freePlaces = 5;
	}
	
	public StudentGroup(String subject){
		this();
		this.groupSubject = subject;
	}
	
	public void addStudent(Student newStudent){
		if(newStudent.getSubject() != this.groupSubject || this.freePlaces == 0){
			return;
		}
		int index = this.students.length - this.freePlaces;
		this.students[index] = newStudent;
		this.freePlaces--;
	}
	
	public void emptyGroup(){
		this.students = new Student[5];
		this.freePlaces = 5;
	}
	
	public String bestStudent(){
		int index = 0;
		for (int i = 0; i < this.students.length - this.freePlaces; i++) {
			if(this.students[i].getGrade() > this.students[index].getGrade()){
				index = i;
			}
		}
		return (this.students[index].getName());
	}
	
	public void printStudentsInGroup(){
		for (int i = 0; i < this.students.length - this.freePlaces; i++) {
			System.out.println("Name: " + this.students[i].getName() +
							   "Subject: " + this.students[i].getSubject() + 
							   "Grade: " + this.students[i].getGrade() +
							   "Year in college: " + this.students[i].getYearInCollege() +
							   "Age: " + this.students[i].getAge() + 
							   "Degree: " + this.students[i].isDegree() + 
							   "Money: " + this.students[i].getMoney());
		}
	}
}
