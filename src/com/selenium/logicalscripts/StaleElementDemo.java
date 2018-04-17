package com.selenium.logicalscripts;
    
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	
	public class StaleElementDemo {
		
           public static void main(String[] args) throws Exception {
			// Launch browser
        	System.setProperty("webdriver.gecko.driver","D:\\selenium\\Lib\\bin\\geckodriver.exe");
       	    WebDriver d=new FirefoxDriver();
			//Maximize
			d.manage().window().maximize();
			//Load web page
			d.get("https://www.google.co.in");
			//Type text
			d.findElement(By.id("lst-ib")).sendKeys("Selenium");
			//Click on search
			d.findElement(By.name("btnK")).click();
			Thread.sleep(4000);
			//2nd page link
			d.findElement(By.linkText("2")).click();
			Thread.sleep(4000);
			//Click on Previous link
			d.findElement(By.linkText("Previous")).click();
			d.findElement(By.linkText("Previous")).click();
			Thread.sleep(4000);
			//Close browser
			d.quit();



	}


}
