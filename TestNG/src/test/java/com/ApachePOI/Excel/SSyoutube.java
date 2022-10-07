package com.ApachePOI.Excel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSyoutube
{

	public static void main(String[] args) throws AWTException, InterruptedException 
	{

			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();

			Actions act=new Actions(driver);
			Robot robot=new Robot();
		

				driver.get("https://en.savefrom.net/19-ssyoutube-128.html");
				Thread.sleep(3000);
				robot.mouseMove(418,72);
				robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
				
				
				
				
				//driver.switchTo().alert().dismiss();
				WebElement searchbox=driver.findElement(By.xpath("//*[@id=\"sf_url\"]"));
				
				
				searchbox.sendKeys("bsvdddddlail");
				
				System.out.println("++++*******************************");
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_V);

				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);

			}



			

}
