package POMEx;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testingnew {

	// here we should not able to set the driver and url commonly in the class as in selenium
	//and we need to mention the driver and system proprty inside some method or in some precondition annotation
	
	@Test
	void test() throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
			
	driver.get("https://www.google.com/");
	
//	Thread.sleep(2000);
	
	 driver.switchTo().frame(0);
	
	driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button")).click();
	
	Thread.sleep(2000);
	
	driver.close();
	
	//Alert ab = driver.switchTo().alert();
	
	//Actions ab = new Actions(driver);
	
	
	//WebElement thanks = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button"));
	
	//WebElement search = driver.findElement(By.linkText("Gmail"));
	
	
//	ab.moveToElement(search);
//	ab.perform();
	
	}
	
}
