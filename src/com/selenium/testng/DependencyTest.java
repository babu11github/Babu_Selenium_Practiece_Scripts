package com.selenium.testng;

import org.testng.annotations.*;

public class DependencyTest {
  @Test
  public void loginTest()
  {
	  System.out.println("login test");

	}
  @Test(dependsOnMethods="loginTest")
  public void browseTest()
  {
	  System.out.println("login browser");

	}
  @Test(dependsOnMethods="browseTest")
  public void textTest()
  {
	  System.out.println("login text");

	}
  @Test
  public void gmailTest()
  {
	  System.out.println("gmail test");

	}
 
}
