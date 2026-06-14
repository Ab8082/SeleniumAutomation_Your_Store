package pageObjectModel_TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageFactory_POM_example.LoginPageObject;

public class LoginTest2 {

	WebDriver driver;

	LoginPageObject loginpage;

	@Parameters("url")
	@BeforeMethod
	public void OpeningBrowser(String url) {

		driver = new ChromeDriver();

		driver.get(url);

	}

	@Test
	@Parameters({ "username", "Password" })
	public void logintest(String Username, String password) {

		loginpage = new LoginPageObject(driver);

		loginpage.enteruname(Username);
		loginpage.enterpwd(password);
		loginpage.loginclick();

	}

	@AfterMethod
	public void teardown() {

		// driver.quit();
	}
}
