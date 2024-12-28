package Seleniumsession;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessConcept {
  static WebDriver driver;
	public static void main(String[] args) {
		
		//Headless browser testing:no active browser window
		//no active UI
		// testing is happening behind the scene
		// faster than UI mode
		
		//but might not interact with some complex application
		
		// when to use
		//CI CD--Cloud--AWS-Linux-Jenkins
		
		ChromeOptions co=new ChromeOptions();
	//	co.addArguments("--headless");
		co.addArguments("--incognito");
        driver=new ChromeDriver(co);		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        System.out.println(driver.getTitle());
	
		
		
		
		
		
		
	}

}
