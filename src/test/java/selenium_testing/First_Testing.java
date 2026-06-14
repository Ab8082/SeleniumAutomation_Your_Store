package selenium_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Testing {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://qaplayground.com/practice/input-fields");
		
		driver.manage().window().maximize();
		
		
		
	}

}
