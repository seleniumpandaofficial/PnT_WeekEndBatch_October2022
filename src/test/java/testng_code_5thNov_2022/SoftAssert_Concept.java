package testng_code_5thNov_2022;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Concept {
	
	SoftAssert softassert;
	
	@Test
	public void logic1() {
		softassert = new SoftAssert();
		boolean b1 = 1<2;
		softassert.assertTrue(b1);     //true
		boolean b2 = 1>2;
		softassert.assertFalse(b2);  //true
		
		System.out.println(" I have a new logic");
		
		String S1 = "Hello World";
		String S2 = "Bye World";
		
		softassert.assertEquals(S1, S2);      // false
		
		System.out.println("I am printing something");
		softassert.assertAll();
	}
	
	@Test
	public void logic2() {
		
	}

}
