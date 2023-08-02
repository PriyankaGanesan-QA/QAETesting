package Basics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	
	WebDriver driver;
	String fb = "https://www.facebook.com/"; 
	Properties prop ;
	
	@BeforeTest
	void test() throws FileNotFoundException{
		
	File f = new  File("D:\\Automation\\Selenium\\src\\Basics\\NewTest.java");

	FileInputStream fileinput = new FileInputStream(f);
	prop = new Properties();
	try {
		prop.load(fileinput);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
	
	  driver = new ChromeDriver();
	  
 
		
	
	}
	
	@Test
	void testnew() {
		 driver.get(prop.getProperty("fburl"));
		
		WebElement login =driver.findElement(By.xpath("//*[@id='email']"));
		login.sendKeys(prop.getProperty("Username"));
		
		WebElement pwd = driver.findElement(By.xpath("//*[@id='passContainer']"));
		 pwd.sendKeys(prop.getProperty("Password"));
		
	}
  
  
  

}
