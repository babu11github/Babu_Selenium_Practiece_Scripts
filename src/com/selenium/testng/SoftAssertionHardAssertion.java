package com.selenium.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionHardAssertion {
	SoftAssert softassert=new SoftAssert();
@Test
public void test()
{
	System.out.println("launch browser");
	System.out.println("enter url");
	//Assert.assertEquals(true, false);//hard assertion
	Assert.assertEquals(true,true);
	//Hard assertion:hard validation: if a hard assertion getting failed--->immidiately test case marked as failed andtest will be terminated
	
	System.out.println("enter username");
	System.out.println("enter password");
	System.out.println("click on login button");
	Assert.assertEquals(true, false);
	
	softassert.assertEquals(true,true); 
	//softassert.assertEquals(true,false);
	//soft assertion :soft validation:if a soft assertion getting failed--->immidiately test case marked as a passed and execute another steps
	System.out.println("check tha home page");
	System.out.println("enter fileds");
	System.out.println("and sign in website");
	
	System.out.println("registration conform");
	System.out.println("check once");
	System.out.println("close browser");
	softassert.assertAll();//if test case getting failed---> the soft assertion geting failed
}

}
