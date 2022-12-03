package automation_code_6thNov_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_SELECTORS {

	public static WebDriver driver;

	@BeforeTest
	public void launchUrl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
	}

	@Test
	public void clickOnSignIn() throws Exception {
		driver.findElement(By.cssSelector("a.moneyicon.relative")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[class = signin]")).click();
	}

	@AfterTest
	public void tearDown() {
		// driver.quit();
	}

}
