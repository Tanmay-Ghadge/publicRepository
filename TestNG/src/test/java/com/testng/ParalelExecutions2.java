package com.testng;

import org.testng.annotations.Test;

public class ParalelExecutions2 
{
	@Test
	void testMethod7()
	{
		System.out.println("class 2--test mehtod 7--"+"thread id ="+Thread.currentThread().getId());
	}
	
	@Test
	void testMethod8()
	{
		System.out.println("class 2--test mehtod 8--"+"thread id ="+Thread.currentThread().getId());
	}
	
	@Test
	void testMethod9()
	{
		System.out.println("class 2--test mehtod 9--"+"thread id ="+Thread.currentThread().getId());
	}
	
	@Test
	void testMethod10()
	{
		System.out.println("class 2--test mehtod 10--"+"thread id ="+Thread.currentThread().getId());
	}
	
	@Test
	void testMethod11()
	{
		System.out.println("class 2--test mehtod 11--"+"thread id ="+Thread.currentThread().getId());
	}
	
	@Test
	void testMethod12()
	{
		System.out.println("class 2--test mehtod 12--"+"thread id ="+Thread.currentThread().getId());
	}
	
}
