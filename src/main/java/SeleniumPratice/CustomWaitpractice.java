package SeleniumPratice;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CustomWaitpractice {
     static WebDriver driver;
	public static void main(String[] args) {
		//ChromeOptions co= new ChromeOptions();
	//	co.addArguments("--incognito");
	    driver=new ChromeDriver();
	    
	 //   driver.manage().window().maximize();
	  //    driver.manage().window().setSize(new Dimension(1080,1080));	
	//    driver.manage().window().fullscreen();
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		By username=By.name("firstname");
		
		retryingElement(username,20).sendKeys("lucky");
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
    public static WebElement retryingElement(By locator,int Timeout) {
    	
    	WebElement element=null;
    	int attempts=0;
    	while(attempts<Timeout) {
    		try {
    		element=getElement(locator);
    		System.out.println("Element is found "     +locator+     "in attempts"    +attempts);
    		break;	
    		}catch(NoSuchElementException e) {
    			System.out.println("Element is is found "     +locator+     "in attempts"    +attempts);
    			try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    		}
    	
    		attempts++;
    }  if(element==null) {
    	System.out.println("element is not find Tried for Timeout");
    }
    return element;
}
}