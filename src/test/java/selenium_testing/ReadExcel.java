package selenium_testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

		// specify the path of file
		File src = new File("D:\\Selenium Preparation_28-11-2025\\Steps_Selenium\\Test data\\Details.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook xf = new XSSFWorkbook(fis);

		System.out.println("first sheet name : " + xf.getSheetName(0));

		try {

			System.out.println("second Sheet Name " + xf.getSheetName(1));

		} catch (Exception e) {

			System.out.println("Sheet not available");
		}

		// XSSFSheet xs= new XSSFSheet(xf);
		XSSFSheet xs = xf.getSheetAt(0);

		// return exact Number
		System.out.println("Total rows are:" + xs.getPhysicalNumberOfRows());

		//
		System.out.println("Total column are : " + xs.getRow(0).getPhysicalNumberOfCells());

		System.out.println("Third row data is " + xs.getRow(3).getCell(0).getStringCellValue());

		System.out.println("Total column are : " + xs.getRow(0).getLastCellNum());

		xf.createSheet("Sheet2");

		try {
			xf.cloneSheet(0, "Clone1Sheet");
			System.out.println("Sheet is successfully created");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Sheet is not created");
		}

		FileOutputStream fos = new FileOutputStream(src);

		xf.write(fos);

		fos.close();



		/*
		 * WebDriver driver= new ChromeDriver() ;
		 * 
		 * driver.get("https://parabank.parasoft.com/parabank/register.htm");
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * String s = xs.getRow(2).getCell(0).getStringCellValue();
		 * 
		 * driver.findElement(By.name("username")).sendKeys(s);
		 */

	}

}
