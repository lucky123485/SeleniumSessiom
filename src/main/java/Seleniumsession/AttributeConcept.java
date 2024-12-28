package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeConcept {
    static WebDriver driver;
	public static void main(String[] args) {
		driver =new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		// create webelement + perform  action and getattribute method we use to get the attribute value
//		By userId=By.id("input-email");
//	String AttributeValue=	driver.findElement(userId).getAttribute("placeholder");
//	System.out.println(AttributeValue);
//	
//	By registerLink=By.linkText("Register");
//    String registervalue	=driver.findElement(registerLink).getAttribute("href");
//	System.out.println(registervalue);
//	
//	By pwd=By.id("input-password");
//	String pwdValue=	driver.findElement(pwd).getAttribute("name");
//	System.out.println(pwdValue);
//	
	By userid =By.id("input-email");
//	driver.findElement(userid).sendKeys("lucky@123");
//String text=	driver.findElement(userid).getAttribute("value");
//System.out.println(text);

 String uservalue=    getAttribute(userid,"name");
 System.out.println(uservalue );
	}
	
	public static String getAttribute(By locator,String value) {
	return	getElement(locator).getAttribute(value);
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}

}
