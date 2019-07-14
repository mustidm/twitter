package com.class4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utills.CommonMethods;
public class odev extends CommonMethods {
	@Parameters({ "browserr", "urll" })
	@BeforeClass
	public void login(String browser, String url) {
		setUpDriver(browser, url);
	}
   @Parameters({"giris","sifre"})
	@Test
	public void Task1(String giriss, String sifree) {
		driver.findElement(By.cssSelector("#ctl00_MainContent_username")).sendKeys(giriss);
		sendText(driver.findElement(By.cssSelector("#ctl00_MainContent_password")), sifree);
		driver.findElement(By.cssSelector("#ctl00_MainContent_login_button")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector("div.login_info")).isDisplayed(), true);	
	}
   @Test
   public void Task2() throws InterruptedException {
	     driver.findElement(By.xpath("//a[text()='Order']")).click();
	        
	        Select Products=new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_ddlProduct\"]")));
	        Products.selectByVisibleText("FamilyAlbum");
	        
	        WebElement Musti=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]"));
	        Musti.clear();
	        Musti.sendKeys("10");;
	        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtUnitPrice\"]")).clear();
	        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtUnitPrice\"]")).sendKeys("40");
	        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtDiscount\"]")).clear();
	        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtDiscount\"]")).sendKeys("30");
	        
	        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtName\"]")).sendKeys("Elon");
	        sendText(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]")), "24 crossing way");
	        sendText(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox3\"]")), "Wayne");
	        sendText(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox4\"]")), "NewJersey");
	        sendText(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox5\"]")), "07514");
	        
	        List<WebElement> banka=driver.findElements(By.xpath("//ol/li/table/tbody/tr/td"));
	        for(WebElement bankalar: banka) {
	            if(bankalar.getText().contains("MasterCard")) {
	                bankalar.click();     
	            }}
	            sendText(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox6\"]")), "78945121313");
	            sendText(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox1\"]")), "09/20");
	  
	            driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_InsertButton\"]")).click();
	            driver.findElement(By.xpath("//a[text()='View all orders']")).click();
	          
	            List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr"));
	            
	            String expectedValue="Elon";
	            for (int i=1; i<=rows.size(); i++) {
	    			String rowText=driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr["+i+"]")).getText();
	    			
	    			if(rowText.contains(expectedValue)) {
	    				driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr["+i+"]/td[13]")).click();
	    			break;
	    			}
	            }
	            Thread.sleep(3000);
	            driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]")).clear();
	           Thread.sleep(3000);
	            driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]")).sendKeys("45 washington street");
	            Thread.sleep(3000);
	            driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_UpdateButton\"]")).click();
   }
  
	@AfterClass
	public void quit() {
driver.quit();
	}

}
