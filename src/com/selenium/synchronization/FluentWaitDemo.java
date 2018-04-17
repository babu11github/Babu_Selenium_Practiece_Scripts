package com.selenium.synchronization;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FluentWaitDemo {
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
public void test() throws Exception
{
	driver.get("https://www.google.co.in");
	driver.findElement(By.name("q")).sendKeys("selenium by ramesh anapati");
	driver.findElement(By.name("btnK")).click();
	driver.findElement(By.linkText("Selenium : Selenium WebDriver By Ramesh Anapati")).click();
	
	// Fluent wait
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			.withTimeout(30,TimeUnit.SECONDS)
			.pollingEvery(2,TimeUnit.SECONDS)
			.ignoring(NoSuchElementException.class);
	  /*  wait.until(new Function())
	    {
	    	public boolean apply(WebDriver, driver) {
	    		boolean status=driver.findElement(By.xpath("//*[@id='profile']/div/d1/dt")).isDisplayed();
	    		return boolean;}});
	    			
}*/
  }
}