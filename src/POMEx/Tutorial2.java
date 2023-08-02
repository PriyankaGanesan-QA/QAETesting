package POMEx;

import org.testng.annotations.Test;

public class Tutorial2 {
	
	// Grouping test cases
	
	@Test(priority=2)
	void cat(){
	System.out.println("jasmine");	
	}

	@Test(priority=1)
	void aaa() {
		System.out.println("apple");	
	}
	
	@Test(priority=-4)
	void bat() {
		System.out.println("battle");	
	}
	
	@Test(priority=-6)
	void yak() {
		System.out.println("last");	
	}
	
	/*@Test(priority=2)
	void test3() {
		System.out.println("rose");
	}
	
	@Test(priority=3)
	void test4() {
		System.out.println("mango");	
	} */
}
