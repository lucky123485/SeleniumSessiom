package SeleniumPratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitConceptPratice2 {
      static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	  By Firstname=By.name("firstname");
	  By lastname=By.name("lastname");
	  By con=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	  
//	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//WebElement ele=	  wait.until(ExpectedConditions.presenceOfElementLocated(Firstname));
//ele.sendKeys("Lucky12344");
//
//     driver.findElement(lastname).sendKeys("sharma");
//     
// WebElement ele1=    wait.until(ExpectedConditions.presenceOfElementLocated(con));
// ele1.click();
	  getsendKeys(Firstname,"Bhavesh",10);
	  driver.findElement(lastname).sendKeys("sharma");
	  
	  getClick(con,10);
	  
}
	
	public static WebElement presnceElementwait(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
	return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	public static WebElement visibleElementwait(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
	return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	
	}
	public static void getClick(By locator,int timeout) {
		visibleElementwait(locator,timeout).click();
		
		
	}
	public static void getsendKeys(By locator,String value,int timeout) {
		visibleElementwait(locator,timeout).sendKeys(value);
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}