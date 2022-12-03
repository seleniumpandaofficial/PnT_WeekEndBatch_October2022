package testng_parameterization_12th_Nov2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OrangeHRM {
	
	
	public static WebDriver driver;
	
	@Test
	@Parameters({"urlO", "usernameO", "passwordO"})
	public void orangeHRMLogin(String urlO, String usernameO, String passwordO) throws Exception {
		driver = new ChromeDriver();
		driver.get(urlO);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(usernameO);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(passwordO);
		
	}

}
