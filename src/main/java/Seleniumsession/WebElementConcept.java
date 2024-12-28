package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		//WebElement Concept
		//create the WebElement + perofrm the action(click,sendKeys,getText,isDisplayed
		
	//	WebDriver driver = new ChromeDriver();
		//1st approaches
		driver=new ChromeDriver();
		
    	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		driver.findElement(By.id("input-email")).sendKeys("naveen@123");
//		driver.findElement(By.id("input-password")).sendKeys("12333");
//		
		//2nd approaches
		
//        WebElement emailid	=	driver.findElement(By.id("input-email"));
//		  WebElement passid  =   driver.findElement(By.id("input-password"));
//		
//		emailid.sendKeys("naveen@123");
//		passid.sendKeys("12333");
    	
    	//3rd approaches
    	
    	// By locater
//    	
//    	By eid=By.id("input-email");
//    	By pwd=By.id("input-password");
//    	
//    	WebElement emailid= driver.findElement(eid);
//    	WebElement passid=driver.findElement(pwd);
//    	
//    	emailid.sendKeys("Lucky1234@gmail.com");
//    	passid.sendKeys("1234");
//    	
    	//4th approaches By locator +generic method for element
//    	By eid=By.id("input-email");
//    	By pwd=By.id("input-password");
//    	
//    	getElement(eid).sendKeys("Lucky123@");
//    	getElement(pwd).sendKeys("123455");
    	
    	//5th approches By locator genric method for element and action
    	
//    	By eid=By.id("input-email");
//    	
//    	By pwd=By.id("input-password");
//    	
//    	sendkeys(eid,"lucky1233");
//    	sendkeys(pwd,"12344545");
//    	//6th approaches By locator and genric method for element and action in elementUtil class
    	
    	
       By eid =By.id("input-email");
      By pwd=By.id("input-password");
    ElementUtil eli=new ElementUtil(driver);
    	
    eli.dosendKeys(eid,"Lucky1233");
    eli.dosendKeys(pwd, "123456");
    	//7th approaches elementUtil + browser Util
//		
	}
	public static void sendkeys(By locator,String value) {
		getElement(locator).sendKeys(value); 
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
