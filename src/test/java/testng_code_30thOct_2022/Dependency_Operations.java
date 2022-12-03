package testng_code_30thOct_2022;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency_Operations {
	
	@Test()
	public void tc1() {
	System.out.println("Test Case 1");	
	Assert.fail();
	
	//when you write your code because of some reason it will fail
	}
	
	@Test(dependsOnMethods = "tc1", alwaysRun = true)
	public void tc2() {
		System.out.println("Test Case 2");		
	}
	
	@Test(dependsOnMethods = {"tc1", "tc2"})
	public void tc3() {
		System.out.println("Test Case 3");		
	}
	
	@Test(dependsOnMethods = {"tc1", "tc2", "tc3"})
	public void tc4() {
		System.out.println("Test Case 4");		
	}
	
	@Test (dependsOnMethods = {"tc1", "tc2", "tc3", "tc4"})
	public void tc5() {
		System.out.println("Test Case 5");		
	}

}
