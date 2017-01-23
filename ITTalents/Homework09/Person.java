
public class Person {
	private String name;
	private int age;
	private boolean isMale;
	
	Person(String name, int age, boolean isMale){
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public boolean getIsMale(){
		return this.isMale;
	}

	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		if(age > 0){
			this.age = age;
		}
	}
	
	public void setMale(boolean isMale){
		this.isMale = isMale;
	}
	
	public void showPersonInfo(){
		System.out.println("Name: " + this.name + " , Age: " + this.age + " , isMale: "  + this.isMale );
	}
}
