package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dependsex {

	WebDriver driver;
	String fb = "https://www.google.com";
	String sd = "www.user.com";
	
	@Test
	void test() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
			
		  driver = new ChromeDriver();
		  
		  driver.get(sd);
	}
	
	@Test(dependsOnMethods = {"test"})
	void sample() {

		System.out.println("testnew");
		
	}
}

