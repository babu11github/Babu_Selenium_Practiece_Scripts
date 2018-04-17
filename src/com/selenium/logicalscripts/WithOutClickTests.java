package com.selenium.logicalscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WithOutClickTests {

	public static void main(String[] args) {
	//we can perform clickable operations in following without click()
		//submit
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\Lib\\bin\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://en-gb.facebook.com/");
		WebElement ele= driver.findElement(By.id("u_0_3"));
		//ele.submit();
		
		//javascript executer
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",ele);
		
		//using sendkeys
		ele.sendKeys(Keys.ENTER);
		//using actions class sendkeys()
		Actions builder=new Actions(driver);
		builder.sendKeys(Keys.TAB).build().perform();
		builder.sendKeys(Keys.ENTER).build().perform();
		
		
		driver.quit();
		
		
		
		

	}

}
