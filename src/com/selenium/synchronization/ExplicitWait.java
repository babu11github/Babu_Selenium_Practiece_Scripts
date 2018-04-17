package com.selenium.synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWait {

	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\Lib\\bin\\geckodriver.exe");
	    driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
	}
	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	}

@Test
public void test() throws Exception
{
	driver.get("https://accounts.google.com");
	WebElement username = driver.findElement(By.id("identifierId"));
	username.clear();
	username.sendKeys("babuyadav232@gmail.com");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("password")).sendKeys("********");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	// explicitly wait
	WebDriverWait wait = new WebDriverWait(driver,30);
	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
	driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
	//wait.until(ExpectedConditions.elementToBeClickable(locator));
	//wait.until(ExpectedConditions.elementToBeSelected(locator))
	
	
	
}
	
}

