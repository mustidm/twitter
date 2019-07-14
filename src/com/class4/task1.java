package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utills.CommonMethods;


	public class task1 extends CommonMethods {
		@BeforeMethod (alwaysRun=true, groups="Smoke")
		public void setIP()  {
			String url="https://www.saucedemo.com/";
			setUpDriver("chrome", url);
		}
			
			@Test(groups= "Smoke")
public void Login() {
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
		    driver.findElement(By.className("btn_action")).click();
		}
			
	@Test(groups="Smoke")
	public void verify() {
		WebElement name=driver.findElement(By.cssSelector("div.product_label"));
	if(name.getText().contains("Products")){
		System.out.println("you are in page");
	}}
	@AfterMethod (alwaysRun=true, groups="Smoke")
		public void quit() {
			driver.quit();
		
	}
	}
