package automation_code_13thNov_2022;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_Recording {
	
public static WebDriver driver;
	
	@Test(invocationCount = 2)
	public static void test() throws Exception {
		
		ScreenRecorderUtil.startRecord("test");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rediff.com");
		driver.findElement(By.xpath("//a[contains(@class, 'signin')]")).click();
		driver.findElement(By.xpath("//input[contains(@id, 'login1')]")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[contains(@id, 'password')]")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[contains(@class, 'signinbtn')]")).click();
		driver.quit();
		
		ScreenRecorderUtil.stopRecord();
}
}
