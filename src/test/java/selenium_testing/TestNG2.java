package selenium_testing;

import org.testng.annotations.Test;

public class TestNG2 {

	@Test
	void aMethod() {

		System.out.println("This is a method");

	}

	@Test(enabled = false)
	void bMethod() {

		System.out.println("This is b Method");

	}

	@Test
	void cMethod() {
		System.out.println("This is c method");

	}

}
