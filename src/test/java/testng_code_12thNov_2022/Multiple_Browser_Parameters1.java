package testng_code_12thNov_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiple_Browser_Parameters1 {
	public static WebDriver driver;
	
	@Test
	@Parameters({"Browser1" , "url", "username", "password"})
	public void rediffLogin(String Browser1, String url, String username, String password) {
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
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.name("proceed")).click();
	}
}
