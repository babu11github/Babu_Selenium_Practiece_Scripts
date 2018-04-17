package com.selenium.logicalscripts;
import static org.testng.Assert.assertEquals;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserSlider{
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
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	@Test
	public void testBrowserSlider() throws Exception
	{
		
		driver.get("http://www.seleniumhq.org/download/");
	   assertEquals("Downloads",driver.getTitle());
	   for(int i=0;i<10;i++)
	   {
		   /*((RemoteWebDriver) driver).executeScript("windows.scrollBy(0,400);");
		   Thread.sleep(1000);*/
		   JavascriptExecutor jse = (JavascriptExecutor)driver;
		   jse.executeScript("window.scrollBy(0,250)", "");
		   jse.executeScript("window.scrollBy(0,-250)", "");
		   Thread.sleep(2000);
		  /* Robot robot = new Robot();
		   robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		   robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		   Thread.sleep(2000);*/
		   
		   
	   }

	}

}
