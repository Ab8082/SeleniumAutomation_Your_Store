package parameter_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderex1 {

	WebDriver driver;

	@DataProvider(name = "Logindata")
	public Object[][] testData() {
		Object arr[][] = new Object[3][2];

		arr[0][0] = "standard_user";
		arr[0][1] = "secret_sauce";

		arr[1][0] = "locked_out_user";
		arr[1][1] = "secret_sauce";

		arr[2][0] = "problem_user";
		arr[2][1] = "secret_sauce";

		return arr;
	}

	@Parameters({ "Broswerurl" })
	@BeforeMethod
	public void login(String url) {

		driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();
	}

	@Test(dataProvider = "Logindata")
	public void loginDemo(String username, String password) throws InterruptedException {

		WebElement wb1 = driver.findElement(By.id("user-name"));
		wb1.sendKeys(username);

		WebElement wb2 = driver.findElement(By.id("password"));

		wb2.sendKeys(password);

		driver.findElement(By.id("login-button")).click();

		WebElement wb3 = driver.findElement(By.xpath("//div[text()='Swag Labs']"));


		String Actual = wb3.getText();

		String expected = "Swag Labs";

		Assert.assertEquals(Actual, expected);

	}

	@AfterMethod
	public void testclose() {

		driver.quit();
	}
}
