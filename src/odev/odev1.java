package odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utills.CommonMethods;

public class odev1 extends CommonMethods{
	
//
//TC 1: OrangeHRM Verify Successful Login
//Step 1: Open browser and navigate to OrangeHRM
//Step 2: Enter valid UID and valid PWD and click login button
//Step 3: Verify user successfully logged in

	@BeforeClass
	public void giris() {
	String url= "https://opensource-demo.orangehrmlive.com/";
		setUpDriver("Chrome", url);
	}
	
	
	@Test(priority =1, enabled = true)
	public void login() {
		sendText(driver.findElement(By.id("txtUsername")), "Admin");
		sendText(driver.findElement(By.id("txtPassword")), "admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Test(priority =2, enabled = true)
	public void verify() {
		WebElement user =driver.findElement(By.xpath("//*[@id=\"welcome\"]"));
		if (user.getText().contains("Admin")) {
			System.out.println("yes there is");
		}
	}
	
	
	@AfterClass
	public void quit() {
	
	}
	
}
