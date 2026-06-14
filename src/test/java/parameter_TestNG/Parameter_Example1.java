package parameter_TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Example1 {

	@Parameters({ "i", "j" })
	@Test
	public void add(int a, int b) {

		System.out.println("Addition of a and b is " + (a + b));

	}

	@Parameters({ "i", "j" })
	@Test
	public void subs(int a, int b) {

		System.out.println("Subtraction of a and b is " + (a - b));

	}

	@Test
	@Parameters({ "i", "j" })
	public void multi(int a, int b) {

		System.out.println("Multiplication of a and b is " + (a * b));

	}

}
