package com.testng;

import static org.testng.Assert.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameters1 {

	WebDriver driver;

	@Parameters("browserName")
	@Test
	public void launchApplication(String browserName)
	{
		switch (browserName.toLowerCase())
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			System.err.println("please enter valid browser name all in lower case");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Parameters("url")
	@Test
	public void openUrl(String url)
	{
		driver.get(url);
	}

    @Parameters({"username","password"})
	@Test
	public void addLoginCredentials(String username,String password) 
	{
		driver.findElement(By.xpath("//input[@name='username' or @placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password' or @placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Test
	public void navigateToMyInfo() 
	{
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[6]/a")).click();

	}

	@Test
	public void verifyMyInfo() 
	{
		boolean actualValue=driver.findElement(By.className("oxd-text oxd-text--h6 --strong")).isDisplayed();
		assertTrue(actualValue);
	}

	@Test
	public void verifyLogin()
	{
		WebElement profile = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
		assertTrue(profile.isDisplayed());   ;
		assertTrue(profile.getText().startsWith("Welcome"));
		driver.quit();
	}
	
	@Parameters("value")
	@Test
	public void para(int value)
	{
		System.out.println(value);
	}

}
