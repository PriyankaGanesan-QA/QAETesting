package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterex {
	
	WebDriver driver;
	String fb = "https://demo.openmrs.org/openmrs/login.htm";
	
	@Test
	@Parameters({"Username","Password"})
    void sample(String Username, String Password) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		
		  driver = new ChromeDriver();
		  
		  driver.get(fb);
		
		WebElement login =driver.findElement(By.xpath("//input[@id='username']"));
		login.sendKeys(Username);
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		 pwd.sendKeys(Password);
		
	}
}
