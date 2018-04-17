package com.selenium.logicalscripts;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.spi.Configurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Log4jTest {
	WebDriver driver;
	@Test
	public void logTest() throws Exception {
		Logger logger=Logger.getLogger("Log4jTest");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\Lib\\bin\\geckodriver.exe");
	    driver=new FirefoxDriver();
	    logger.info("launch browser");
		driver.manage().window().maximize();
		logger.info("maximise window");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.navigate().to("http://www.seleniumhq.org/");
		logger.info("enter url");
		driver.findElement(By.linkText("Download")).click();
		logger.info("click download button");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
