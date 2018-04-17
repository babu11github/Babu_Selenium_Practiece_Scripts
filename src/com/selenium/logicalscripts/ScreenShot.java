package com.selenium.logicalscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Utility.TestUtility;

public class ScreenShot {
	public static WebDriver driver;
	//SoftAssert softassert=new SoftAssert();
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\Lib\\bin\\geckodriver.exe");
	    driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	@Test
	public void test()
	{
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.clear();
		username.sendKeys("babuyadav232");
		//TestUtility.captureScreenShot(driver, "fbusername");
		//softassert.assertEquals(false, true);
		WebElement password = driver.findElement(By.id("pass1"));
		password.clear();
		password.sendKeys("babu11");
		//TestUtility.captureScreenShot(driver, "fbpassword");
		
	}
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus());
		{
			TestUtility.captureScreenShot(driver,result.getName());
		}
		driver.quit();
	}
}
