package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {


	//TODO try to achieve 100% of test coverage

	private SecondActivity theCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		theCalculator = new SecondActivity();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testGetSumPositiveValue() {
		assertEquals(15, theCalculator.getSum(5, 10));
		assertEquals(15, theCalculator.getSum(10, 5));
	}

	@Test
	public void testGetSumNegativeValue() {
		assertEquals(-5, theCalculator.getSum(5, -10));
		assertEquals(-20, theCalculator.getSum(-10, -10));
	}
	
	@Test
	public void testGetSubtractPositiveValue() {
		assertEquals(10, theCalculator.getSubtract(20, 10));
		assertEquals(-30, theCalculator.getSubtract(-20, 10));
		assertEquals(-20, theCalculator.getSubtract(0, 20));
		assertEquals(0, theCalculator.getSubtract(0, 0));
	}
	
	@Test
	public void testGetSubtractNegativeValue() {
		assertEquals(20, theCalculator.getSubtract(0, -20));
	}
	
	@Test
	public void testGetMultiplyPositiveValue() {
		assertEquals(25, theCalculator.getMultiply(5, 5));
		assertEquals(-10, theCalculator.getMultiply(-1, 10));
	}

	@Test
	public void testGetMultiplyNegativeValue() {
		assertEquals(20, theCalculator.getMultiply(-2, -10));
		assertEquals(-20, theCalculator.getMultiply(2, -10));
	}
	
	@Test
	public void testGetMultiplyZeroValue() {
		assertEquals(0, theCalculator.getMultiply(-10, 0));
		assertEquals(0, theCalculator.getMultiply(10, 0));	
		assertEquals(0, theCalculator.getMultiply(0, 0));	
	}
	
	@Test
	public void testGetDividePositiveValue() {
		assertEquals(5, theCalculator.getDivide(10, 2));
		assertEquals(1, theCalculator.getDivide(12, 12));
		assertEquals(0, theCalculator.getDivide(0, 12));
	}
	
	@Test
	public void testGeDivideNegativeValue() {
		assertEquals(-2, theCalculator.getDivide(6, -3));
		assertEquals(3, theCalculator.getDivide(-18, -6));
		assertEquals(0, theCalculator.getDivide(0, -6));
	}
	
	@Test
	public void testGetDivideZeroValue() {
		try {
			theCalculator.getDivide(12, 0);
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
			assertEquals("Impossible to devide by 0", e.getMessage());
		}
	}
}

