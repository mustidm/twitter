package odev;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import utills.CommonMethods;

public class excel extends CommonMethods {

	@BeforeMethod
	public static void giris() {
		setUpDriver("chrome", "https://www.twitter.com");
	}
@Test(dataProvider="sinan")
public void bilgiler(String name, String pass) throws InterruptedException {
	LoginPageWithoutPageFactory login=new LoginPageWithoutPageFactory();
	
	CommonMethods.sendText(login.username,name);
	Thread.sleep(3000);
	String a = "window.open('about:blank','_blank');";
	((JavascriptExecutor)driver).executeScript(a);
	CommonMethods.sendText(login.password,pass);
	Thread.sleep(3000);
	CommonMethods.click(login.btnLogin);
Thread.sleep(3000);

driver.navigate().to("https://twitter.com/selamyegenim");

	CommonMethods.waitForElementBeClickable(driver.findElement(By.xpath("//*[@id=\"stream-item-tweet-1150148624220905472\"]/div[1]/div[2]/div[4]/div[2]/div[2]/button[1]/div/span[1]")), 10);

	CommonMethods.click(driver.findElement(By.xpath("//*[@id=\"stream-item-tweet-1150148624220905472\"]/div[1]/div[2]/div[4]/div[2]/div[2]/button[1]/div/span[1]")));
	
	driver.findElement(By.xpath("//*[@id=\"retweet-tweet-dialog-dialog\"]/div[2]/form/div[2]/div[3]/button/span[1]")).click();

	
	Thread.sleep(2000);		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
}

@DataProvider(name = "sinan")
public Object[][] getData() {
	
	Object[][] data=new Object[2][2];
	//1 set
	data[0][0]="Frank51060297";
	data[0][1]="abcde1234";

	//2 set
	data[1][0]="selamyegenim";
	data[1][1]="Twitter2019";

	return data;
}



@AfterMethod
public void cikis() {
	driver.quit();
}
}
