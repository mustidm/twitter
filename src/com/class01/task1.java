package com.class01;
//TC 1: Swag Lab Title and Login Verification
//@BeforeMethod should contain navigation to the URL and title verification
//@Test should contain steps to login and “Product” word verification
//@AfterMethod should logOut from the application and close the browser

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utills.CommonMethods;

public class task1 extends CommonMethods {

	@BeforeMethod
	public void setUP(){
		setUpDriver("chrome", "https://www.saucedemo.com");	
	
	}
	
	@Test
	public void login() {
	      driver.findElement(By.id("user-name")).sendKeys("standard_user");
	   
	      driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  
	      driver.findElement(By.className("btn_action")).click();
	      
	      WebElement product=driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]"));
	      if(product.getText().contains("Products")) {
	    	  System.out.println("Yes there is");
	      }
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}}