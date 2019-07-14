package odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utills.CommonMethods;

public class odev3 extends CommonMethods{
/*
 * : OrangeHRM Verify Employee Details
	Step 1: Click on PIM link and Employee List
	Step 2: Search for employee by it id
	Step 3: Verify Employee details are displayed 
 */
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
	  @Test(priority =3 )
		public void addEmp() {
		WebElement hover=driver.findElement(By.id("menu_pim_viewPimModule"));
		Actions action= new Actions(driver);
		action.moveToElement(hover).perform();
	}
//		@Test(priority=4)
//		public void add() {
//			driver.findElement(By.xpath("//a[text()='Employee List']")).click();
//
//		List<WebElement> rows=driver.findElements(By.xpath("//table/tbody/tr/td"));
//		for(WebElement row:rows) {
//			if(row.getText().equals("0013")) {
//				System.out.println(row.getLocation());
//			}
//		}
//		}
		



}
