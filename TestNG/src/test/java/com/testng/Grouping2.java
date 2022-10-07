package com.testng;

import org.testng.annotations.Test;

public class Grouping2 
{
	@Test(groups={"smoke","sanity","regression","daily build"} )
	public void testMethod1()
	{
		System.out.println("Method 7");
	}
	
	@Test(groups={"functional","daily build"} )
	public void testMethod2()
	{
		System.out.println("Method 8");
	}
	
	@Test(groups={"regression","smoke","weekly build"} )
	public void testMethod3()
	{
		System.out.println("Method 9");
	}
	
	@Test(groups={"smoke","sanity","daily build","weekly build"} )
	public void testMethod4()
	{
		System.out.println("Method 10");
	}
	
	//this test has the Test annotations
	@Test(groups={"daily build","weekly build"} )
	public void testMethod5()
	{
		System.out.println("Method 11");
	}
	
	//this method does not have Test annotation
	public void testMethod6()
	{
		System.out.println("Method 12");
	}
}
