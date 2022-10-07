import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Utility 
{

	public void getScreenShot(WebDriver driver ,String methodName) throws IOException
	{
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
		FileUtils.copyFile(file, fileLocation);

		System.out.println("screenshot method got executed completely");

	}


}
