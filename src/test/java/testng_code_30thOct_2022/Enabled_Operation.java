package testng_code_30thOct_2022;

import org.testng.annotations.Test;

public class Enabled_Operation {
	
	@Test(priority = 2, enabled = true)
	public void tc1() {
	System.out.println("Test Case 1");	
	}
	
	@Test(priority = 3)
	public void tc2() {
		System.out.println("Test Case 2");		
	}
	
	@Test(priority = 1)
	public void tc3() {
		System.out.println("Test Case 3");		
	}
	
	@Test(priority = 5, enabled = false)
	public void tc4() {
		System.out.println("Test Case 4");		
	}
	
	@Test (priority = 4, invocationCount = 5)
	public void tc5() {
		System.out.println("Test Case 5");		
	}

}
