import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttachScreenShotToReport 
{
	
	//static WebDriver driver =new ChromeDriver();
	public static String getFileScreenshot(WebDriver driver) throws IOException 
	{
		TakesScreenshot st=(TakesScreenshot) driver;
		File screenshot=st.getScreenshotAs(OutputType.FILE);
		File location=new File("./Screenshots/sc1.jpg");
		
		FileUtils.copyFile(screenshot, location);
		return(location.toString());
	}
	
	public static String getScreenshotBase64(WebDriver driver)
	{
		TakesScreenshot st1=(TakesScreenshot) driver;
		String bas64=st1.getScreenshotAs(OutputType.BASE64);
		return bas64;
	}

	public static void main(String[] args) throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		ExtentReports extentReport=new ExtentReports();
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter("C:\\Users\\tusha\\Documents\\learning\\java full course\\TestNG\\screenshotReport.html");
		extentReport.attachReporter(sparkReporter);
		
		driver.get("https://json.org/example.html");
		
		extentReport.createTest("Test 1-file Screenshot")
		.info("File test")
		.addScreenCaptureFromPath(getFileScreenshot(driver));
		
		extentReport.createTest("Test 2-file Screenshot","test also get a description")
		.info("File test")
		.addScreenCaptureFromPath(getFileScreenshot(driver),"reported screen shot with message by using overloaded method");
		
		extentReport.createTest("Test 3-base64 screenshot","test description")
		.info("base64 screenshot")
		.addScreenCaptureFromBase64String(getScreenshotBase64(driver));
		
		extentReport.createTest("Test 4-base64 screenshot")
		.info("base64 screenshot")
		.addScreenCaptureFromBase64String(getScreenshotBase64(driver),"base64 does not get a preview");
		
		extentReport.createTest("Test 5-base64 screenshot at log level")
		.info("base64 screenshot")
		.fail(MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenshotBase64(driver),"log level ").build())
		.info(MediaEntityBuilder.createScreenCaptureFromPath(getFileScreenshot(driver), "file log level screenshot").build());
		
		
		
		
	
		extentReport.flush();
		Desktop.getDesktop().browse(new File("C:\\\\Users\\\\tusha\\\\Documents\\\\learning\\\\java full course\\\\TestNG\\\\screenshotReport.html").toURI());
		
	}

}
