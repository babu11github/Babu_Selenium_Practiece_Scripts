package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyErorrMesage {
	@Test
	public void verifyErrorTest()
	{
	System.setProperty("webdriver.gecko.driver","D:\\selenium\\Lib\\bin\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://accounts.google.com/");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	
	String actual_error = driver.findElement(By.className("dEOOab RxsGPe")).getText();
	
	String expected_error = "Enter an email or phone number";
	
	//aprroch 1
	Assert.assertEquals(actual_error, expected_error);
	
	//aproch 2
	
	Assert.assertTrue(actual_error.contains("Enter an email or phone number"));
	
	//aproch 3
    String actual_error1 = driver.findElement(By.className("dEOOab RxsGPe")).getAttribute("innerHTML");
	
	String expected_error1 = "Enter an email or phone number";
	
	//aprroch 1
	Assert.assertEquals(actual_error1, expected_error1);

}
}