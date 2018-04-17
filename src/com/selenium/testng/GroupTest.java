package com.selenium.testng;

import org.testng.annotations.Test;

public class GroupTest {
	
	  @Test(groups="regresion")
	  public void Test1()
	  {
		  System.out.println("login test1");

		}
	  @Test(groups="sanity")
	  public void Test2()
	  {
		  System.out.println("login browser test2");

		}
	  @Test(groups="regresion")
	  public void textTest3()
	  {
		  System.out.println("login text3");

		}
	  @Test(groups="sanity")
	  public void gmailTest4()
	  {
		  System.out.println("gmail test4");

		}
	  @Test(groups="regresion")
	  public void yutubTest5()
	  {
		  System.out.println(" yutublogin test5");

		}
	  @Test(groups="sanity")
	  public void linksTest6()
	  {
		  System.out.println("links test6");

		}
	  @Test(dependsOnGroups="sanity")
	  public void gmailTest()
	  {
		  System.out.println("gmail test");

		}

	}


