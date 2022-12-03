package testng_code_30thOct_2022;

import org.testng.annotations.*;

/*Selenium is Test Suite
TestNG - is an execution engine 
          is also a reporting system
            also helps in parallel execution
              also helps in batch running of files
                also helps in group running 
                  customizes your test cases and it's execution process
*/

public class Execution_Priorities {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Testing @BeforeSuite annotation");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Testing @BeforeTest annotation");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Testing @BeforeClass annotation");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Testing @BeforeMethod annotation");
	}

	@Test
	public void testcase() {
		System.out.println("My code is working fine");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Testing @AfterSuite annotation");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Testing @AfterTest annotation");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Testing @AfterClass annotation");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Testing @AfterMethod annotation");
	}

}
