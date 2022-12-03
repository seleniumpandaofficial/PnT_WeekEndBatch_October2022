package testng_code_5thNov_2022;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterization {
	//Browser - chrome
	//url  - https://rediff.com
	//username - seleniumpanda@rediffmail.com
	//password - Selenium@123

	public static WebDriver driver;
	String Browser = "chrome";

	@Test(priority = 1)
	@Parameters({"Browser", "url"})
	public void launchRediff(String Browser, String url) {
		if(Browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		} else if(Browser.equals("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
		}
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(priority = 2)
	public void clickOnSignInLink() {
		driver.findElement(By.className("signin")).click();

	}

	@Test(priority = 3)
	@Parameters({"username" , "password"})
	public void loginCredentials(String username, String password) {
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("proceed")).click();

	}
	
	@Test(priority = 4)
	public void logOut() {
		driver.findElement(By.className("rd_logout")).click();
	}	
	
	@Test(priority = 5)
	public void rediffHome() {
		driver.findElement(By.xpath("//b[contains(text(), 'Rediff Home')]")).click();
	}	

}
