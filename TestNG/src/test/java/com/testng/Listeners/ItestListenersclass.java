package com.testng.Listeners;
import java.io.IOException;

import org.apache.poi.xdgf.util.Util;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestListenersclass extends Util implements ITestListener 
{

	@Override
	public void onTestFailure(ITestResult result) 
	{
		result.getName();
		getScreenShot(new ChromeDriver(),result.getName());
	
	}

	private void getScreenShot(ChromeDriver chromeDriver, String name) {
		// TODO Auto-generated method stub
		
	}

}
