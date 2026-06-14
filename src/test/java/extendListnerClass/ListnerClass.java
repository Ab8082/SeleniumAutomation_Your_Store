package extendListnerClass;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnerClass implements ITestListener {

	ExtentReports report;
	ExtentSparkReporter htmlreporter;
	ExtentTest test;

	public void configuration() {

		htmlreporter = new ExtentSparkReporter("Reports/TestExecutionReport.html");
		report = new ExtentReports();

	    report.attachReporter(htmlreporter);

		
		htmlreporter.config().setDocumentTitle("UAT Automation Report");
		htmlreporter.config().setTheme(Theme.DARK);
		htmlreporter.config().setReportName("UAT Testing Reports");
		htmlreporter.config().setEncoding("utf-8");

		report.setSystemInfo("Machin", "PC1");
		report.setSystemInfo("OS", "Windows11");
		report.setSystemInfo("UserName", "TestAbhi");

	}

	@Override
	public void onStart(ITestContext result) {

		configuration();
		System.out.println("this is Listner OnStart Method " + result.getName());

	}

	@Override
	public void onFinish(ITestContext result) {

		System.out.println("this is Listner Onfinish Method " + result.getName());
		report.flush();

	}

	@Override
	public void onTestStart(ITestResult result) {

		System.out.println("this is Listner OnTest Start Method " + result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("this is  Listner OnTestpass/success Method " + result.getName());

		test = report.createTest(result.getName());

		test.log(Status.PASS, MarkupHelper.createLabel("The Test Case Name is " + result.getName(), ExtentColor.GREEN));

	}

	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println("this is Listner OnTest fail Method " + result.getName());

		test = report.createTest(result.getName());

		test.log(Status.FAIL, MarkupHelper.createLabel("The Test Case Name is  " + result.getName(), ExtentColor.RED));

	}

	@Override
	public void onTestSkipped(ITestResult result) {

		System.out.println("this is Listner OnTest skip Method " + result.getName());

		test = report.createTest(result.getName());

		test.log(Status.SKIP,
				MarkupHelper.createLabel("The test Case Name is " + result.getName(), ExtentColor.YELLOW));

		
	//	TakesScreenshot
//		RemoteWebDriver
		
	}

}
