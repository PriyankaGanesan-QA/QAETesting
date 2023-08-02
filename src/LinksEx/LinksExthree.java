package LinksEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");		
		
// counting specific number of links in a page
		
		List<WebElement> langlinks=	driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
int links = langlinks.size();
		
System.out.println(links);

driver.close();

	}

}
