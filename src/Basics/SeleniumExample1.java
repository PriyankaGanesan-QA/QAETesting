package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//in this we mention the driver type and location of the driver as arguements
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		
		//launching cheome driver. Creating object for webdriver and calling chrome driver.
		
		ChromeDriver driver = new ChromeDriver();
		
		//launching url
		
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		
		// to get title of the page
		
		String expectedtitle ="Google";
		
		String actualtitle =driver.getTitle();
		
		System.out.println(actualtitle);
		
		if(expectedtitle.equals(actualtitle)) {
			
			System.out.println("Expected and actual are same");
		} else {
			System.out.println("Expected and actual are not same");
		}
		
		driver.close();
		
	}

}
