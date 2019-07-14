package com.class02;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utills.CommonMethods;

public class Task1 extends CommonMethods {
//	TC 1: OrangeHRM Title Validation
//
//	TC 2: OrangeHRM Successful Login 
//	https://opensource-demo.orangehrmlive.com/
//	Please make sure to use the following:
//	 annotations:
//		@BeforeMethod
//		@AfterMethod
//		@Test
//	What would you do if you do not want to execute any specific test case?
//	What would you do if you want to execute any specific test case first?
	
	@BeforeMethod
	public void first() {
		String url="https://opensource-demo.orangehrmlive.com/";
		setUpDriver("chrome", url);	
	}
	@Test(priority =1,enabled = false)
	public void Title() {
		String Title= driver.getTitle();
		String expectedTitle= "OrangeHRM";
		if(Title.equals(expectedTitle)) {
			System.out.println("correct title");
		}else {
			System.out.println("wrong title");
		}
		
	}
	@Test(priority =2,enabled = true)
	public void login() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		sendText(driver.findElement(By.cssSelector("input#txtPassword")), "admin123");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		driver.findElement(By.className("button")).click();
	}
	@AfterMethod
	public void quit() {
		driver.close();
	}
	
	
}
