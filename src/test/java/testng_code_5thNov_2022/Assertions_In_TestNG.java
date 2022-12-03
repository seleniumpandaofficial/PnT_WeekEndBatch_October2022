package testng_code_5thNov_2022;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Assertions_In_TestNG {

	// Assertion - Assert and SoftAssert

	@Test(priority = 1)
	public void program1() {

		System.out.println("We are learning Java");
		Assert.assertTrue(true);  //as long as assertion is passing, the control will move on
		System.out.println(2 + 3);
		Assert.assertTrue(1>2); 
		System.out.println("Learning Selenium");
	}
	
	@Test (priority = 2)
	public void logic1() {
		System.out.println("Hello World");
	}

}
