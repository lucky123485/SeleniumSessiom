package Seleniumsession;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWaitConcept {
     static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//custom Wait: custom wait means i want implement my dynamic wait.We will use thread.sleep() sometimes to convert the static wait into dyanmic wait
		
		By username=By.name("firstname");
		
		retringElement(username,10).sendKeys("lucky");
	}
	
	
	public static WebElement getElement(By locator) {
	return	driver.findElement(locator);
	}
   
	public static WebElement retringElement(By locator,int Timeout ) {
		WebElement element =null;
		
		int attempts=0;
		
		while(attempts<Timeout) {
			try {
		   element=getElement(locator);
		   System.out.println("element is found"    +  locator  +   "    in attempts"   +   attempts);
		   break;
		}
		
		catch(NoSuchElementException e) {
			
		System.out.println("element is not found"    +locator+ "in attempts"     +attempts);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
						e1.printStackTrace();
		}
		}
		attempts++;	
	}
		 if(element==null) {
			 System.out.println("element is not found tried for"     +Timeout);
		 }
		 return element;
}
}