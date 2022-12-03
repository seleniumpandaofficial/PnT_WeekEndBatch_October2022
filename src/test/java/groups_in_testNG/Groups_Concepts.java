package groups_in_testNG;

import org.testng.annotations.Test;

@Test(groups = "CompleteClassLevelTestGrouping")
public class Groups_Concepts {
	
	@Test(groups = {"smoke"})
	public void testCase1() {
		System.out.println("this is TC1 logic");
	}
	
	@Test(groups = {"smoke", "sanity"})
	public void testCase2() {
		System.out.println("this is TC2 logic");
	}
	
	@Test(groups = {"smoke", "sanity", "regression"})
	public void testCase3() {
		System.out.println("this is TC3 logic");
	}
	
	@Test(groups = {"windows.sanity"})
	public void testCase4() {
		System.out.println("this is TC4 logic");
	}
	
	@Test(groups = {"linux.regression"})
	public void testCase5() {
		System.out.println("this is TC5 logic");
	}
	
	@Test(groups = {"regression", "sanity"})
	public void testCase6() {
		System.out.println("this is TC6 logic");
	}

}
