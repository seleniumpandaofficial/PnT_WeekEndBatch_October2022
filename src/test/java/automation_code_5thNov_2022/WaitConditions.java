package automation_code_5thNov_2022;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitConditions {
	//Explicit Wait - Thread.sleep(2000);
	//implicit Wait - smart wait
	//fluent wait
	
	public static WebDriver driver;
	
	@BeforeTest
	public void openUrl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
	}
	
	@Test
	public void login() {
		
		WebElement signinlink = driver.findElement(By.className("login"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(signinlink)).click();
		
	
	
		driver.findElement(By.id("email")).sendKeys("seleniumpanda@gmail.com");
		
		driver.findElement(By.id("passwd")).sendKeys("Selenium@123");
		
		driver.findElement(By.id("SubmitLogin")).click();
	}
	
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}

}
