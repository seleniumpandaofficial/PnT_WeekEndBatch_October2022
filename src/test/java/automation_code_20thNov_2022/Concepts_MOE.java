package automation_code_20thNov_2022;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Concepts_MOE {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");

	//Total number of links in the webpage
      List<WebElement> RediffLinks = driver.findElements(By.tagName("a"));
      System.out.println("Total number of links in this page : " + RediffLinks.size());
      
   //What if you want to pick the 21st link
      WebElement TwentyFirstLink = RediffLinks.get(20);
      System.out.println(TwentyFirstLink.getText());
      System.out.println(TwentyFirstLink.getAttribute("href"));
      System.out.println(TwentyFirstLink.getLocation().x + " , " +  TwentyFirstLink.getLocation().y);
      
   //What if you want to click on this 21st Link ??
      //TwentyFirstLink.click();
      
	/*
	 * Thread.sleep(2000);
	 * 
	 * driver.navigate().back();
	 */
      
      for(int i=0; i<RediffLinks.size(); i++) {
    	  WebElement TotalLinks = RediffLinks.get(i);
    	  System.out.println(TotalLinks.getText() + "-----" + TotalLinks.isDisplayed());
    	  
			/*
			 * if(TotalLinks.isDisplayed() == true) { TotalLinks.click(); }
			 */
      }
      
      
      driver.quit();

	}

}
