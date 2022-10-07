package com.ApachePOI.Excel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadVideosFramwork 
{

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/playlist?list=PL5fOKT7XR42OgLXmX8wYYhB7L0sN-uqpR");
		String parentwindowHandle=driver.getWindowHandle();
		
		Actions act=new Actions(driver);
		Robot robot=new Robot();
		try 
		{
		List<WebElement> videoss=driver.findElements(By.xpath("//a[contains(@title,'Selenium Framework - Advanced-')]"));
		}
		catch(StaleElementReferenceException a)
		{
			List<WebElement> videos=driver.findElements(By.xpath("//a[contains(@title,'Selenium Framework - Advanced-')]"));
		}

	/*	for (WebElement webElement :videoss) 
		{
			System.out.println("looooooooooooooooooooooop");
			act.moveToElement(webElement);

			act.contextClick().build().perform();

			for(int i=0;i<=4;i++)
			{
				Thread.sleep(500);
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				//Thread.sleep(1000);
				// act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_UP).build().perform();

			}
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			driver.navigate().to("https://en.savefrom.net/19-ssyoutube-131.html");
			Thread.sleep(3000);
			robot.mouseMove(415,74);
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			
			
			//driver.switchTo().alert().dismiss();
			try
			{
				WebElement searchbox=driver.findElement(By.xpath("//*[@id=\"sf_url\"]"));
				searchbox.clear();
				searchbox.click();
				System.out.println("try block got executed");
			}
			catch (Exception e) 
			{
				System.out.println("entered in catch block");
				driver.navigate().refresh();
				System.out.println("page refreshed");
				WebElement searchbox=driver.findElement(By.xpath("//*[@id=\"sf_url\"]"));
				searchbox.clear();
				System.out.println("catch block got executed");
			}
			System.out.println("outside try catch block");
			
			Thread.sleep(3000);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			System.out.println("pasted");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[text()='Download']")).click();
			driver.navigate().back();

		}



		driver.quit();



	}*/
	}
}
