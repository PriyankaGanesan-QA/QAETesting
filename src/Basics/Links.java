package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		
		
		driver.get("http://demo.guru99.com/test/link.html");
		
		
		
		List<WebElement> options = driver.findElements(By.xpath("//a[contains(text(),'click here')]"));
		int size1= driver.findElements(By.xpath("//a[contains(text(),'click here')]")).size();
		System.out.println(size1);
		
		for(WebElement all : options) {
			
			all.click();
			
			String option2 = driver.getTitle();
			System.out.println(option2);
			String expected ="Google";
			
                if(expected.equals(option2)) {
                	System.out.println("Google opened");
                }
                
                driver.navigate().back();
                Thread.sleep(5000);
                driver.navigate().refresh();
                int size2= driver.findElements(By.xpath("//a[contains(text(),'click here')]")).size();
        		System.out.println(size2);
                Thread.sleep(6000);
	}

}
	
}
