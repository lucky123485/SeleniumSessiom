package Seleniumsession;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOut {
	static WebDriver driver;
	public static void main(String[] args) {
		
        driver=new ChromeDriver();
        
      //Sets the amount of time to wait for a page load to complete before throwing an error  
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	}

}
