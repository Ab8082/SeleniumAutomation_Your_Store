package parameter_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleSearch {

	WebDriver driver;

	@Parameters({ "BrowserURL" })
	@BeforeClass
	public void OpenBrowser(String url) {

		driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();

	}

	@Test
	@Parameters("Searchvalue")
	public void search(String Searchdata) {

		WebElement wb = driver.findElement(By.name("q"));

		wb.sendKeys(Searchdata);

		String Actual = wb.getAttribute("value");

		System.out.println(Actual);
		
		Assert.assertEquals(Searchdata, Actual);
	}

	@AfterClass
	public void testclose() {
		driver.quit();
	}

}