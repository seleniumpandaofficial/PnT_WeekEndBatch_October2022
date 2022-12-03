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
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWait_Rediff {
	public static WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	WebDriverWait wait;	

	@BeforeTest
	public void launchRediff() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(priority = 1)
	public void clickOnSignInLink() {
		WebElement signinLink = driver.findElement(By.className("signin"));
        softassert.assertTrue(signinLink.isEnabled());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(signinLink)).click();
		softassert.assertAll();
	}

	@Test(priority = 2, dependsOnMethods = "clickOnSignInLink", alwaysRun = true)
	public void loginCredentials() {
		WebElement usernameTextBox = driver.findElement(By.id("login1"));
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		WebElement signinButton = driver.findElement(By.name("proceed"));
        softassert.assertTrue(usernameTextBox.isEnabled());
        softassert.assertTrue(passwordTextBox.isEnabled());
        softassert.assertTrue(signinButton.isDisplayed());
        
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(usernameTextBox)).sendKeys("seleniumpanda@rediffmail.com");
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(passwordTextBox)).sendKeys("Selenium@123");
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(signinButton)).click();
		
		softassert.assertAll();
	}
	
	@Test(priority = 3, dependsOnMethods = {"clickOnSignInLink", "loginCredentials"}, alwaysRun = true)
	public void logOut() {
		
		WebElement logOutLink = driver.findElement(By.className("rd_logout"));
		softassert.assertTrue(logOutLink.isDisplayed());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(logOutLink)).click();
		softassert.assertAll();
	}	
	
	@Test(priority = 4, dependsOnMethods = {"clickOnSignInLink", "loginCredentials", "logOut"}, alwaysRun = true)
	public void rediffHome() {
		
		WebElement rediffHomeLink = driver.findElement(By.xpath("//b[contains(text(), 'Rediff Home')]"));
		softassert.assertTrue(rediffHomeLink.isDisplayed());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(rediffHomeLink)).click();
		softassert.assertAll();
	}	
		
		
		
		@AfterTest
		public void tearDown() {
			//driver.quit();
		}
		
		
		
		
		
		
		
		
		
		
		

}

