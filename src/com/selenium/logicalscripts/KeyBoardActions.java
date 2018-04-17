package com.selenium.logicalscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\Lib\\bin\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		/*driver.get("https://www.google.co.in");
	    driver.findElement(By.name("q")).sendKeys("selenium by Ramesh");
		driver.findElement(By.name("btnK")).click();
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN);
		Thread.sleep(3000);
		actions.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(3000);
		actions.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(3000);
		actions.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(3000);
		driver.quit();
	
		// keys is Enum class, by using Enum class we can define our own datatypes
		
		*/
		
		// In order to perform control + , cntrl+shif operations ,keys Enum class has one method called "chord()" method.
		
		driver.get("https://www.flipkart.com/");
		Actions actions = new Actions(driver);
		//perform ctrl+s operation
		actions.sendKeys(Keys.chord(Keys.CONTROL,"s")).build().perform();
		//perform 'ctrl+shift+s' operation
		actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,"s")).build().perform();
		
		
		driver.quit();
		
		
		
		

	}

}
