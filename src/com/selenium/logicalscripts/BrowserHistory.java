package com.selenium.logicalscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BrowserHistory extends CommonClass {
	@Test
	public void testBrowserHistory() throws Exception
	{
		driver.navigate().to("http://www.seleniumhq.org/");
		driver.findElement(By.linkText("Download")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
	}

}
