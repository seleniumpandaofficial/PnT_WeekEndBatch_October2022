package automation_code_29thOct_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automating_DropDown {

	public static WebDriver driver;
	public static Select select;
	public static ChromeOptions options;

	public static void main(String[] args) {
		options = new ChromeOptions();
		options.addArguments("--incognito");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://facebook.com");
		
		driver.findElement(By.xpath("//div[@id = 'reg_pages_msg']/preceding::a[1]")).click();

		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.name("lastname")).sendKeys("Panda");
		driver.findElement(By.name("reg_email__")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Selenium@123");

		// you have to create the Object of Select Class

		select = new Select(driver.findElement(By.id("month")));
		// select.selectByIndex() - do not use this
		// select.selectByValue() - do not use this
		select.selectByVisibleText("May");

		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("30");

		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1990");

	}
}
