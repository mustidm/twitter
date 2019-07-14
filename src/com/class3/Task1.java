package com.class3;

import org.openqa.selenium.By;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import utills.CommonMethods;

public class Task1 extends CommonMethods {
@BeforeGroups(groups= {"Smoke1","Regression2","Smoke2","Regression1"})
public void setUP() {
	setUpDriver("chrome", "https://www.saucedemo.com/");
}


@Test(groups="Smoke2")
public void userOne() {
	sendText(driver.findElement(By.cssSelector("#user-name")), "standart_user");
sendText(driver.findElement(By.cssSelector("#password")), "secret_sauce");
driver.findElement(By.cssSelector("input.btn_action")).click();
}
@Test(groups="Regression1")
public void userTwo() {
	sendText(driver.findElement(By.cssSelector("#user-name")), "problem_user");
sendText(driver.findElement(By.cssSelector("#password")), "secret_sauce");
driver.findElement(By.cssSelector("input.btn_action")).click();
}
@Test(groups="Regression2")
public void userThree() {
	sendText(driver.findElement(By.cssSelector("#user-name")), "performance_glitch_user");
sendText(driver.findElement(By.cssSelector("#password")), "secret_sauce");
driver.findElement(By.cssSelector("input.btn_action")).click();
}
@AfterGroups ({"Smoke1","Regression2","Smoke2","Regression1"})
public void tearDown() throws InterruptedException {
	Thread.sleep(3000);
	driver.quit();
}
}
