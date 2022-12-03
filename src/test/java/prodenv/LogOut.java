package prodenv;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LogOut {
	
	@Test
	public void logoutTestProd() {
		System.out.println("This is prod env logout test");
		Assert.fail("logout failure");
	}

}
