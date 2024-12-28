package Seleniumsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitlyWaitConcept {
   static WebDriver driver;
	public static void main(String[] args) {
		//implicity wait is dyanmic wait and it also global wait .global wait means applied for all the WebElement (only for webElement)
		
		//it applied after the driver intilization
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys("lucky12334");
		
		//element1 ----->10-->2sec--->8 sec ignored
		
		//element1----->10--->10 secs -->no such element exception
		
		//implicit w8 can not be used with non webElement(alert,title,url) 
		//explecit wait can be use for non webElement
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); ///again usee
		
		
		//To optize the waitwe use explicit wait  for the specific Element
	}

}
