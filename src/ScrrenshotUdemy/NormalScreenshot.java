package ScrrenshotUdemy;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		System.out.println("abcdefgh");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("C:\\Users\\Priyanka\\Screenshots\\Screenshots2.png"));
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("ab" + Keys.ENTER);	
		driver.close();

	}

}
