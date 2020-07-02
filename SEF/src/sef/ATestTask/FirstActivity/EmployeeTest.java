package sef.ATestTask.FirstActivity;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class EmployeeTest {

	@Test
	public void checkDefaultConstructor() {
		Employee emp = new Employee();
		assertEquals(0, emp.getId());
		assertEquals("Test Automation Engineer", emp.getJobTitle());
		assertEquals("Accenture", emp.getCompanyName());
		assertEquals(1200.99, emp.getSalary(), 0);
	}
	
	@Test
	public void checkEmployeeConstructor() {
		Employee emp = new Employee(99, "Tester", "LMT", 999.99);
		assertEquals(99, emp.getId());
		assertEquals("Tester", emp.getJobTitle());
		assertEquals("LMT", emp.getCompanyName());
		assertEquals(999.99, emp.getSalary(), 0);
	}
	
	@Test
	public void checkFullConstructor() {
		Employee emp = new Employee("Alex", "Mooran", 21, 99, "Tester", "LMT", 999.99);
		assertEquals("Alex", emp.getFirstName());
		assertEquals("Mooran", emp.getSecondName());
		assertEquals(21, emp.getAge());
		assertEquals(99, emp.getId());
		assertEquals("Tester", emp.getJobTitle());
		assertEquals("LMT", emp.getCompanyName());
		assertEquals(999.99, emp.getSalary(), 0);
	}
	
	@Test
	public void checkGettersSetters() {
		Employee emp = new Employee();
		emp.setId(0);
		emp.setCompanyName("Accenture");
		emp.setJobTitle("Tester");
		emp.setSalary(1000.00);
		assertEquals(0, emp.getId());
		assertEquals("Tester", emp.getJobTitle());
		assertEquals("Accenture", emp.getCompanyName());
		assertEquals(1000.00, emp.getSalary(), 0);
	}

	@Test
	public void checkAnnounce() {
		Employee emp = new Employee("Alex", "Mooran", 21, 99, "Tester", "LMT", 999.99);
		assertEquals("My name is Alex Mooran and i am 21 years old. \n"
				+ "I work as Tester in LMT", emp.announce());
	}
}