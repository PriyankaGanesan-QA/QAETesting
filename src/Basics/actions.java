package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
				
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		
		Actions obj = new Actions(driver);
		
		WebElement element1 = driver.findElement(By.xpath("//*[@id='username']"));
		
		Action single = obj.moveToElement(element1).build();
				single.perform();
		
		

	}

}
