package Seleniumsession;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {
      static WebDriver driver;
	public static void main(String[] args) {
		//Explicit wait=Explicit wait is a dynamic wait concept for the specific element/non-WebElement
		//on the basic of some expected condition
		
		driver= new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By username=By.id("input-email");
		By pass=By.id("input-password");
		By submit=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		By aboutus=By.linkText("About Us");
		
		
//		waitForPresenceOfElement(username,10).sendKeys("lucky");
//	//	waitforVisibilityOfElement(aboutus,10).click();
		
	dosendKeysWithwait(username,"lucky1234",10);
	
	driver.findElement(pass).sendKeys("122");
	driver.findElement(submit).click();
//	waitforVisibilityOfElement(aboutus,10).click();
	DoclickWithWait(aboutus,10);
	
	}
	
	
	//**An expectation for checking that an element is present on the DOM of a page. 
	//**This does not necessarily mean that the element is visible.
	
	public static WebElement waitForPresenceOfElement(By locator,int Timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Timeout));
	return	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	 //**An expectation for checking that there is at least one element present on a web page.//
	
    public  static List< WebElement> waitForPresenceOfElements(By locator,int Timeout) {
  		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Timeout));
  	return	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }
	
    //***An expectation for checking that an element, known to be present on the DOM of a page, is visible. 
    //***Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
    
	public static WebElement waitforVisibilityOfElement(By locator,int Timeout) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(Timeout));
	return	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	//**An expectation for checking that all elements present on the web page that match the locator are visible.
  	//**Visibility means that the elements are not only displayed but also have a height and width that is greater than 0.
  	
  	 public static List<WebElement> waitforVisibilityOfElements(By locator,int Timeout) {
  		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(Timeout));
  	 return	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
  	}
  	
	
	public static void DoclickWithWait(By locator ,int Timeout) {
		waitforVisibilityOfElement(locator,Timeout).click();
	}
	public static void dosendKeysWithwait(By locator,String value,int Timeout) {
		waitforVisibilityOfElement(locator,Timeout).sendKeys(value);
		
	}

}
