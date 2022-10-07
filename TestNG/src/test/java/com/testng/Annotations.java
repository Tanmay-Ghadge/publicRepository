package com.testng;

import org.testng.annotations.*;

public class Annotations 
{
	@Test
	public void test()
	{
		System.out.println("Test method");
	}
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("Before method");
	}

	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("After method method");
	}

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class method");
	}

	@AfterClass
	public void afterClass()
	{
		System.out.println("After class method");
	}

	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test method");
	}

	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test method");
	}

	@BeforeSuite
	public void beforeSuite() 
	{
		System.out.println("Before suite method");
	}

	@AfterSuite
	public void afterSuite() 
	{
		System.out.println("After suite method");
	}

}
