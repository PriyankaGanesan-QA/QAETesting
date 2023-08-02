package POMEx;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// Annoatations

public class Tutorial1 {

	@BeforeMethod
	void google() {
		System.out.println("open url");
	}
	
	@Test
	void sam() {
		System.out.println("login");
		}
	
	@Test
	void unit() {
		System.out.println("login2");
		}
	
	@AfterMethod
	void close() {
		System.out.println("close url");
	}
	
}
