package com.selenium.testng.datadrivenaproches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDataDriven {
	WebDriver driver;
	@Test
	@Parameters({"browser","url","email"})
	public void testFbLogin(String browser,String url,String email)
	{
		if(browser.equals("FF")) {
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\Lib\\bin\\geckodriver.exe");
	    driver=new FirefoxDriver();
		}
		driver.get(url);
		WebElement username=driver.findElement(By.id("email"));
		username.clear();
		username.sendKeys(email);
	}
}