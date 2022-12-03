package testng_parameterization_12th_Nov2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook {
	
	public static WebDriver driver;
	
	@Test
	@Parameters({"urlf", "firstname", "lastname"})
	public void createAccount(String urlf, String firstname, String lastname) throws Exception {
		driver = new ChromeDriver();
		driver.get(urlf);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(), 'Create new account')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys(firstname);
		driver.findElement(By.name("lastname")).sendKeys(lastname);
	}

}
