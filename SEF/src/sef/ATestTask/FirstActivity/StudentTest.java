package sef.ATestTask.FirstActivity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentTest {
	
	@Test
	public void checkDefaultContainer() {
		Student std = new Student();
		assertEquals("Rigas 777", std.getSchoolName());
	}
	
	@Test
	public void checkSingleInputConstructor() {
		Student std = new Student("RTU");
		assertEquals("RTU", std.getSchoolName());
	}
	
	@Test
	public void checkFullConstructor() {
		Student std = new Student("Johnny", "Bravo", 17, "RTU");
		assertEquals("Johnny", std.getFirstName());
		assertEquals("Bravo", std.getSecondName());
		assertEquals(17, std.getAge());
		assertEquals("RTU", std.getSchoolName());
	}
	
	@Test
	public void checkPersonConstructor() {
		Person testPerson = new Person("Janis", "Boss", 100);
		Student std = new Student(testPerson, "LU");
		assertEquals("Janis", testPerson.getFirstName());
		assertEquals("Boss", testPerson.getSecondName());
		assertEquals(100, testPerson.getAge());
		assertEquals("LU", std.getSchoolName());
	}
	
	@Test
	public void checkGetterSetters() {
		Student std = new Student();
		std.setSchoolName("RTU");
		assertEquals("RTU", std.getSchoolName());
	}
	
	@Test
	public void checkAnnounce() {
		Student std = new Student("Johnny", "Bravo", 17, "RTU");
		assertEquals("My name is Johnny Bravo and i am 17 years old. \n"
				+ "I study in university RTU", std.announce());
	}
}
