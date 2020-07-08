package report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportManager {

	public static ExtentReports report;

	public static ExtentReports generateReport() {
		String path = System.getProperty("user.dir");
		if (report == null) {
			report = new ExtentReports();
			ExtentSparkReporter reporter = new ExtentSparkReporter(path + "/extentReport");
			reporter.config().setDocumentTitle("Testing Report");
			reporter.config().setEncoding("utf-8");
			reporter.config().setReportName("Automation Test Results");
			reporter.config().setTheme(Theme.DARK);

			report.attachReporter(reporter);
		}
		return report;
	}
}
