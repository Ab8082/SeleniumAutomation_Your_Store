package parameter_TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AutoMobileCompany {

	@Test
	@Parameters({ "AutoMobile" })
	public void CompanyName(String Name) {

		System.out.println("Automobile Company Name is :" + Name);

	}

}
