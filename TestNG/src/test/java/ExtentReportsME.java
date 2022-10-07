import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsME 
{
	public static void main(String[] args) throws IOException
	{
		ExtentReports extentReport=new ExtentReports();
		ExtentSparkReporter sparkReport=new ExtentSparkReporter("C:\\Users\\tusha\\Documents\\learning\\java full course\\TestNG\\reports\\report.html");
	
		extentReport.attachReporter(sparkReport);
		
		ExtentTest test1=  extentReport.createTest("test 1");
		test1.log(Status.PASS, "Test is passed");
		
		ExtentTest test2=extentReport.createTest("Test 2");
		test2.fail("test is failed");
		
		extentReport.createTest("Test 3").skip("test is skipped");

		extentReport.flush();
	    Desktop.getDesktop().browse(new File("C:\\Users\\tusha\\Documents\\learning\\java full course\\TestNG\\reports\\report.html").toURI());
	
	
	
	}
}
