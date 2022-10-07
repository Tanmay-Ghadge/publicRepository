package com.testng.Listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ListenersImplementedClass.class})
public class ListernTest
{
	@Test
	void testMethod13()
	{
		System.out.println("testMethod13");
	}
	
	@Test
	void testMethod14()
	{
		System.out.println("testMethod14");
	}
	
	@Test
	void testMethod15()
	{
		System.out.println("testMethod15");
	}
	
	@Test
	void testMethod16()
	{
		System.out.println("testMethod16");
	}

}
