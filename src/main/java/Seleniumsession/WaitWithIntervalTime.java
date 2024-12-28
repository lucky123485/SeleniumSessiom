package Seleniumsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitWithIntervalTime {
     static WebDriver driver;
	public static void main(String[] args) {
       driver=new ChromeDriver();
		
	   driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	  By Firstname=By.name("firstname");
	  By lastname=By.name("lastname");
	  By con=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	  
	  
	  WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10),Duration.ofSeconds(2));
	  
WebElement ele=	  wait.until(ExpectedConditions.visibilityOfElementLocated(Firstname));
	  ele.sendKeys("lucky12333");
	  
	}
        //Element util mein iski utility overloaded  mein
	
	//default time of interval time 500 miliseconds
}
