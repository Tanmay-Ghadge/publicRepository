package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OptinalParaMeters 
{
	WebDriver driver;
	
	@Parameters("browserName")
	@Test
	public void launchBrowser(@Optional("firefox")String browserName)
	{
		switch (browserName.toLowerCase()) 
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
			break;
			

		default:
			System.out.println("plese enter valid browser name in lower case ");
			break;
		}
	    driver.manage().window().maximize();
		driver.get("https://www.website.com/?source=SC&country=IN");
	}

}
