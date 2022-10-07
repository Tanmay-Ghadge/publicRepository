package com.testng;

import org.testng.annotations.Test;

public class SameDataProviderMethods 
{
  @Test(dataProvider="commonDataProvider",dataProviderClass = CommonDataProvider.class)
  public void createLoan(Object [] a)
  {
	  System.out.println("creating loan for user-"+a[1]);
	  System.out.println("data used to create loan for-"+a[3]);
	  System.out.println("--------------");
  }
  
  
  @Test(dataProvider="commonDataProvider",dataProviderClass = CommonDataProvider.class)
  public void updateCustomerDetails(Object[] b)
  {
	  System.out.println("updating details for userId-"+b[0] );
	  System.out.println("customer details updated -"+b[1] );
	  System.out.println("--------------");
  }
}
