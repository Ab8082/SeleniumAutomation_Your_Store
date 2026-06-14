package selenium_testing;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SignUp_ParaBank {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://parabank.parasoft.com/parabank/register.htm");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.id("customer.firstName")).sendKeys("Abhishek");

		driver.findElement(By.name("customer.lastName")).sendKeys("Test");

		driver.findElement(By.id("customer.address.street")).sendKeys("Sathe Nagar");

		driver.findElement(By.id("customer.address.city")).sendKeys("Thane");

		driver.findElement(By.id("customer.address.state")).sendKeys("Maharshatra");

		driver.findElement(By.id("customer.address.zipCode")).sendKeys("400604");

		driver.findElement(By.id("customer.phoneNumber")).sendKeys("1212121212");

		try {

			driver.findElement(By.id("customer.username")).sendKeys("Abhi1");

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		driver.findElement(By.id("customer.ssn")).sendKeys("a123");

		driver.findElement(By.id("customer.password")).sendKeys("Password");

		driver.findElement(By.id("repeatedPassword")).sendKeys("Password");

		driver.findElement(By.xpath("//input[@value='Register']")).click();

		String Exepected = "Your account was created successfully. You are now logged in.";

		String Actual = driver
				.findElement(By.xpath("//p[text()='Your account was created successfully. You are now logged in.']"))
				.getText();

		try {
			assertEquals(Actual, Exepected, "Account is not created");
			System.out.println("Account successfully created");
		}

		catch (Exception e) {
			e.printStackTrace();

		}

	}

}
