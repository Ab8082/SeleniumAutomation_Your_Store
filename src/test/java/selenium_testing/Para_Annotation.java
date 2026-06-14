package selenium_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Para_Annotation {

	WebDriver driver;

	@Test
	@Parameters({ "UserName", "Password" })

	void loginMethod("UserName","Password") {

		driver = new ChromeDriver();

		driver.get("https://parabank.parasoft.com/parabank/register.htm");

		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys(UserName);
		driver.findElement(By.name("password")).sendKeys(Password);
		

	}


