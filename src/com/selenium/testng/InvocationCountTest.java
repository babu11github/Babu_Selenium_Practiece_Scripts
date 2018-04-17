package com.selenium.testng;

import org.testng.annotations.Test;

public class InvocationCountTest {
	// we can Run same test case multiple times by using innvocation count
@Test(invocationCount=5)
public void sumOfTwoNumbers()
{
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println("sum of two numbers:"+c);
}

}
