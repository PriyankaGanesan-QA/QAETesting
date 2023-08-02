package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enblechk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		
ChromeDriver driver = new ChromeDriver();
				
driver.get("https://demo.openmrs.org/openmrs/login.htm");
WebElement login =driver.findElement(By.xpath("//*[@id='loginButton']"));

Boolean option = login.isEnabled();

if(option == true) {
	System.out.println("login button is enabled");
} else {
	System.out.println("login button is disabled");
}
	}

}
