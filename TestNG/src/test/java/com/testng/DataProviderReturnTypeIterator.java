package com.testng;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderReturnTypeIterator 
{
   @Test(dataProvider="kguskgvjsjk")
   void method(Object a)
   {
	   System.out.println(a);
   }
   
   @DataProvider(name="kguskgvjsjk")
    public Iterator<Object> dT()
   {
	  List<Object> list=new ArrayList<Object>();
	  
	  list.add("jskajxcmxnc");
	  list.add(65458);
	  list.add(0.2687);
	  list.add('k');
	  list.add(true);
	  return list.iterator();
   }
   
   
   @Test(dataProvider="hfwujk")
   void method2(String[] a)
   {
	   System.out.println(a[0]+"--"+a[1]);
   }
   
   @DataProvider(name="hfwujk")
   Iterator<String[]> csjh()
   {
	   Set<String[]> set=new HashSet<String[]>();
	   set.add(new String[] {"hjcchs","acsckn"});
	   set.add(new String[] {"hJcjhs","UIcscsiub"});
	   return set.iterator();
   }
   
   
   
   
}
