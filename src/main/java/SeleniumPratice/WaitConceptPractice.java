package SeleniumPratice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConceptPractice {
     static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		By firstname =By.name("firstname");
		By lastname=By.name("lastname");
		By email=By.name("email");
		By telno=By.name("telephone");
		By con=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		
//	WebElement ele=	wait.until(ExpectedConditions.presenceOfElementLocated(firstname));
//	
//	ele.sendKeys("Bhavesh");
//	
//	driver.findElement(lastname).sendKeys("sharma");
//	driver.findElement(email).sendKeys("sharmaBhavesh338@gmail.com");
//	driver.findElement(telno).sendKeys("99966638923");
//		
//WebElement elee=	wait.until(ExpectedConditions.presenceOfElementLocated(con));
//
//elee.click();
		
		
		textfill(firstname,"Bhavesh",10);
		textfill(lastname,"sharma",10);
		
		clickwaitelement(con,10);
		
	
	}
	public static WebElement presncelementinwait(By locator ,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	public static WebElement getVisiblewait(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static List<WebElement> getelementspresnence(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
	return	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}


  public static List<WebElement> getelementsvisible(By locator,int timeout) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
   return	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
}
    
    public static void clickwaitelement(By locator, int timeout) {
    	getVisiblewait(locator,timeout).click();
    	
    }
    
    public static void textfill(By locator,String value,int timeout) {
     	getVisiblewait(locator,timeout).sendKeys(value);
    }
  
  
  
  
  
  
  
  
  } 
  
  
  
  
  
