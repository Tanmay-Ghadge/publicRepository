package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DaraProviderMultiDiamensionalArray 
{
  // returning multi diamensional array from DataProvider
	
	
	@Test(dataProvider="data")
	void method1(String[] a)
	{
		System.out.println(a[0]+"--"+a[1]+"--"+a[2]);
	}
	 
	@DataProvider(name="data")
	String[][] dataprovide()
	{
		String [][] data=new String [][]
	    {
			{"qwe","rty","uio"}, 
			{"lkj","nmh","vfht"}
		};	
		return data;	
	}
	
	@Test(dataProvider="data2")
	void method2(Object [] a)
	{
		
		System.out.println(a[0]+"-"+a[1]+"-"+a[2]+"-"+a[3]+"-"+a[4]+"-"+a[5]);
	}
	
	
	@DataProvider(name="data2")
	Object[][] data()
	{
		Object[][] data=new Object[][]
		{
			{'T',2,"uysgCSJ",4,"HJVCSHJVCJHV",6},
			{7,10.5,9,10,0.22225454,23}
		};
		
		return data;
	}
	
	
	
	
	
	
	
	
	
}
