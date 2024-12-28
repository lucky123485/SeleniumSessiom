package SeleniumPratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class sliderandRealativerLocatorPractice {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		   driver=new ChromeDriver();
		   driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		   WebElement ele= driver.findElement(By.xpath("//label[@for='input-lastname']"));
		  
		   
		   
	String text=	   driver.findElement(RelativeLocator.with(By.tagName("label")).above(ele)).getText();
	System.out.println(text);
	
	String abc=	   driver.findElement(RelativeLocator.with(By.tagName("label")).below(ele)).getText();
	System.out.println(abc);
     List<WebElement> josh=	driver.findElements(RelativeLocator.with(By.xpath("//div[@class='form-group required']/label")).below(ele));
     
     System.out.println(josh.size());
     
     for(WebElement e: josh) {
   String text3=	 e.getText();
   System.out.println(text3);
     }
	}

}
