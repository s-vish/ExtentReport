package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import report.ReportManager;

public class AbcTestClass {

	ExtentReports report;
	ExtentTest test;

	@BeforeMethod
	public void init() {
		report = ReportManager.generateReport();
//		test = report.createTest("Testing Abc");
	}

	@AfterMethod
	public void tearDown() {
		report.flush();
	}

	@Test
	public void testAbc() {
		test = report.createTest("Testing Abc");
		test.log(Status.INFO, "executing test Abc");
		test.log(Status.PASS, "Test a is passed");
	}

	@Test
	public void testDef() {
		test = report.createTest("Testing Def");
		test.log(Status.INFO, "Executing test Def");
		test.log(Status.PASS, "test passed.");
	}

	@Test
	public void testPqr() {
		test = report.createTest("Testing Pqr");
		test.log(Status.INFO, "Executing test pqr");
		String actual = "abc";
		String expected = "pqr";
		if (actual.equalsIgnoreCase(expected)) {

			test.log(Status.PASS, "Assertion passed. Test passed successfully.");
		} else
			test.log(Status.FAIL, "Assertion failed. Test Failed");

	}
}
