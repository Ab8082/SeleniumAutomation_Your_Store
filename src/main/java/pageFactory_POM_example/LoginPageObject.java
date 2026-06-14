package pageFactory_POM_example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {

	WebDriver driver;

	public LoginPageObject(WebDriver d) 
	{

		this.driver = d;

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "user-name")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "login-button")
	WebElement loginbtn;

	public void enteruname(String uname) {
		username.sendKeys(uname);
	}

	public void enterpwd(String pwd) {
		password.sendKeys(pwd);

	}

	public void loginclick() {

		loginbtn.click();
	}

}
