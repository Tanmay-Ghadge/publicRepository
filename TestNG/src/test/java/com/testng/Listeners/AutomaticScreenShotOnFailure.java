package com.testng.Listeners;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomaticScreenShotOnFailure 
{
	@Test
   void plant()
   {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	   driver.get("https://gd.eppo.int/taxon/ASCFA");
	   
	   List<WebElement> PlantProperties=driver.findElements(By.xpath("//div[@class='ptable']/div/i"));
	   List<WebElement> Properties=driver.findElements(By.xpath("//div[@class='ptable']/div/span"));
	   
	   
	   
	   for (WebElement PlantPropertyName : PlantProperties) 
	   {
		   String propertyName=  PlantPropertyName.getText();
		   for (WebElement PropertyValue : Properties) 
		   {
			  
			   String propertyValue=  PropertyValue.getText();
				 
				 System.out.println(propertyName+":"+propertyValue);
		    }
	   }

	   driver.quit();
   }
	
}
