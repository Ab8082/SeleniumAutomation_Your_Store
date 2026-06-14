package pageObjectModel_TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import withoutPageFactory_POM_Example.Login_woPagefactoryObject;

public class LoginTest {

	WebDriver driver ;

	Login_woPagefactoryObject loginpage;

	@BeforeMethod
	public void OpenBrowser() {

		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}

	@Test
	public void login() {
		loginpage = new Login_woPagefactoryObject(driver);

		loginpage.enterUName("standard_user");
		loginpage.enterpwd("secret_sauce");
		loginpage.clickloginbtn();

	}

	public void teardown() {

//		driver.quit();

	}

}
