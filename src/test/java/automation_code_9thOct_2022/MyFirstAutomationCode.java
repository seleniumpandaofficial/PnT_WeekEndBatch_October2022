package automation_code_9thOct_2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstAutomationCode {

	// Ctrl + Shift + O in keyboard
	// Java is case sensitive

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.amazon.com/");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		

		driver.quit();
		driver1.quit();

	}

}
