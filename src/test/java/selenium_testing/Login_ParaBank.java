package selenium_testing;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.ConfigReader;

public class Login_ParaBank {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();

		ConfigReader cr = new ConfigReader();

		driver.get(cr.getUrl());

		driver.manage().window().maximize();

		driver.findElement(By.name("username")).sendKeys(cr.getUserName());

		driver.findElement(By.name("password")).sendKeys(cr.getPassWord());

		driver.findElement(By.xpath("//input[@value='Log In']")).click();

		
		//driver.close();
	}

}
