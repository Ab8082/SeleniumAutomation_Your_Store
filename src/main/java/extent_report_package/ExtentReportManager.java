package extent_report_package;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {

	ExtentReports extent=  new ExtentReports();
	ExtentSparkReporter report;
	ExtentTest test;

	public void getReports() {

		if (extent == null) {

//			extent = new ExtentReports();

			report = new ExtentSparkReporter(System.getProperty("user.dir") + "/ReportsExtent.html");

			report.config().setReportName("Automation Testing");

			report.config().setDocumentTitle("Repot");
			report.config().setTheme(Theme.STANDARD);

			report.config().setEncoding("utf-8");

			extent.attachReporter(report);

		}

	}

}
