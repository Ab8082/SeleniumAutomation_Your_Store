package basic_extent_reports;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import extent_report_package.ExtentReportManager;

public class ExtendReportDemo {

	ExtentReportManager ex = new ExtentReportManager();

	@BeforeMethod
	void intilisation() {

		ex.getReports();
		
		
		
	}

	@Test
	public void Reports1() {

		ExtentTest test = extent.createTest("Login Test");
		test.log(Status.INFO, "Starting Login Test case");
		Assert.assertTrue(true);

		test.log(Status.PASS, "Login Test Passed");

		test.log(Status.SKIP, "skipping the test");

		// Assert.assertTrue(false);

		test.log(Status.FAIL, "test is failed");

		extent.flush();

	}

}
