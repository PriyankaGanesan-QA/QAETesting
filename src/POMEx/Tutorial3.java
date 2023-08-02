package POMEx;

import org.testng.annotations.Test;

public class Tutorial3 {
	
	
	//dependency - one tc depends on other
	
	@Test
	void login() {
		System.out.println("validate login page");
		int i=9/0;
	}
	
	@Test(dependsOnMethods="login")
	void contact() {
		System.out.println("validate contact tab");
	}

	
	  @Test void participant() {
		  System.out.println("validate tpa contact");
		  }
	 
}
