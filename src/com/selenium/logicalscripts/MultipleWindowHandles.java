package com.selenium.logicalscripts;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MultipleWindowHandles extends CommonClass {
	@Test
	public void windowHandleTest() throws Exception
	{
		// load web page
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		assertEquals("IRCTC Next Generation eTicketing System",driver.getTitle());
		Thread.sleep(3000);
		//click on flights
		driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(30000);
		Set<String> h=driver.getWindowHandles();
		String handle[] = new String[h.size()];
		int i=0;
		System.out.println("*********** Handles are ******************");
		for(String s:h)
		{
			System.out.println(s);
			handle[i] = s;
			i++;
		}
		// switch driver focus to flights
		driver.switchTo().window(handle[1]);
		//perform some actions on flight page
		driver.findElement(By.id("from")).sendKeys("vijayawada");
		Thread.sleep(30000);
		//switch driver focus to IRCTC
		driver.switchTo().window(handle[0]);
		driver.findElement(By.id("usernameId")).sendKeys("babu");
		
		
		
	}

}
