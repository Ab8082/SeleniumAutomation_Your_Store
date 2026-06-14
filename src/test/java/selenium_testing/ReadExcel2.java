package selenium_testing;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws IOException, InvalidFormatException {

		XSSFWorkbook xw = new XSSFWorkbook();

		Sheet sheet = xw.createSheet("sheet_1");

		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);

		cell.setCellValue("Abhi");

		try {
			FileOutputStream fos = new FileOutputStream(
					"D:\\Selenium Preparation_28-11-2025\\Steps_Selenium\\Test data\\New_file.xlsx");

			xw.write(fos);
			System.out.println("File is successfully created");
		} catch (Exception e) {

			e.printStackTrace();
		}

		sheet.getRow(0).getCell(0).setCellValue("Abhi");

		xw.close();

	}

}
