package parallel_execution_testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel_Part2 {
public static WebDriver driver;
	
	@Test(threadPoolSize = 3, invocationCount = 5)
	public void logic4() {
	System.out.println("This is logic4 operation : " + Thread.currentThread().getId());	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com");
	}
	
	
	
	
	@Test(threadPoolSize = 3, invocationCount = 5)
	public void logic6() {
		System.out.println("This is logic6 operation : " + Thread.currentThread().getId());	
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
	}

}