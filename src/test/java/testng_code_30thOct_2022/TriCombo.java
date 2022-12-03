package testng_code_30thOct_2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TriCombo { //@BeforeMethod @Test @AfterMethod
	
	public static WebDriver driver;
	
@BeforeMethod
public void beforeMethod() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println("This is BeforeMethod executing");
}

@Test
public void testcase1() {
	driver.get("https://google.com");
	System.out.println("Test Case Google");
}

@Test
public void testcase2() {
	driver.get("https://amazon.com");
	System.out.println("Test Case Amazon");
}


@AfterMethod
public void afterMethod() {
	System.out.println("This is After Method Annotation");
	driver.quit();
	}
}


