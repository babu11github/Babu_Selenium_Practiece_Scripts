package com.selenium.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\Lib\\bin\\geckodriver.exe");
	    driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=FMB2WqvLK6udX6iyiegK");
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}


	@Test(priority=1)
	public void googlePageLaunch()
	{
		
		String title=driver.getTitle();
		System.out.println("show the title :"+title);
		Assert.assertEquals(title,"Google");
	}
	@Test(priority=3)
	public void googleSearchTextField()
	{
		driver.findElement(By.id("lst-ib")).sendKeys("suri");
		
	}
	@Test(priority=2)
	public void googleText()
	{
		
		boolean b=driver.findElement(By.id("hplogo")).isDisplayed();
		System.out.println("verify google text :"+b);
		Assert.assertEquals(b,true);
	}
	/*@Test(priority=4)
	public void googleTest()
	{
		System.out.println("test1");
		
	}
	@Test(priority=6)
	public void googleBox()
	{
		System.out.println("google box");
		
	}
	@Test(priority=5)
	public void googleField()
	{
		System.out.println("google field");
		
	}*/
}
