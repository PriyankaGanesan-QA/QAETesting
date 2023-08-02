package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginchk {
	
	//is displayed

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
  System.setProperty("Webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.amazon.in/");
  
 WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
searchbox.sendKeys("gifts" + Keys.ENTER);




		
		
	}

}
