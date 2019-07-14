package com.class4;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utills.CommonMethods;

public class saucedemo extends CommonMethods {

	@Parameters({ "browser", "url" })
	@BeforeMethod
	public void setUp(String chrome, String link) {
		CommonMethods.setUpDriver(chrome, link);
	}

	@Parameters({ "name", "password" })
	@Test
	public void UserName1(String namee, String passwordd) throws InterruptedException {
		Thread.sleep(1000);
		sendText(driver.findElement(By.id("user-name")), namee);
		Thread.sleep(1000);
		sendText(driver.findElement(By.id("password")), passwordd);
		Thread.sleep(1000);
		driver.findElement(By.className("btn_action")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//div[text()='Products']")).isDisplayed(), true);
	}

	@Parameters({ "name2", "password2" })
	public void UserName2(String namee2, String passwordd2) {

		sendText(driver.findElement(By.id("user-name")), namee2);
		sendText(driver.findElement(By.id("password")), passwordd2);
		driver.findElement(By.className("btn_action")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//div[text()='Products']")).isDisplayed(), true);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}