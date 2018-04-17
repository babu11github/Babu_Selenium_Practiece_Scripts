package com.Utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestUtility {
	
	public static void captureScreenShot(WebDriver driver,String ScreenShotName)
	{
		try {
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
			Date dt = new Date();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
			FileUtils.copyFile(src,new File("./ScreenShot/"+ScreenShotName+dateFormat.format(dt)+ ".png"));
			System.out.println("screenshot taken");
		} catch (IOException e) {
			
			System.out.println("exception while taking screen shot"+e.getMessage());
		}
		
		
	}

}
