package com.selenium.testng;

import org.testng.annotations.*;

public class TestNGAnnotationsExecutionOrder {
	@BeforeSuite
	public void testBeforeSuite()
	{
		System.out.println("before suite");
	}
	@BeforeClass
	public void testBeforeClass()
	{
		System.out.println("before class");
	}
	@BeforeTest
	public void testBeforeTest()
	{
		System.out.println("before test");
	}
	@BeforeMethod
	public void testBeforeMethod()
	{
		System.out.println("before method");
	}
	@AfterSuite
	public void testAfterSuite()
	{
		System.out.println("after suite");
	}
	@AfterTest
	public void testAfterTest()
	{
		System.out.println("after test");
	}
	@AfterClass
	public void testAfterClass()
	{
		System.out.println("after class");
	}
	@AfterMethod
	public void testAfterMethod()
	{
		System.out.println("after method");
	}
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
}
