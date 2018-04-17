package com.selenium.logicalscripts;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadUsingRobotClass {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\Lib\\bin\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.sendspace.com/");
	    driver.findElement(By.id("upload_file")).click();
	   
        StringSelection stringSelection = new StringSelection("C:\\Users\\purushotham\\111517_puru.xlsx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        
        Robot robot=new Robot();
        //press contl+v
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        //release cnt+v
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        
        //press enter
        robot.keyPress(KeyEvent.VK_ENTER);
        //press release
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        
	}

}
