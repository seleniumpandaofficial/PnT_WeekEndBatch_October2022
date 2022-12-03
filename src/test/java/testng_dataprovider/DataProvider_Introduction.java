package testng_dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Introduction {

	// few rules of implementing @DataProvider

	// Rule 1 - @DataProvider will return a 2 Dimensional Object Array
	// Rule 2 - You have to add all the entries of the array
	// Rule 3 - you have to pass dataProvider = name of the method in which @DataProvider resides in an @Test
	// Rule 4 - pass the parameters in the method of @Test == cols of the 2-D array

	@Test(dataProvider = "getData")
	public void dataConcept(String username, String password, int rollNumber, String browser) {
		
	}
	
	@DataProvider
       public Object[][] getData() {

		Object[][] data = new Object[3][4];

		data[0][0] = "username1";
		data[0][1] = "password1";
		data[0][2] = 12345;
		data[0][3] = "Chrome";

		data[1][0] = " username2";
		data[1][1] = "password2";
		data[1][2] = 123456;
		data[1][3] = "Firefox";

		data[2][0] = " username3";
		data[2][1] = "password3";
		data[2][2] = 1234567;
		data[2][3] = "Edge";

		return data;

	}

}
