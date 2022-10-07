package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FirstTest 
{
	@Test
	public void test1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mvnrepository.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	
	}
	
	@Test
	public void test2()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/downloads/");
		System.out.println(driver.getTitle());
		driver.quit();
	
	}
   
	
	
	
	
	
	
}
