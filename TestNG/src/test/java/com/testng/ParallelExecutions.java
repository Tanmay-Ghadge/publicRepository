package com.testng;

import org.testng.annotations.Test;

public class ParallelExecutions
{
	@Test
	void testMethod1()
	{
		System.out.println("class 1--test mehtod 1--"+"thread id ="+Thread.currentThread().getId());
	}
	
	@Test
	void testMethod2()
	{
		System.out.println("class 1--test mehtod 2--"+"thread id ="+Thread.currentThread().getId());
	}
	
	@Test
	void testMethod3()
	{
		System.out.println("class 1--test mehtod 3--"+"thread id ="+Thread.currentThread().getId());
	}
	
	@Test
	void testMethod4()
	{
		System.out.println("class 1--test mehtod 4--"+"thread id ="+Thread.currentThread().getId());
	}
	
	@Test
	void testMethod5()
	{
		System.out.println("class 1--test mehtod 5--"+"thread id ="+Thread.currentThread().getId());
	}
	
	@Test
	void testMethod6()
	{
		System.out.println("class 1--test mehtod 6--"+"thread id ="+Thread.currentThread().getId());
	}
}
