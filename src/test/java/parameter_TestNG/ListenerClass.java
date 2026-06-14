package parameter_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerClass {

	WebDriver driver = new ChromeDriver();

	@Test
public	void login() {

		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();

		WebElement wb1 = driver.findElement(By.id("user-name"));

		wb1.sendKeys("standard_user");

		WebElement wb2 = driver.findElement(By.id("password"));

		wb2.sendKeys("secret_sauce");

		driver.findElement(By.id("login-button")).click();

		String Actual = driver.getTitle();

		String expected = "Swag Labs";

		Assert.assertEquals(Actual, expected);

	}

}
