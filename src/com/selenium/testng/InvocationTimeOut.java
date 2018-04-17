package com.selenium.testng;

import org.testng.annotations.Test;

public class InvocationTimeOut {
	// To terminate our testcases from infinite loop
	// we can handle without try catch block,if we want to handle exceptions in testng
	
	@Test(invocationTimeOut=2,expectedExceptions=NumberFormatException.class)
	public void infiniteLoop()
	{
		int i=1;
		while(i==1)
		{
			System.out.println(i);
		}
	}

}
