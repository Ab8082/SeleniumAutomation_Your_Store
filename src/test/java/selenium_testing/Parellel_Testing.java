package selenium_testing;

import org.testng.annotations.Test;

public class Parellel_Testing {

	@Test
	void aMethod() throws InterruptedException {

		Thread.sleep(1000);

		System.out.println("This is a method");

	}

	@Test
	void bMethod() throws InterruptedException {

		Thread.sleep(10000);
		System.out.println("This is b Method");

	}

	@Test
	void cMethod() throws InterruptedException {

		Thread.sleep(5000);
		System.out.println("This is c method");

	}

}
