package com.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM 
{
	WebDriver driver;

	@Test
	public void launchApplication()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test
	public void addLoginCredentials()
	{
		driver.findElement(By.xpath("//input[@name='username' or @placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password' or @placeholder='Password']")).sendKeys("admin123");
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
		System.out.println(driver.findElement(By.className("oxd-text oxd-text--h6 --strong")).isDisplayed());
		driver.quit();
	}
	
	@Test
	public void verifyLogin()
	{
		WebElement profile=driver.findElement(By.className("oxd-userdropdown-name"));
		System.out.println(profile.isDisplayed());
		System.out.println(profile.getText());
		driver.quit();
	}
	
}
