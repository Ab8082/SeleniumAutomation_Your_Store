package selenium_testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {

	@BeforeSuite
	void a() {

		System.out.println("This is Before suit method");
	}

	@AfterClass
	void b() {

		System.out.println("this is after class method");
	}

	@Test
	void acccb() {
		System.out.println("This is first test method");
	}

	@BeforeMethod
	void d() {

		System.out.println("Ths is before Method");
	}

	@AfterTest
	void e() {
		System.out.println("This is after Test Method");
	}

	@BeforeClass
	void f() {

		System.out.println("This is Before class Method");
	}

	@BeforeTest
	void g() {

		System.out.println("THis is Before Test Method");
	}

	@Test
	void accca() {
		System.out.println("This is second test method");
	}
	
	@AfterSuite
	void i() {
		
		System.out.println("This is After suit method");
	}

	@AfterMethod
	void j() {
		System.out.println("This is After Method ");
	}

}
