package SeleniumPratice;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitPractice {
  static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
	     
	     driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	     
	     By Firstname=By.name("firstnamee");
		  By lastname=By.name("lastname");
		  
//		 Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
//				                .withTimeout(Duration.ofSeconds(10))
//				                .pollingEvery(Duration.ofSeconds(2))
//				                .withMessage("Element not found")
//				                .ignoring(NoSuchElementException.class);
//		 wait.until(ExpectedConditions.visibilityOfElementLocated(Firstname)).sendKeys("lucky");
		  fluentWaitvisibility(Firstname,"Element not found",10,2).sendKeys("sharma");
	}
	
	public static WebElement fluentWaitvisibility(By locator,String value,int Timeout,int IntervalTimeout) {
		 Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
	                .withTimeout(Duration.ofSeconds(Timeout))
	                .pollingEvery(Duration.ofSeconds(IntervalTimeout))
	                .withMessage(value)
	                .ignoring(NoSuchElementException.class);
    return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
