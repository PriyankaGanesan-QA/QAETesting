package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		
ChromeDriver driver = new ChromeDriver();
		
driver.get("https://toolsqa.com");

String s1 = driver.getTitle();

System.out.println(s1);

	}

}
