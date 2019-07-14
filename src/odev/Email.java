package odev;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utills.CommonMethods;

public class Email extends CommonMethods{
@Test(invocationCount =1)
public void email() throws InterruptedException {
	setUpDriver("chrome","https://temp-mail.org/en/");
	Thread.sleep(2000);
	//String email= driver.getWindowHandle();
driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/form/div[2]/button")).click();

String a = "window.open('https://www.twitter.com','_blank');";
((JavascriptExecutor)driver).executeScript(a);
Thread.sleep(2000);
ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(tabs.get(1));

driver.findElement(By.xpath("//*[@id=\"doc\"]/div/div[1]/div[1]/div[2]/div[2]/div/a[1]")).click();

WebElement WithMonth= driver.findElement(By.xpath("//div/div/div[1]/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div[4]/span"));
WebElement NoMonth=   driver.findElement(By.xpath("//div/div/div[1]/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div[4]/span"));

if(WithMonth.isEnabled()) {
	WithMonth.click();
}else if (NoMonth.isEnabled()) {
	NoMonth.click();
	
}






Thread.sleep(2000);

}
	
}
