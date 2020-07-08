# ExtentReport

demo for how to integrate Extent Report in maven project.

Create a Maven project. Add TestNG dependency in pom.xml [https://mvnrepository.com/artifact/org.testng/testng/6.14.3] 
Add ExtentReport dependency in pom.xml [https://mvnrepository.com/artifact/com.aventstack/extentreports/4.1.5]

Create a ReportManager class which will help to generate the report. Now we can use the ReportManager to generate the reports.

Add test classes and impement the ReportManager class to generate the Test Report.

Create the testNG.xml and run it.

Post that go to 'extentReport' folder, where you will fine the index.html. Open this file in browser to see the test results.
