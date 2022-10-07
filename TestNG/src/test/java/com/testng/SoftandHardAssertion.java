package com.testng;

import static org.testng.Assert.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftandHardAssertion
{
	@Test
	public void loginHardAssert()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("wrong user id", Keys.ENTER);
		
		//title assertion
		String webDriverTitle=driver.getTitle();
		String userDefinedTitle="Facebook – log in or sign up";
		assertEquals(webDriverTitle, userDefinedTitle , "title is mismatched");
		
		//url assertion
		String actualURL=driver.getCurrentUrl();
		String expectedURL="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjYwOTA1NDI1LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
		assertEquals(actualURL, expectedURL, "url is mismatched");
		
		//text assertion
		String actualText=driver.findElement(By.id("email")).getAttribute("value");
		String expectedText="";
		assertEquals(actualText, expectedText, "text is mismatched");
		
		//border assertion
		String actualBorder=driver.findElement(By.id("email")).getCssValue("border");
		String expectedBorder="1px solid rgb(240, 40, 73)";
		assertEquals(actualBorder, expectedBorder, "border is mismatched");
		
		//error message assertion
		String actualErrorMessage=driver.findElement(By.xpath("(//div[@id='email_container']/div)[last()]")).getText();
		String expectedErrorMessage="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
	assertEquals(actualErrorMessage, expectedErrorMessage, "text of error is mismatched");
		
		driver.quit();
	
	}

	@Test
	public void loginSoftAssert()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("wrong user id", Keys.ENTER);
		
		SoftAssert softAssert=new SoftAssert();
		//title assertion
		String webDriverTitle=driver.getTitle();
		String userDefinedTitle="Facebook – log in or sign up";
		softAssert.assertEquals(webDriverTitle, userDefinedTitle , "title is mismatched");
		
		//url assertion
		String actualURL=driver.getCurrentUrl();
		String expectedURL="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjYwOTA1NDI1LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
		softAssert.assertEquals(actualURL, expectedURL, "url is mismatched");
		
		//text assertion
		String actualText=driver.findElement(By.id("email")).getAttribute("value");
		String expectedText="";
		softAssert.assertEquals(actualText, expectedText, "text is mismatched");
		
		//border assertion
		String actualBorder=driver.findElement(By.id("email")).getCssValue("border");
		String expectedBorder="1px solid rgb(240, 40, 73)";
		softAssert.assertEquals(actualBorder, expectedBorder, "border is mismatched");
		
		//error message assertion
		String actualErrorMessage=driver.findElement(By.xpath("(//div[@id='email_container']/div)[last()]")).getText();
		String expectedErrorMessage="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		softAssert.assertEquals(actualErrorMessage, expectedErrorMessage, "text of error is mismatched");
		
		driver.quit();
		softAssert.assertAll();
	}
}
