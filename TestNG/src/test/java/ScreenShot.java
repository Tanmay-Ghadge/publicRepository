import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot 
{
	@Test
	void getSceenshot() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://a.testaddressbook.com/");
//https://demo.applitools.com/app.html#
		
		//approch 1
		TakesScreenshot st=(TakesScreenshot)driver;
		File file=st.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\tusha\\Documents\\learning\\java full course\\TestNG\\src\\test\\java\\screenShot1.jpg"));
		
		
		//aprroch 2
		TakesScreenshot st1=(TakesScreenshot)driver;
		String base64a=st.getScreenshotAs(OutputType.BASE64);
		byte[] byteArray=Base64.getDecoder().decode(base64a);
		FileOutputStream fos=new FileOutputStream("C:\\Users\\tusha\\Documents\\learning\\java full course\\TestNG\\src\\test\\java\\screenshot2.png");
		fos.write(byteArray);
		fos.close();
		
		String filename="fileName";
		TakesScreenshot st2=(TakesScreenshot)driver;
		byte[] byteArray2=st.getScreenshotAs(OutputType.BYTES);
		FileOutputStream fos2=new FileOutputStream("C:\\\\Users\\\\tusha\\\\Documents\\\\learning\\\\java full course\\\\TestNG\\\\src\\\\test\\\\java\\\\"+filename+"");
		fos.write(byteArray2);
		fos.close();
		
		driver.quit();
		
		String s="uucjJC"+filename+"";
	}

}
