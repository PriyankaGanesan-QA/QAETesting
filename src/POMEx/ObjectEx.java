package POMEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page object model
/*public class ObjectEx {

	WebDriver driver;
	ObjectEx(WebDriver driver){
		this.driver=driver;
	}
	
	
	
	
By username = By.xpath("/html/body/form/input[1]");

By password = By.xpath("/html/body/form/input[2]");

By login =   By.xpath("/html/body/form/input[3]");


public WebElement uname() {
	
	return driver.findElement(username);
}

public WebElement pname() {
	
	return driver.findElement(password);
}

public WebElement btn() {
	
	return driver.findElement(login);
}
*/

//using page factory

public class ObjectEx{
	
	WebDriver driver;
	ObjectEx(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
@FindBy(xpath="/html/body/form/input[1]")
WebElement Username;

@FindBy(xpath="/html/body/form/input[2]")
WebElement Password;

@FindBy(xpath="/html/body/form/input[3]")
WebElement login;



}













