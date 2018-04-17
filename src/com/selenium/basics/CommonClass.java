package com.selenium.basics;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class CommonClass {

	@Test
	public void test()
	{
		//for selenium supported latest version of firefox
	System.setProperty("webdriver.gecko.driver","D:\\selenium\\Lib\\bin\\geckodriver.exe");
	FirefoxOptions firefoxOptions = new FirefoxOptions();
    firefoxOptions.setCapability("marionette", true);
    WebDriver d= new FirefoxDriver(firefoxOptions);
	/*System.setProperty("webdriver.chrome.driver","D:\\selenium\\Lib\\bin\\chromedriver.exe");
	WebDriver d=new ChromeDriver();*/
	d.manage().deleteAllCookies();
	d.get("https://www.facebook.com/");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	d.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	WebElement emailTxt=d.findElement(By.id("email"));
	emailTxt.clear();
	emailTxt.sendKeys("siva");
	d.quit();
	

	}

}
