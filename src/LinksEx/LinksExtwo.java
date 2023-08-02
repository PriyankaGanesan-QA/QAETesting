package LinksEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     //countingand printing total number of links in a page
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/link.xhtml");
		
		
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		
		int nooflinks = alllinks.size();
		
		System.out.println(nooflinks);
		
		for (WebElement linknames : alllinks) {
			System.out.println(linknames.getText());
		}
		
		
	}

}
