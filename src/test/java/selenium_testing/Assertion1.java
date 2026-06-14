package selenium_testing;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Assertion1 {

	// Write a simple TestNG test to validate that the sum of two numbers is as
	// expected and print the result in the console.

	@Test
	void testAddition() {
		int a = 10;
		int b = 20;

		int Expected = 30;

		int actual = a + b;

		assertEquals(actual, Expected, "the sum is as not matched as expected.");

		System.out.println("The expected sum is " + Expected + "  Actual sum is " + actual);
	}

}
