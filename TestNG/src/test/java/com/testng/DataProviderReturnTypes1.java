package com.testng;

import org.testng.annotations.*;
import org.testng.annotations.DataProvider;

public class DataProviderReturnTypes1 
{
  //single diamensional array as a return type
	
	@Test(dataProvider="data")
	public void method(String s)
	{
		System.out.println(s);
	}
	
	@DataProvider(name="data")
	public String[] dataProvider()
	{
		String data[]=new String[] {"tanmay","ghadge"};
		return data;
	}
	
	@Test(dataProvider="ObjectData")
	public void method2(Integer[] a)
	{
		System.out.println(a[0]);
	}
	
	@DataProvider(name="ObjectData")
	Integer[] dataprovider()
	{
		Integer data[]=new Integer[] {1,2,3};
		return data;
	}
	
	@Test(dataProvider="data2")
	void method3(Object o)
	{
		System.out.println(o);
	}
	
	@DataProvider(name="data2")
	Object[] dataProvider1()
	{
		Object[] data=new Object[2];
		data[0]="moon";
		data[1]=113;
		return data;
	}
	
	
	
	
	
}
