package com.selenium.logicalscripts;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WebTableDemo1 extends CommonClass {
	@Test
	public void webtableTest() throws Exception
	{
		driver.get("http://aponline.gov.in/apportal/contact/sec_select.asp?sid=1");
		assertEquals(":: Government Orders ::",driver.getTitle());
		Select dd= new Select(driver.findElement(By.id("Select1")));
		dd.selectByIndex(1);
		Thread.sleep(3000);
		//find out the no rows in table
		List<WebElement>tr_collection = driver.findElements(By.xpath("//table[@id='Table9']/tbody/tr"));
		System.out.println("NO OF ROWS IN TABLE:"+tr_collection.size());
		
		//find out no of columns in table 
		List<WebElement>td_collection = driver.findElements(By.xpath("//table[@id='Table9']/tbody/tr/td"));
		System.out.println("No of columns in table:"+td_collection.size()/tr_collection.size());
		
		int row_num,col_num;
		
		//Enhanced for loop
		row_num=1;
		for(WebElement trElement : tr_collection)
		{
			List<WebElement> td_collection1 = trElement.findElements(By.xpath("td"));
			System.out.println("NUMBER OF COLUMNS="+row_num+" "+td_collection1.size());
			col_num=1;
			
			for(WebElement tdElement : td_collection1)
			{
				System.out.println("Row # "+row_num+", Col # "+col_num  + ", Text=" +tdElement.getText());
				col_num++;
			}
			row_num++;
		}
		
		
		
	}

}
//Output
/*NO OF ROWS IN TABLE:3
No of columns in table:7
NUMBER OF COLUMNS=1 7
Row # 1, Col # 1, Text=Name
Row # 1, Col # 2, Text=Designation
Row # 1, Col # 3, Text=Office Phone
Row # 1, Col # 4, Text=Residence Phone
Row # 1, Col # 5, Text=Secretariat Office
Row # 1, Col # 6, Text=Fax
Row # 1, Col # 7, Text=E-Mail
NUMBER OF COLUMNS=2 7
Row # 2, Col # 1, Text=.  .
Row # 2, Col # 2, Text=Chief Secretary to Government (APC)
Row # 2, Col # 3, Text=0866-2428914
Row # 2, Col # 4, Text= 
Row # 2, Col # 5, Text= 
Row # 2, Col # 6, Text= 
Row # 2, Col # 7, Text=sptuckar@ap.gov.in
NUMBER OF COLUMNS=3 7
Row # 3, Col # 1, Text=Sri  Budithi Rajasekhar, IAS
Row # 3, Col # 2, Text=Special Chief Secretary to Government (Agriculture)
Row # 3, Col # 3, Text= 
Row # 3, Col # 4, Text= 
Row # 3, Col # 5, Text=4th-Block, Floor - G,Room No-101
Row # 3, Col # 6, Text= 
Row # 3, Col # 7, Text=prlsecy_agr@ap.gov.in*/