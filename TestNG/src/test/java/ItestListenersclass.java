import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestListenersclass extends Utility implements ITestListener 
{

	@Override
	public void onTestFailure(ITestResult result) 
	{
		WebDriver driver =new ChromeDriver();
		
		String methodName=result.getName();
		//time stamp
		Date date=new Date();
		SimpleDateFormat dateFormat=new SimpleDateFormat("MMMM dd YYYY hh:mm:ss");
		String dateTime=dateFormat.format(date);

		//random number
		int randomNumber=(int)(900+Math.random()+(1000-900));

		//get ScreenShot
		TakesScreenshot st=(TakesScreenshot) driver;
		File file=st.getScreenshotAs(OutputType.FILE);
		File fileLocation=new File("C:\\Users\\tusha\\Documents\\learning\\java full course\\TestNG\\src\\test\\java\\"+methodName+"-"+dateTime+"-"+randomNumber+".jpg");
	System.out.println(fileLocation);
		try 
		{
			FileUtils.copyFile(file, fileLocation);
			System.out.println(fileLocation);
		} catch (IOException e) 
		{
			System.out.println("acbvkaja");
		}

		System.out.println("screenshot method got executed completely");
	
	}

}
