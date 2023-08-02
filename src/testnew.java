import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testnew {
	
	
	@BeforeMethod
	void google() {
		System.out.println("open url");
	}
	
	@Test
	void sam() {
		System.out.println("login");
		}
	
	@Test
	void unit() {
		System.out.println("login2");
		}
	
	@AfterMethod
	void close() {
		System.out.println("close url");
	}

}
