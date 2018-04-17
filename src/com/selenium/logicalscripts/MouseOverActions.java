package com.selenium.logicalscripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOverActions extends CommonClass {
	@Test
	public void mouseActions() throws Exception
	{
		//Load web page
				driver.get("https://www.aptransport.in/tgcfstonline/");
				assertEquals("Welcome To TRANSPORT DEPARTMENT GOVERNMENT OF TELANGANA - INDIA",driver.getTitle());
				Actions a=new Actions(driver);
				a.moveToElement(driver.findElement(By.linkText("ALTERNATE ADDRESS ENTRY"))).perform();
				Thread.sleep(5000);
				driver.findElement(By.linkText("License Alternate Address Entry")).click();
				Thread.sleep(4000);
	}

}
