package automation_code_22ndOct_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_Xpath {

	public static WebDriver driver;
	
	@Test(invocationCount = 2)
	public static void test() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rediff.com");
		driver.findElement(By.xpath("//a[contains(@class, 'signin')]")).click();
		driver.findElement(By.xpath("//input[contains(@id, 'login1')]")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[contains(@id, 'password')]")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[contains(@class, 'signinbtn')]")).click();
		driver.findElement(By.xpath("//a[contains(@class, 'rd_logout')]")).click();
		driver.findElement(By.xpath("//b[contains(text(), 'Rediff Home')]")).click();
		
		//html[contains(text(), 'textcontent')]
		//html[contains(@attribute, 'value')]
		//seleniumpanda@rediffmail.com
		//Selenium@123
		

	}

}
