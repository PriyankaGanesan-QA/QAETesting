package LinksEx;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Finding links using linktext and Partial linktext
		
		System.out.println("NEW GIT COMMAND");
		

		System.out.println("NEW GIT COMMAND2");

		System.out.println("NEW GIT COMMANDdevelop");
		
		System.out.println("abcdefgh");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/link.xhtml");
		
		//driver.findElement(By.linkText("Go to Dashboard")).click();
		
		driver.findElement(By.partialLinkText("Go to")).click();
		
		
	}

}
