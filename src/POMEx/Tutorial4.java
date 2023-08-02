package POMEx;

import org.testng.annotations.Test;

public class Tutorial4 {
	
	//invocation count
	
	@Test (invocationCount=5)
	void sample() {
		int a =10;
		System.out.println("The number is" + a);
	}

}
