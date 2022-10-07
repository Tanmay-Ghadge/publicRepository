package com.testng;

import org.testng.annotations.Test;

public class DataProviderClass 
{
  @Test	(dataProvider="name")
  void method(Object o)
  {
	  System.out.println(o);
  }
	
}
