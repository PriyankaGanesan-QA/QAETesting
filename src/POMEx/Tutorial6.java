package POMEx;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tutorial6 {
	 
//Parameters	
	
@Test
@Parameters({"URL", "Username","Password"})
void test(String URL, String Username, String Password) {
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		
ChromeDriver driver = new ChromeDriver();
		
driver.get(URL);


driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys(Username);

driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys(Password);

driver.findElement(By.xpath("/html/body/form/input[3]")).click();
	}

}
