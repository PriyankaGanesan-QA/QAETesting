package LinksEx;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/link.xhtml");	
		
	String pagename =	driver.findElement(By.xpath("//*[@id='j_idt87']/div/div[1]/div[2]/div/div/a")).getAttribute("href");
 
	System.out.println(pagename);
	}

}
