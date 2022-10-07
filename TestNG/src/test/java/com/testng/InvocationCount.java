package com.testng;

import org.testng.annotations.Test;

public class InvocationCount 
{
	@Test
     void  forLoopMethod()
     {
		/*
		 here when j==3 we are intensionally failing the TC but in TestNG report there is no 
		 information given on how and when in which input it is failing 
		 also it doesnt run the remaining iterations 
		 neither it gives any output from the passed iterations.
		 as a matter of fact it does not give any output even for the passed tests
		  i because even though we are passing 
		 diffrent set of data TestNG will consider this as a one TC so even though one iteration fails
		 and others are alright still it declares the whole TC a fail  
		 */
    	 for(int i=10;i>=1;i--)
    	 {
    		 for(int j=i;j>0;j--)
    		 {
    			 if(j==3)
    			 {
    				 int e=10/0;
    			 }
    			 System.out.print("*");  
    		 }
    		 System.out.println(); 
    	 }
    	 
    	 
     }
	
	@Test(invocationCount = 2)
    void  invocationCountMethod()
    {
   	 for(int i=10;i>=1;i--)
   	 {
   		 for(int j=i;j>0;j--)
   		 {
   			 if(j==3)
   			 {
   				 int e=10/0;
   			 }
   			 System.out.print("*"); 
   		 }
   		 System.out.println(); 
   	 }
    }
}
