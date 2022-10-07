package com.testng;

import org.testng.annotations.Test;

public class ParalelExecutons3 
{
	@Test
	void testMethod13()
	{
		System.out.println("class 3--test mehtod 13--"+"thread id ="+Thread.currentThread().getId());
	}
	
	@Test
	void testMethod14()
	{
		System.out.println("class 3--test mehtod 14--"+"thread id ="+Thread.currentThread().getId());
	}
	
	@Test
	void testMethod15()
	{
		System.out.println("class 3--test mehtod 15--"+"thread id ="+Thread.currentThread().getId());
	}
	
	@Test
	void testMethod16()
	{
		System.out.println("class 3--test mehtod 16--"+"thread id ="+Thread.currentThread().getId());
	}
}
