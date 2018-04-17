package com.selenium.logicalscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MultipleFramesDemo extends CommonClass {
	@Test
	public void testFrame() throws Exception
	{
		//Load web page
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		List<WebElement> list = driver.findElements(By.tagName("frame"));
		System.out.println("no of frames :"+list.size());
		
		//switch to 1 St frame
		driver.switchTo().frame(0);
		//scroll down and up
        JavascriptExecutor js = (JavascriptExecutor)driver;
    
        driver.findElement(By.linkText("org.openqa.selenium.lift")).click();
        
        js.executeScript("arguments(0).scrollIntoView(true);","");
        
        Thread.sleep(3000);
        
        // 2 nd frame
        
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        driver.findElement(By.linkText("Matchers")).click();
        Thread.sleep(3000);
        
        // 3 rd frame
        
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        driver.findElement(By.linkText("Overview")).click();
        
}
}