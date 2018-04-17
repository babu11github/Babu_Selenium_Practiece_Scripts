package com.selenium.logicalscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadUsingSendkeys {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\Lib\\bin\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.sendspace.com/");
		//window or os  based popup
	    driver.findElement(By.id("upload_file")).sendKeys("D:\\VENGABABU\\Xls_Reader.java");
		Thread.sleep(5000);
		//driver.quit();
		

	}

}
