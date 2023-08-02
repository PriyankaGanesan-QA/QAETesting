package listenerrr;

import org.openqa.selenium.WebDriver;

public class method {
	
	public static WebDriver driver;
	String FB = "https://www.facebook.com/";
	
	public void validlogin() {
		driver.get(FB);
		testcase1 test = new testcase1(driver);
		
		
	}

}
