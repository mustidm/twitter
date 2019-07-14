package odev;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utills.CommonMethods;

public class odev2 extends CommonMethods{
/*
 * TC 2: OrangeHRM Add Employee
	Step 1: Click on PIM link and Add Employee
	Step 2: Provide Details and Save
	Step 3: Verify Employee is added 
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
	
	@Test(priority =2, enabled = true)
	public void verify() {
		WebElement user =driver.findElement(By.xpath("//*[@id=\"welcome\"]"));
		if (user.getText().contains("Admin")) {
			System.out.println("yes there is");
		}}
   @Test(priority =3 )
	public void addEmp() {
	WebElement hover=driver.findElement(By.id("menu_pim_viewPimModule"));
	Actions action= new Actions(driver);
	action.moveToElement(hover).perform();
	}
	@Test(priority=4)
	public void add() {
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		sendText(driver.findElement(By.className("formInputText")), "Hasan");
		sendText(driver.findElement(By.name("middleName")), "A");
		sendText(driver.findElement(By.xpath("//input[@name='lastName']")), "Mehmet");
		driver.findElement(By.xpath("//*[@id=\"chkLogin\"]")).click();
		sendText(driver.findElement(By.cssSelector("input#user_name")), "Hasann");
		sendText(driver.findElement(By.cssSelector("input#user_password")), "BAHAR(1234)");
		sendText(driver.findElement(By.cssSelector("input#re_password")), "BAHAR(1234)");
		driver.findElement(By.xpath("//*[@id=\"status\"]")).click();
		WebElement status=	driver.findElement(By.xpath("//*[@id=\"status\"]"));
		Select select=new Select(status);
		select.selectByVisibleText("Disabled");
		driver.findElement(By.cssSelector("input#btnSave")).click();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnAddAttachment\"]")));
		driver.findElement(By.cssSelector("a#menu_admin_viewAdminModule")).click();
	}
	@Test(priority=5)
	public void verify2() {
	List<WebElement> emps=driver.findElements(By.xpath("//table/tbody/tr/td"));
	for(WebElement emp:emps) {
	  if(emp.getText().contains("Mustafa")) {
		  System.out.println("There is Mustafa");
        break;
	  }
	}

	}
	@AfterClass
	public void quoit() {
    driver.quit();
	}
}