package com.testng;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RandomUser 
{
	
	WebDriver driver;
	@Test
	void OpenBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://randomuser.me/");	
		
	}  
	//WebDriverWait wait = new WebDriverWait(driver,30);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));

	@Test(dependsOnMethods ="OpenBrowser",invocationCount = 5)
	void findElements() throws InterruptedException
	{
		List<WebElement> details=driver.findElements(By.xpath("//ul[@id='values_list']/li"));
		
		for (WebElement webElement : details) 
		{
			Thread.sleep(5000);
			String labelTitle=webElement.getAttribute("data-label");
			
			String labelValue=webElement.getAttribute("data-value");
			System.out.println(labelTitle+"="+labelValue);
		}
		driver.navigate().refresh();
	
		
		System.out.println("-------------------");

	}
	
	@AfterTest
	void close()
	{
		driver.close();
	}
	
	
}
