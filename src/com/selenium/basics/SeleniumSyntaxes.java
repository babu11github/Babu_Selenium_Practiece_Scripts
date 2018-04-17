package com.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSyntaxes {
	//to find number of rows in a webtable
	//1.to locate the table
	WebDriver driver=new ChromeDriver();
	WebElement table=driver.findElement(By.tagName("table"));
	List<WebElement> rows=driver.findElements(By.tagName("tr"));
	int rowscount=rows.size();
    //System.out.println("total no of rows is"+rowcount);
    
//to find no of columns in a webtable
	List<WebElement> columns=driver.findElements(By.tagName("td"));
	int columnscount=rows.size();
	{
    //System.out.println("total no of rows is"+rowcount);
	
	// to retrieve the text from the cell
	

	for(int row=0;row<rowscount;row++)
	{
		List<WebElement>columnsrow=rows.get(row).findElements(By.tagName("td"));
		for(int column=0;column<columnscount;column++)
		{
			String celltext=columnsrow.get(column).getText();
			System.out.println("cell value of row number"+row+" and column number"+column+"is"+celltext);
			
		
		}
	}
}
	
}
