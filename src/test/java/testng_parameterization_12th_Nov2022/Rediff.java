package testng_parameterization_12th_Nov2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Rediff {
public static WebDriver driver;
	
	@Test
	@Parameters({"Browser1" , "urlr", "username", "password"})
	public void rediffLogin(String Browser1, String urlr, String username, String password) {
		if(Browser1.equals("chrome")) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		} else if(Browser1.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();	
		}else {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		driver.get(urlr);
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("proceed")).click();
	}

}
