package com.selenium.logicalscripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragNDrop extends CommonClass{
	
	@Test
	public void dragNdropTest() throws Exception
	{
		//Load web page
				driver.get("http://jqueryui.com/droppable/");
				assertEquals("Droppable | jQuery UI",driver.getTitle());
				//Switch driver focus to frame
				driver.switchTo().frame(0);
				Actions a=new Actions(driver);
				a.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
				Thread.sleep(4000);
	}

}
