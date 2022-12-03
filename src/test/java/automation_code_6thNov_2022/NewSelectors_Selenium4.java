package automation_code_6thNov_2022;

import static org.openqa.selenium.support.locators.RelativeLocator.with;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewSelectors_Selenium4 {

	// near, toRightOf, toLeftOf, above and below

	public static WebDriver driver;

	@Test
	public void checkingNewLocators() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.cssSelector("a.login")).click();
		driver.findElement(By.cssSelector("input#email_create")).sendKeys("seleniumpanda1@gmail.com");
		driver.findElement(By.cssSelector("button#SubmitCreate")).click();

		Thread.sleep(4000);
		WebElement referencePoint = driver.findElement(By.cssSelector("input#id_gender1"));

		// I am choosing the text YOUR PERSONAL INFORMATION

		// above
		String personalinfoText = driver.findElement(with(By.tagName("h3")).above(referencePoint)).getText();
		System.out.println(personalinfoText);

		// below
		String firstNameText = driver.findElement(with(By.tagName("label")).below(referencePoint)).getText();
		System.out.println(firstNameText);

		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");

		
		WebElement refPoint = driver.findElement(By.cssSelector("input#password"));
		
		// toLeftOf
		String keepMeSignedInText = driver.findElement(with(By.tagName("p")).toLeftOf(refPoint)).getText();
		System.out.println(keepMeSignedInText);

		// toRightOf
        WebElement signInButton = driver.findElement(with(By.tagName("p")).toRightOf(refPoint));
		signInButton.click();
		
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement refPoint1 = driver.findElement(By.cssSelector("input#password"));

		// near
		String usernameText = driver.findElement(with(By.tagName("p")).near(refPoint1)).getText();
		System.out.println(usernameText);

	}

}
