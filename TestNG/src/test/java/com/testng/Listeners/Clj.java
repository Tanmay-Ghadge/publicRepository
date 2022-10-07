package com.testng.Listeners;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clj {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();		 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://aneyacareeredu.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// from which tags we are going to get urls 
		List <WebElement> list= driver.findElements(By.tagName("a"));
		list.addAll(driver.findElements(By.tagName("img")));

		//extract each url from the tag and remove the duplicates and store it in a Set

		//required declarations
		Set <String> urls= new HashSet();
		int responseCode;
		int brokenLinks = 0;

		//iterating each url from List
		Iterator <WebElement> it=list.iterator();
		while(it.hasNext())
		{
			//storing each url in String
			String url=(it.next().getAttribute("href"));

			//filtering out duplicates
			if(url==null || url.isEmpty()==true)
			{
				System.out.println(url="--> is not configured");
				continue;
			}
			else
			{
				// storing unique urls
				urls.add(url);
			}

		}

		for( String uniqueURL:urls)
		{

			try 
			{
				// open each url
				URL urlObj=new URL(uniqueURL);

				//open connection i.e.
				//URLConnection urc=	

				//  send request
				HttpURLConnection huc=(HttpURLConnection) urlObj.openConnection();

				//add timeout before connecting to avoid timeout exception

				//	huc.setConnectTimeout(5);

				// connect
				huc.connect();

				//get response
				responseCode=huc.getResponseCode();

				if(responseCode >= 300)
				{
					System.out.println(uniqueURL+"-->broken link");
					brokenLinks++;
				}

			} 

			catch (MalformedURLException e) 
			{

			} 
			catch (Exception e1) 
			{

			}

		}

		// opening each url

		System.out.println("number of broken links="+brokenLinks);

		System.out.println("urls with duplicate urls="+list.size());
		System.out.println("urls without duplicate urls="+urls.size());



		driver.quit();	

	}

}
