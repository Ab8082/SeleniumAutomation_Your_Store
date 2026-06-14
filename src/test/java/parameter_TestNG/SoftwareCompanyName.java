package parameter_TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SoftwareCompanyName {

	@Test
	@Parameters({ "Software" })
	public void CompanyName(String Name) {

		System.out.println("The Software Company Name is :" + Name);

	}
}