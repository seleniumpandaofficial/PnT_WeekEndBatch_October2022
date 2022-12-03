package automation_code_29thOct_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
public static WebDriver driver;
public static ChromeOptions options;
	public static void main(String[] args) {
	options = new ChromeOptions();
	options.addArguments("--incognito");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://facebook.com");
	System.out.println(driver.findElement(By.xpath("//div[@id = 'reg_pages_msg']/preceding::a[1]")).isEnabled());
	driver.findElement(By.xpath("//div[@id = 'reg_pages_msg']/preceding::a[1]")).click();
	}

}
