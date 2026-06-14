package withoutPageFactory_POM_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_woPagefactoryObject {

	WebDriver driver;

	public Login_woPagefactoryObject(WebDriver d) {

		this.driver= d;

	}

	By UName = By.id("user-name");
	By Pwd = By.id("password");
	By loginbtn = By.id("login-button");

	public void enterUName(String username) {

		driver.findElement(UName).sendKeys(username);

	}

	public void enterpwd(String Password) {

		driver.findElement(Pwd).sendKeys(Password);

	}

	public void clickloginbtn() {
		
		driver.findElement(loginbtn).click();
	}
	
}

