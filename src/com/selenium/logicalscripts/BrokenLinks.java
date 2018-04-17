package com.selenium.logicalscripts;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrokenLinks extends CommonClass {
@Test
public void brokenLinksTest() throws Exception
{
	//Load web page
			driver.get("http://www.seleniumhq.org/");
			assertEquals("Selenium - Web Browser Automation",driver.getTitle());
			List<WebElement> l= driver.findElements(By.xpath("//li[starts-with(@id,'menu')]"));
			System.out.println("no of links :"+l.size());
			System.out.println("********* Link Names ***********");
			String links[] = new String[l.size()];
			int i=0;
			for(WebElement e:l)
			{
				System.out.println(e.getText());
				links[i] = e.getText();
				i++;
			}
			for(String s : links)
			{
				driver.findElement(By.linkText("s")).click();
				if(driver.getTitle().contains("404")|| driver.getTitle().contains("500"))
				{
					System.out.println("Link:"+s+":is not working");
					//Assert.fail();
				}else
				{
					System.out.println("Link:"+s+":is working fine");
				}
			}
			Thread.sleep(2000);
}
}
