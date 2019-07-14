package com.class4;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utills.CommonMethods;

public class ToolsQaEcample extends CommonMethods {
	
	@BeforeMethod(alwaysRun=true)
	public void setUP() {
		setUpDriver("chrome", "https://www.toolsqa.com/automation-practice-form/");
	}
	
	@DataProvider()
	public Object [][] setUpData(){
		Object[][] data=new Object[4][3];
		data[0][0]="huseyin";
		data[0][1]="nebili";
		data[0][2]="00-00-0000";
		
		data[1][0]="mustafa";
		data[1][1]="dama";
		data[1][2]="00-01-0000";
		
		data[2][0]="elon";
		data[2][1]="musk";
		data[2][2]="00-02-0000";
		
		data[3][0]="ali";
		data[3][1]="mehmet";
		data[3][2]="00-03-0000";
		return data;
	}
	
	@Test(dataProvider ="setUpData")
	public void getData(String first, String last, String date) throws InterruptedException {
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys(first);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys(last);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='datepicker']")).sendKeys(date);
		Thread.sleep(2000);
	}
	
@AfterMethod
public void tearDown() {
	driver.close();
}
	}

