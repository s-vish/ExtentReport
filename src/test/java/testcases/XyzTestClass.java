package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import report.ReportManager;

public class XyzTestClass {

	ExtentReports report;
	ExtentTest test;
	
	@BeforeMethod
	public void init()
	{
		report = ReportManager.generateReport();
		test = report.createTest("Testing Xyz");
	}
	
	@AfterMethod
	public void tearDown()
	{
		report.flush();
	}
	
	
	@Test
	public void testXyz()
	{
		test.log(Status.INFO, "Executing xyz");
		test.log(Status.PASS, "test passed.");
	}
}
