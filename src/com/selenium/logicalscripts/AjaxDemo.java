package com.selenium.logicalscripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AjaxDemo extends CommonClass {
	@Test
	public void ajaxTest() throws Exception
	{
		//Load web page
				driver.get("http://www.veethi.com/places/india_banks-ifsc-micr-codes.html");
				assertEquals("Bank IFSC Codes, MICR Codes: Find IFSC, MICR Codes for Major Banks in India",driver.getTitle());
				
				selectOption(driver.findElement(By.id("selBank")),"Axis Bank");
				selectOption(driver.findElement(By.id("selState")),"Andhra Pradesh");
				selectOption(driver.findElement(By.id("selCity")),"Hyderabad");
				selectOption(driver.findElement(By.id("selBranch")),"Madhapur");
				Thread.sleep(4000);
	}
	public void selectOption(WebElement locator,String optionname)
	{
		Select dd=new Select(locator);
		dd.selectByVisibleText(optionname);
	}

}
