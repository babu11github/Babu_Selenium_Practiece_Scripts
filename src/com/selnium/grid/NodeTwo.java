package com.selnium.grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class NodeTwo {

	static WebDriver driver;
	static String nodeUrl;
		@Test
		public void nodeTest()
		{
			try {
				nodeUrl = "http://192.168.0.6:5555/wd/hub";
				DesiredCapabilities capabilities = DesiredCapabilities.firefox();
				capabilities.setBrowserName("firefox");
				capabilities.setPlatform(Platform.WINDOWS);
				driver = new RemoteWebDriver(new URL(nodeUrl),capabilities);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
				driver.manage().deleteAllCookies();
				driver.get("https://en-gb.facebook.com/login/");
				driver.findElement(By.id("pass")).sendKeys("vijaya");
			} catch (MalformedURLException e) {
				
				e.printStackTrace();
			}

	}

}
