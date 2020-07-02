package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person{
	
	private String schoolName;
	
	public Student() {
		this.setSchoolName("Rigas 777");
	}
	
	public Student(String schoolName) {
		setSchoolName(schoolName);
	}
	
	public Student(String firstName, String secondName, int age,String schoolName) {
		setFirstName(firstName);
		setSecondName(secondName);
		setAge(age);
		setSchoolName(schoolName);
	}
	
	public Student(Person person, String schoolName) {
		setFirstName(person.getFirstName());
		setSecondName(person.getSecondName());
		setAge(person.getAge());
		this.setSchoolName(schoolName);
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public String announce() {
		return "My name is " + getFirstName() + " " + getSecondName() + " and i am " + getAge() + " years old. \n"
				+ "I study in university " + getSchoolName();
	}
}
