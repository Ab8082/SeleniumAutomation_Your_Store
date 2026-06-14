package logger;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LoggerClass {

	Logger logger = LogManager.getLogger(LoggerClass.class);

	WebDriver driver;

	@Parameters("url")
	@BeforeMethod
	public void BrowserStart(String url) {

		logger.info("Browser is launching");
		driver = new ChromeDriver();

		driver.get(url);
		driver.manage().window().maximize();
	}

	@Test
	public void LoginTest()

	{
		logger.info("user is able to launching");

		logger.error("This is error response code");

		logger.fatal("This is fatal response code");

		logger.debug("This is debug related response code");

		System.out.println("User is able to login");

		logger.warn("This is Warn related response code");

	}

	@AfterMethod
	public void BrowserStop() {

		driver.quit();

		logger.info("This is closing of browser");

	}

}
