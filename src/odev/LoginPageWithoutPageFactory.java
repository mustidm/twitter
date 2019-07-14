package odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import utills.CommonMethods;



public class LoginPageWithoutPageFactory extends CommonMethods {

	public WebElement username = driver.findElement(By.xpath("//*[@id=\"doc\"]/div/div[1]/div[1]/div[1]/form/div[1]/input"));
	public WebElement password = driver.findElement(By.xpath("//*[@id=\"doc\"]/div/div[1]/div[1]/div[1]/form/div[2]/input"));
	public WebElement btnLogin = driver.findElement(By.xpath("//*[@id=\"doc\"]/div/div[1]/div[1]/div[1]/form/input[1]"));

	
}
