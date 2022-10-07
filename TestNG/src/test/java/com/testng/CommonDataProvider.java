package com.testng;



import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class CommonDataProvider 
{
	@DataProvider(name="commonDataProvider")
	public static Object[][] getData(Method method,ITestContext test)
	{
		Object[][] dataForCreateLoan = new Object[][] 
		{ 
			{ "user1", "John K", "US", "Johnk@test.com", "313 452 452" },
			{ "user2", "Sam P", "US", "SamP@test.com", "913 351 122" },
			{ "user3", "Jack S", "US", "JackS@test.com", "956 625 132" },
			{ "user4", "Chris N", "US", "ChrisN@test.com", "658 356 956" },
			{ "user5", "Ethan H", "US", "EthanH@test.com", "522 544 546" }, 
		};
	
	   Object[][] dataForupdateCustomerDetails = new Object[][] 
		{ 
		    { "Johnk@test.com", "313 452 452", "John K" },
		    { "JackS@test.com", "956 625 132", "Jack S" } 
		};
     
		
		     String testName=test.getName();
		     if(testName.equals("create Loan test"))
		     {
		    	 return new Object[][] {{ "user1", "John K", "US", "Johnk@test.com", "313 452 452" },
		 			{ "user2", "Sam P", "US", "SamP@test.com", "913 351 122" },
					{ "user3", "Jack S", "US", "JackS@test.com", "956 625 132" },
					{ "user4", "Chris N", "US", "ChrisN@test.com", "658 356 956" },
					{ "user5", "Ethan H", "US", "EthanH@test.com", "522 544 546" }};
		     }
		     else if(testName.equals("update Customer Details Test"))
		     {
		    	 return new Object[][] {{ "Johnk@test.com", "313 452 452", "John K" },
		 		    { "JackS@test.com", "956 625 132", "Jack S" } };

		     }
		     else
		     {
		    	 return new Object[][] {{"no data available for this test"}};
		    	 
		    	 
		    	 
		     }
		
		
		
		
		
		
		
	/*String methodName=method.getName();
		if(methodName.equals("createLoan"))
		{
			return dataForCreateLoan;
		}
		else if(methodName.equals("updateCustomerDetails"))
		{
			return dataForupdateCustomerDetails;
		}
		else
		{
			return new Object[][] {{"no data available}","{no data available}"}};
		}
		*/
		
		
	}



}
