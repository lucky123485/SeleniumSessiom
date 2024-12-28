package Seleniumsession;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {
      static WebDriver driver;
	public static void main(String[] args) {
     driver=new ChromeDriver();
     
     driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
     
     By Firstname=By.name("firstname");
	  By lastname=By.name("lastname");
	  
//	  Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
//			                  .withTimeout(Duration.ofSeconds(10))
//			                  .pollingEvery(Duration.ofSeconds(2))
//			                  .withMessage("timeout is done----element not found")
//			                  .ignoring(NoSuchElementException.class);
//	  
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(Firstname)).sendKeys("Lucky1223");
	  
	  waitForElementWithFluentWait(Firstname,10,2,"Element not found").sendKeys("lucky");
			                  
	}
	
	public static WebElement waitForElementWithFluentWait(By locator,int Timeout,int IntervalTime ,String value) {
		 Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
                 .withTimeout(Duration.ofSeconds(Timeout))
                 .pollingEvery(Duration.ofSeconds(IntervalTime))
                 .withMessage(value)
                 .ignoring(NoSuchElementException.class);

return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
		//what is differnce between fluent wait and webdriver wait
        //Ans no differnce
       // webdriver wait is a kind of fluent wait beocoz it iz child of fluent wait class







	}

}
