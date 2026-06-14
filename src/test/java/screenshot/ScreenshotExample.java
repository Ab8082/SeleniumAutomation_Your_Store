package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import java.nio.file.Files;

public class ScreenshotExample {

	WebDriver driver;

	@BeforeClass
	public void setup() {

		driver = new ChromeDriver();

		driver.get("https://automationteststore.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void screenshot() {

		driver.findElement(By.linkText("Login or register")).click();

		TakesScreenshot screenshot = (TakesScreenshot) driver;

		File scr = screenshot.getScreenshotAs(OutputType.FILE);

		File Dest = new File(System.getProperty("user.dir") + "/Reports/FullReportscreenshot.png");

		try {
			Files.copy(scr.toPath(), Dest.toPath());
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	@Test
	public void SectionScreenshot() throws IOException {

		WebElement Section = driver.findElement(By.linkText("MEN"));

		Section.click();

		File Src = Section.getScreenshotAs(OutputType.FILE);

		File desc = new File(System.getProperty("user.dir") + "/Reports/SectionScreenshot.png");

		Files.copy(Src.toPath(), desc.toPath());

	}

}
