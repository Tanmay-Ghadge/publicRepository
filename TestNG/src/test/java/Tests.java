import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners
public class Tests 
{
	WebDriver driver;
	@BeforeMethod
	void openbrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}

	@Test
	void openGoogle()
	{
		driver.get("https://www.google.co.in/");
		String actualTitle=driver.getTitle();
		String requiredTitle="hjcvbac";

		Assert.assertEquals(actualTitle, requiredTitle); 
	}

	@Test
	void openLinkedIn()
	{
		driver.get("https://www.linkedin.com/signup");
		String actualTitle=driver.getTitle();
		String requiredTitle=driver.getTitle();

		Assert.assertEquals(actualTitle, requiredTitle); 
	}

	@Test
	void openTwitter()
	{
		driver.get("https://twitter.com/i/flow/login");
		String actualTitle=driver.getTitle();
		String requiredTitle=driver.getTitle();

		Assert.assertEquals(actualTitle, requiredTitle); 
	}

	@AfterMethod
	void quit()
	{
		driver.quit();
	}

	@Test
	void m1()
	{
		String s1 =new String("tanmay");
		String s2 =new String("tanmay");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1=s2);
		
		
		
		
	}
}
