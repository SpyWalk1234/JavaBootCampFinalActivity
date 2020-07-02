package sef.ATestTask.FirstActivity;

import java.util.regex.Pattern;

public class Person {

//TODO 1 Implement Person Attributes

	private String firstName;
	private String secondName;
	private int age;

	//Behavior - default constructor
	public Person(){
		this.firstName="Unknown";
		this.secondName = "Unknown";
		this.age = 0;
	}

	//Behavior - parameterized constructor
	public Person(String firstName, String secondName, int age){
		setFirstName(firstName);
		setSecondName(secondName);
		setAge(age);
	}

	// getter for String firstName
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (Pattern.matches("[a-zA-Z]+", firstName)) {
			this.firstName = firstName;
		} else {
			throw new CustomExceptionActivity();
		}
	}

	// getter for int age
	public int getAge() {
		return age;
	}

	// setter for int age
	public void setAge(int age) {
		this.age = age;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		if (secondName.contains("[a-zA-Z]") == false) {
			this.secondName = secondName;
		} else {
			throw new CustomExceptionActivity();
		}
	}

	//TODO 2 add all person info into announce() method
	public String announce() {
		return "My name is " + getFirstName() + " " + getSecondName() + " and i am " + getAge() + " years old";
	}
}

