package com.abhishek.tdd;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

	Calculator calculatorTest;

	@Before
	public void setUp() throws Exception {
		calculatorTest = new Calculator();
	}

	// @Test annotation supports two optional parameters
	// 1. expected=NullPointerException.class
	// 2. timeout=300 (milliseconds)

	@Test
	public void testAdd() { // the name of the method here has to be
							// test+<method being tested>

		// Java addition
		long result = 25 + 19 + 9 + (-5);
		// Compare that to what the Calculator gives us

		assertEquals(result, calculatorTest.add(25, 19, 9, -5));

		result = 100 + 400;
		assertEquals(result, calculatorTest.add(100 + 400));

		result = 0;
		assertEquals(result, calculatorTest.add(0));

	}

	@Test
	public void testSubtract() {

		long result = 200 - 45 - (-4) - 36;

		assertEquals(result, calculatorTest.subtract(200, 45, -4, 36));

		result = 0;

		assertEquals(result, calculatorTest.subtract(0, 0, 0, 0));

	}

	@Test
	public void testDivide() {

		int result = 5 / 3;

		assertEquals(result, calculatorTest.divide(5, 3));

		try {
			assertEquals(result, calculatorTest.divide(5, 0));

			// if the line above does not throw an exception then the line below
			// will fail the test case
			fail("Expected this to throw ArithmeticException");

			/*
			 * Since JUnit4, there is a more elegant way to test that an
			 * exception is being thrown: Use the
			 * annotation @Test(expected=IndexOutOfBoundsException.class)
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
