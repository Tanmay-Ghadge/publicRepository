package com.testng;

import org.testng.annotations.Test;

@Test(groups= {"all"})
public class Grouping 
{
	@Test(groups= {"smoke","sanity","daily build"})
	public void testMethod1()
	{
		System.out.println("test Method 1");
	}
	
	@Test(groups= {"regression,smoke"})
	public void testMethod2()
	{
		System.out.println("test Method 2");
	}
	
	@Test(groups= {"functional","daily build","weekly build"})
	public void testMethod3()
	{
		System.out.println("test Method 3");
	}
	
	@Test(groups= {"smoke","sanity","regression"})
	public void testMethod4()
	{
		System.out.println("test Method 4");
	}
	
	//this test has the Test annotations
	@Test(groups= {"daily build","weekly build"})
	public void testMethod5()
	{
		System.out.println("test Method 5");
	}
	
	//this method does not have Test annotation
	public void testMethod6()
	{
		System.out.println("test Method 6");
	}
}
