package com.selenium.logicalscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTableDemo extends CommonClass {
	@Test
	public void webTableTest() throws Exception
	{
		driver.get("http://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(30000);
		
		List<WebElement> dates= driver.findElements(By.xpath("//div[@id='ui-datepicker-div']"));
		int total_nodes = dates.size();
		for(int i=0;i<total_nodes;i++ )
		{
			String dt=dates.get(i).getText();
		if(dt.equalsIgnoreCase("30"))
		{
			dates.get(i).click();
			break;
		}
		Thread.sleep(4000);
		}
		
		Thread.sleep(4000);

}
}