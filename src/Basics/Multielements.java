package Basics;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multielements {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		
ChromeDriver driver = new ChromeDriver();
		
		
driver.get("http://demo.guru99.com/test/ajax.html");


 List<WebElement> radiobuttons= driver.findElements(By.xpath("//*[@name='name']"));
 
 int total = radiobuttons.size();
 
 System.out.println("total number of buttons is " +" " +total);
 //for(WebElement alloptions : radiobuttons) {
	 
//	String all =  alloptions.getAttribute("value");
	//System.out.println(all);
//	alloptions.click();
// }

//is selected

   WebElement yes = driver.findElement(By.xpath("//*[@id='yes']"));
   yes.click();
   
   Boolean option1 = yes.isSelected();
   
   if(option1==true) {
	   System.out.println("the option is selected");
   } else {
	   System.out.println("the option is not selected");
   }
   

                                                                                                                                            
        
	}

}
