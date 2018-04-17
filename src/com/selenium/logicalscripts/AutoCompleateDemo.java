package com.selenium.logicalscripts;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AutoCompleateDemo extends CommonClass{
	@Test
	public void autoSugetionTest() throws Exception
	{
		//Load web page
				driver.get("http://jqueryui.com/autocomplete/");
				assertEquals("Autocomplete | jQuery UI",driver.getTitle());
				//Switch driver focus to frame
				driver.switchTo().frame(0);
				//Type text
				driver.findElement(By.id("tags")).sendKeys("a");
				List<WebElement> s=driver.findElements(By.className("ui-menu-item"));
				System.out.println("No of suggestions:"+s.size());
				String suggestion[]=new String[s.size()];
				System.out.println("********** Suggestions are ***************");
				int i=0;
				for(WebElement e:s)
				{
					System.out.println(e.getText());
					suggestion[i]=e.getText();
					i++;
				}
				for(String s1:suggestion)
				{
					driver.findElement(By.id("tags")).sendKeys(Keys.ARROW_DOWN);
					if(s1.equals("Asp"))
					{
						driver.findElement(By.id("tags")).sendKeys(Keys.ENTER);
						break;
					}
					Thread.sleep(1000);
				}
				assertEquals("Asp",driver.findElement(By.id("tags")).getAttribute("value"));
				Thread.sleep(4000);
				
				
	}

}
