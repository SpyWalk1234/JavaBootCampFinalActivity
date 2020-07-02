package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class FirstActivity {

	public static void main(String[] args) {

		// TODO 1 Create collection of employee (more than 5) list or map
		// System.out.println() result
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Alex", "Mooran", 38, 7, "Test Manager", "Accenture", 3500.00));
		employees.add(new Employee("Marty", "Daniels", 30, 3, "Senior Tester", "Accenture", 1500.00));
		employees.add(new Employee("Harman", "Todescu", 30, 5, "Performance Tester", "Accenture", 2100.00));
		employees.add(new Employee("Deniz", "Roy", 26, 4, "Lead Tester", "Accenture", 1800.00));
		employees.add(new Employee("Dean", "Simon", 23, 2, "Tester", "Accenture", 1100.00));
		employees.add(new Employee("Samuel", "Cachetore", 19, 1, "Junior Tester", "Accenture", 700.00));
		employees.add(new Employee("Ted", "Castle", 34, 6, "Test Architect", "Accenture", 2500.00));

		employees.forEach(emp -> {
			System.out.println(emp.announce());
		});
		System.out.println("--------------------------------------------------");
		System.out.println();

		// TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		// System.out.println() result
		ArrayList<Employee> filteredByMinSalary = (ArrayList<Employee>) employees.stream()
				.sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
		filteredByMinSalary.forEach(emp -> {
			System.out.println(emp.announce());
			System.out.println("Salary: " + emp.getSalary());
		});
		System.out.println("--------------------------------------------------");
		System.out.println();

		ArrayList<Employee> filteredByMaxSalary = (ArrayList<Employee>) employees.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
		filteredByMaxSalary.forEach(emp -> {
			System.out.println(emp.announce());
			System.out.println("Salary: " + emp.getSalary());
		});
		System.out.println("--------------------------------------------------");
		System.out.println();

		// TODO 3 create instance of a Student as a Person ->
		// than ask him introduce()
		// than make them Student
		// than ask him introduce()

		Person person = new Person("Leeroy", "Jenkins", 21);
		System.out.println(person.announce());
		Student student = new Student(person, "Coventry");
		System.out.println(student.announce());
		System.out.println("--------------------------------------------------");
		System.out.println();

		// TODO 4 Create method for full change of employee information
		// for example some employee change his work
		for (int i = 0; i < employees.size(); i++) {
			if (i % 2 != 0) employees.get(i).setCompanyName("CompanyZ-" + i);
		}
		employees.forEach(emp -> {
			System.out.println(emp.announce());
		});
	}
}
