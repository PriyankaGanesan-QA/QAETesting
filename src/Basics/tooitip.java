package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tooitip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
				
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.manage().window().maximize();
		
		
		
		WebElement acttooltip = driver.findElement(By.xpath("https://jqueryui.com/tooltip///*[@id='age']"));
		acttooltip.click();
		String s1 = acttooltip.getAttribute("title");
		
		System.out.println(s1);
	}

}
