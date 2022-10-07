package com.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider 
{
  @Test(dataProvider="Heroes")
  public void form(String firstName,String lastName,String phoneNumber,String countryName,String cityName,String emailID) throws InterruptedException
  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
	  
	  WebElement first_name=driver.findElement(By.id("RESULT_TextField-1"));
	  first_name.sendKeys(firstName);
	  
	  WebElement last_name=driver.findElement(By.id("RESULT_TextField-2"));
	  last_name.sendKeys(lastName);
	  
	  WebElement phone=driver.findElement(By.id("RESULT_TextField-3"));
	  phone.sendKeys(phoneNumber);
	  
	  WebElement country=driver.findElement(By.id("RESULT_TextField-4"));
	  country.sendKeys(countryName);
	
	  WebElement city=driver.findElement(By.id("RESULT_TextField-5"));
	  city.sendKeys(cityName);
	  
	  WebElement email=driver.findElement(By.id("RESULT_TextField-6"));
	  email.sendKeys(emailID);
	  
	 Thread.sleep(5000);
	  driver.quit(); 
	  

		
  }
  /*firstName  lastName  phoneNumber  countryName  cityName
	 * Bruce     Wayne     5144645646    USA          Gotham
	 * Sherlock  Holmes    8746121578    England      bakers-Street
	 * Peter     parker    7994666698    USA          Queens
	 * Steve     Rogers    9921128556    USA          Brooklyn
	 * Clark     Kent      2264647898    USA          Kansas
	*/
  
  @org.testng.annotations.DataProvider(name="Heroes",parallel = true)
  public Object[] [] testData()
  {
	  Object[][] data=new Object[5][6];
	  data[0][0]="Bruce";data[0][1]="Wayne";data[0][2]="5144645646";data[0][3]="USA";data[0][4]="Gotham";data[0][5]="batman@gmail.com";
	  data[1][0]="Sherlock";data[1][1]="Holmes";data[1][2]="8746121578";data[1][3]="England";data[1][4]="bakers-Street";data[1][5]="holmes@gmail.com";
	  data[2][0]="Peter";data[2][1]="parker";data[2][2]="7994666698";data[2][3]="USA";data[2][4]="Queens";data[2][5]="spider@gmail.com";
	  data[3][0]="Steve";data[3][1]="Rogers";data[3][2]="9921128556";data[3][3]="USA";data[3][4]="Brooklyn";data[3][5]="captain@gmail.com";
	  data[4][0]="Clark";data[4][1]="Kent";data[4][2]="2264647898";data[4][3]="USA";data[4][4]="Kansas";data[4][5]="superman@gmail.com";
	  
	  
	return data;
	  
  }
  
  
  
}
