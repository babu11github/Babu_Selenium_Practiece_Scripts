package com.selenium.logicalscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Utility.HelperClass;

public class HilightElements extends CommonClass{

	@Test
	public void highlight() {
		
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.clear();
		HelperClass.highLightElement(driver, username);
		username.sendKeys("babuyadav232@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		HelperClass.highLightElement(driver, password);
		password.sendKeys("babu11");
		
		
		 }
		  
    }
   




