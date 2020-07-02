package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee(){
    	this.empId = 0;
    	this.setJobTitle("Test Automation Engineer");
    	this.setCompanyName("Accenture");
    	this.setSalary(1200.99);
    }
    
    public Employee(int id, String jobTitle, String companyName, double salary){
    	setId(id);
    	setJobTitle(jobTitle);
    	setCompanyName(companyName);
    	setSalary(salary);
    }
    
    public Employee(String firstName, String secondName, int age, int id, String jobTitle, String companyName, double salary) {
    	setFirstName(firstName);
    	setSecondName(secondName);
    	setAge(age);
    	setId(id);
    	setJobTitle(jobTitle);
    	setCompanyName(companyName);
    	setSalary(salary);
    }

    //TODO 2 add getters and setters
    public void setId(int id) {
    	this.empId = id;
    }
    
    public int getId() {
    	return empId;
    }

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

    //TODO 3 override method announce()
	public String announce() {
		return "My name is " + getFirstName() + " " + getSecondName() + " and i am " + getAge() + " years old. \n"
				+ "I work as " + getJobTitle() + " in " + getCompanyName();
	}
}