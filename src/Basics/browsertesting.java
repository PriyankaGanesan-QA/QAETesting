package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class browsertesting {
	
	WebDriver driver;
	
	@Test
	@Parameters({"Chrome"})
	void test(String Chrome) {
		
		if (Chrome.equals(Chrome)) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		
		  driver = new ChromeDriver();
		  
		  driver.get(Chrome);
		  
		  
		}
		  
	}
		
		
	}
		
	


