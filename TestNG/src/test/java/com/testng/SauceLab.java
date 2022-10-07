package com.testng;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceLab 
{

	@Test(dataProvider="logindata")
	public void login(String username,String password)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		WebElement userName=driver.findElement(By.id("user-name"));
		WebElement pwd=driver.findElement(By.id("password"));
		WebElement loginButton=driver.findElement(By.id("login-button"));

		userName.sendKeys(username);
		pwd.sendKeys(password);
		loginButton.click();
		

	}

	@DataProvider(name="logindata")
	public static Object[][] getloginData(Method method,ITestContext test)
	{
		Object[][] dataForCreateLoan = new Object[][] 
				{ 
			{ "standard_user","secret_sauce"},
			{ "locked_out_user","secret_sauce"},
			{ "problem_user","secret_sauce"},
			{ "performance_glitch_user","secret_sauce"}
				};
		return dataForCreateLoan;



	}
}