package com.selenium.logicalscripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootStrabDD {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\Lib\\bin\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.findElement(By.id("menu1")).click();
		List<WebElement> dd_menu = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));//stored in list object
		System.out.println(dd_menu.size());
		
		for(int i=0;i<dd_menu.size();i++)
		{
			System.out.println(dd_menu.get(i).getText());
		if(dd_menu.get(i).getText().contains("JavaScript"))
		{
			dd_menu.get(i).click();
			break;
		}
		
		
		
		
		/*for(WebElement element:dd_menu)
		{
			String innerhtml = element.getAttribute("innerHTML");
			
			if(innerhtml.contains("CSS"))
			{
				element.click();
				break;
			}
			System.out.println("values from drop down is"+innerhtml);
		}
		driver.quit();
		
		}
*/
  }
 }
}