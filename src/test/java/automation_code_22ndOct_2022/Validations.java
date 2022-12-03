package automation_code_22ndOct_2022;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Validations {
	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String actualCurrentUrl = "https://mail.rediff.com/cgi-bin/login.cgi";
		String expectedCurrentUrl = driver.getCurrentUrl();
		String actualTitle = "Rediffmail";
		String expectedTitle = driver.getTitle();

		if (actualCurrentUrl.equals(expectedCurrentUrl) && actualTitle.equals(expectedTitle)) {
			System.out.println("My url is correct");
		} else {
			System.out.println("my url is not correct");
		}

	}

}
