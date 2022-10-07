package com.testng;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.DataProvider;

public class DataProviderIndices {
  @Test(dataProvider = "cakjb")
  public void method(String [] s) 
  {
	  
	  for(int i=0;i<s.length;i++)
	  {
		  System.out.println(s[i]);
	  }
	 
  }

  @DataProvider(name="cakjb",indices = {1,3})
  public String [] dataprovide()
  {
	  String [] s=new String[] 
	  {
			  "mdjbakv",
			  "jahscb",
			  "vbkjkqjbav",
			  "iguvuvuqig",
	  };
   
	  return s;
  }
  
  @Test(dataProvider="datapro")
  void gavuigj(Integer a,Integer b)
  {
	System.out.println(a+"--"+b);  
  }
  
  @DataProvider(indices = {1})
  Integer[][] datapro()
  {
	  Integer[][] intArray=new Integer[][]
	  {
		  {5,9},
		  {6,35},
		  {689,554}
	  };
	  return intArray;
  }
  
  @Test(dataProvider="datahjvcas")
  void jcvhshjc(String a)
  {
	  System.out.println(a);
  }
  
  @DataProvider
  Iterator datahjvcas()
  {
	  List<String> list=new ArrayList<String>();
	  list.add("jcavhcahj");
	  list.add("KBCSBB");
	  
	  return list.iterator();
	 
	  
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
