package POMEx;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tutorial5 {
	
	//Assertions
	
	@Test
	void test() {
		
	
	String a="Reeta";
	String b="Kareena";
	System.out.println(a);
	Assert.assertEquals("Kareena", "Reeta" , "the test case failed");
	
	


	}


}



