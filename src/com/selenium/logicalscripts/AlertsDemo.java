package com.selenium.logicalscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AlertsDemo {
	
	@Test
	public void alertTest()
	{
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\Lib\\bin\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.ksrtc.in/oprs-web/");
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		
		String text = al.getText();
		if(text.equals("Please select start place."))
		{
			System.out.println("alert message correct");
		}else
		{
			System.out.println("alert message not corect");
		}
		al.accept();
	}


}
