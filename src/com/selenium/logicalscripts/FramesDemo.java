package com.selenium.logicalscripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FramesDemo extends CommonClass {
	
	@Test
	public void testFrame() throws Exception
	{
		//Load web page
		driver.get("http://jqueryui.com/autocomplete/");
		assertEquals("Autocomplete | jQuery UI",driver.getTitle());
		//Switch driver focus to frame
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//Type text
		driver.findElement(By.id("tags")).sendKeys("Selenium");
		Thread.sleep(2000);
		//Switch driver focus outside frame
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Button")).click();
		Thread.sleep(4000);
	}

}
