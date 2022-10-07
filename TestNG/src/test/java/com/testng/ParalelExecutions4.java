package com.testng;

import org.testng.annotations.Test;

public class ParalelExecutions4 
{
	@Test
	void testMethod22()
	{
		System.out.println("class 22--test mehtod 7--"+"thread id ="+Thread.currentThread().getId());
	}
	
	@Test
	void testMethod21()
	{
		System.out.println("class 21--test mehtod 8--"+"thread id ="+Thread.currentThread().getId());
	}
	
	@Test
	void testMethod20()
	{
		System.out.println("class 4--test mehtod 20--"+"thread id ="+Thread.currentThread().getId());
	}
	
	@Test
	void testMethod19()
	{
		System.out.println("class 4--test mehtod 19--"+"thread id ="+Thread.currentThread().getId());
	}
	
	@Test
	void testMethod17()
	{
		System.out.println("class 4--test mehtod 17--"+"thread id ="+Thread.currentThread().getId());
	}
	
	@Test
	void testMethod18()
	{
		System.out.println("class 4--test mehtod 18--"+"thread id ="+Thread.currentThread().getId());
	}
	
}
