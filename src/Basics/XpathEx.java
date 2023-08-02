package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
				
		
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		
  WebElement usrname = driver.findElement(By.xpath("//input[@id='username']"));
  usrname.sendKeys("admin");
  
  WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
  pwd.sendKeys("Admin123");
  
  WebElement location = driver.findElement(By.xpath("//li[@id='Laboratory']"));
  location.click();
  
 
  
  WebElement login = driver.findElement(By.xpath("//input[@id='loginButton']"));
login.click();

WebElement reg = driver.findElement(By.xpath("//a[@id='referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension']"));
reg.click();

WebElement fname = driver.findElement(By.xpath("//input[@name='givenName']"));
fname.sendKeys("Priyanka");

WebElement lname = driver.findElement(By.xpath("//input[@name='familyName']"));
lname.sendKeys("Ganesan");

WebElement next = driver.findElement(By.xpath("//button[@id='next-button']"));
next.click();

WebElement option = driver.findElement(By.xpath("//*[@id='gender-field']/option[2]"));
option.click();

WebElement next1 = driver.findElement(By.xpath("//button[@id='next-button']"));
next1.click();

WebElement bdate = driver.findElement(By.xpath("//input[@id='birthdateDay-field']"));
bdate.sendKeys("30");

WebElement month = driver.findElement(By.xpath("//select[@id='birthdateMonth-field']"));

Select s1 = new Select(month);

//s1.selectByVisibleText("August");
//s1.selectByValue("8");
s1.selectByIndex(8);

WebElement year = driver.findElement(By.xpath("//input[@id='birthdateYear-field']"));
year.sendKeys("1994");

driver.close(); 





	}
	

}
