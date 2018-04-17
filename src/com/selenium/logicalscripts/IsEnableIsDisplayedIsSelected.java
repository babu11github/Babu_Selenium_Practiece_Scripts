package com.selenium.logicalscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IsEnableIsDisplayedIsSelected {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\Lib\\bin\\geckodriver.exe");
	    driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		//driver.manage().deleteAllCookies();
		driver.get("https://www.freecrm.com/register/");
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	@Test
	public void testIsEnableIsSelectedIsDisplyed()
	{
		//isDisplyed----->true
		boolean b=driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(b);
     //isEnable ------>false
     boolean b1=driver.findElement(By.id("submitButton")).isEnabled();
     System.out.println(b1);
     //isEnable----->true
     driver.findElement(By.name("agreeTerms")).click();
     boolean b2=driver.findElement(By.name("agreeTerms")).isEnabled();
     System.out.println(b2);
     //isSelected---> check box,radio button ,drop down
     boolean b3=driver.findElement(By.name("agreeTerms")).isSelected();
     System.out.println(b3);//true
     
     //de select check box
     driver.findElement(By.name("agreeTerms")).click();
     boolean b4=driver.findElement(By.name("agreeTerms")).isSelected();
     System.out.println(b4);//false
     
     
     // Note : pre-validations ----> isDisplyed(),isEnable() And Post validation is --->isSelected()
            
     
     
	}
	

}
