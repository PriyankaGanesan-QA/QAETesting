package listenerrr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testcase1 {
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement username;
	
	@FindBy(xpath="//input[@id='pass']")
	public WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	public WebElement login;
	
	WebDriver driver;
	
	public testcase1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
