package Basics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class logintest {
	
  WebDriver driver;
  
  String fb = "https://demo.openmrs.org/openmrs/login.htm";
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		
	  driver = new ChromeDriver();
	  
	   }
  
  @Test
  public void ab() throws InterruptedException {
	  
	  driver.get(fb);
	  
	  WebElement usrname = driver.findElement(By.xpath("//input[@id='username']"));
	  usrname.sendKeys("admin");
	  
	  WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
	  pwd.sendKeys("Admin123");
	  
	  WebElement location = driver.findElement(By.xpath("//li[@id='Laboratory']"));
	  location.click();
	  
	 
	  
	  WebElement login = driver.findElement(By.xpath("//input[@id='loginButton']"));
	login.click();
		
		String actual = driver.getTitle();
		System.out.println(actual);
		
		String expected = "Home";
		
		if(actual.equals(expected)) {
			
			System.out.println("Tiltle is correct");
		} else {
			System.out.println("Tiltle is not correct");
		
		}
		driver.findElement(By.xpath("/html/body/header/nav/button/span")).click();
		
		driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[3]/a")).click();
		Thread.sleep(2000);
		
		 }
      
  
  @Test
  public void login() throws InterruptedException {
	  Thread.sleep(5000);
driver.get(fb);

	  
	  WebElement usrname = driver.findElement(By.xpath("//input[@id='username']"));
	  usrname.sendKeys("admin");
	  
	  WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
	  pwd.sendKeys("Admin113");
	  
	  WebElement location = driver.findElement(By.xpath("//li[@id='Laboratory']"));
	  location.click();
	  		
	  
  }

  @AfterTest
  public void afterTest() {
	 
  }

}
