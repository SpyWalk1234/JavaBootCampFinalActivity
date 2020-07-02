package sef.ATestTask.FirstActivity;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PersonTest{
    
	@Test
	public void checkDefaultValues() {
		Person testPerson = new Person();
		assertEquals("Unknown", testPerson.getFirstName());
		assertEquals("Unknown", testPerson.getSecondName());
		assertEquals(0, testPerson.getAge());
	}
	
	@Test
	public void checkInputConstructor() {
		Person testPerson = new Person("Janis", "Boss", 100);
		assertEquals("Janis", testPerson.getFirstName());
		assertEquals("Boss", testPerson.getSecondName());
		assertEquals(100, testPerson.getAge());
	}
	
	@Test
	public void checkGeters() {
		Person testPerson = new Person();
		testPerson.setFirstName("Janis");
		testPerson.setSecondName("Boss");
		testPerson.setAge(100);
		assertEquals("Janis", testPerson.getFirstName());
		assertEquals("Boss", testPerson.getSecondName());
		assertEquals(100, testPerson.getAge());
	}
	
	@Test
	public void checkIntroduction() {
		Person testPerson = new Person("Janis", "Boss", 100);
		assertEquals("My name is Janis Boss and i am 100 years old", testPerson.announce());
	}
	
	@Test
	public void checkNumberInputIntoFirstName() {
		Person testPerson = new Person();
		try {
			testPerson.setFirstName("Ivan3");
		} catch (CustomExceptionActivity e) {
			assertEquals("Impossible to add numbers inside the text", e.getMessage());
		}
	}
	
	@Test
	public void checkNumberInputIntoSecondName() {
		Person testPerson = new Person();
		try {
			testPerson.setSecondName("Ivan3");
		} catch (CustomExceptionActivity e) {
			assertEquals("Impossible to add numbers inside the text", e.getMessage());
		}
	}
}
