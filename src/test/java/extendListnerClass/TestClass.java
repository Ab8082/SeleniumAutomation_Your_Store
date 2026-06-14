package extendListnerClass;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestClass {

	@BeforeClass
	public void Method1() {
		System.out.println("This is Before class Method");

	}

	@BeforeMethod
	public void Method2() {
		System.out.println("This is Before method Method");

	}

	@Test
	public void Method3() {

		System.out.println("This is test method 1");
		Assert.assertTrue(true);

	}

	@Test
	public void Method4() {

		System.out.println("This is test method 2");
		Assert.assertTrue(false);

	}

	@Test
	public void Method5() {

		System.out.println("This is test method 3");
		Assert.assertTrue(false);

	}

	@Test
	public void Method6() {

		System.out.println("This is test method 4");
		Assert.assertTrue(true);

	}

	@Test
	public void Method7() {

		System.out.println("This is test method 5");

		throw new SkipException("Skipping the method");

	}

	@AfterMethod
	public void Method8() {

		System.out.println("This is aftermethod method");

	}

	@AfterClass
	public void Method9() {

		System.out.println("This is after class method ");

	}

}
