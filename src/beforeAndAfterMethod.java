import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class beforeAndAfterMethod {

	@BeforeMethod
	public void beforeMethod() {
	System.out.println("beforeMethod");	
		
	}
	
	@Test
    public void testMethodOne() {
	System.out.println("testMethodOne");
	
}
	@Test
	public void testMethodTwo() {
		System.out.println("TestMethodTw0");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
		
	}
}
