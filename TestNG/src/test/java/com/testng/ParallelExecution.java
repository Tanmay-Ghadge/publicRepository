package com.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecution 
{
    void method()
    {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver=new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("https://www.jotform.com/build/222471069625457#preview");
    	
    	WebElement firstName=driver.findElement(By.id("first_3"));
    	firstName.sendKeys(null);
    	
    	WebElement lastName=driver.findElement(By.id("last_3"));
    	lastName.sendKeys(null);
    	
    	WebElement adress=driver.findElement(By.id("input_13_addr_line1"));
    	adress.sendKeys(null);
    	
    	WebElement streetAdress2=driver.findElement(By.id("input_13_addr_line2"));
    	streetAdress2.sendKeys(null);
    	
    	WebElement city=driver.findElement(By.id("input_13_city"));
    	city.sendKeys(null);
    	
    	WebElement postalCode=driver.findElement(By.id("input_13_postal"));
    	postalCode.sendKeys(null);
    	
    	WebElement email=driver.findElement(By.id("input_4"));
    	email.sendKeys(null);
    	
    	WebElement phoneNumber=driver.findElement(By.id("input_5_full"));
    	phoneNumber.sendKeys(null);
    	
    	WebElement homePhoneNumber=driver.findElement(By.id("input_6_full"));
    	homePhoneNumber.sendKeys(null);
    
    }
    
    void dataProviderMethod()
    {
    	Object[][] data=new Object[][]
    	{
    		{"Fiona","miller"}
    		
        };
    }
	
}
