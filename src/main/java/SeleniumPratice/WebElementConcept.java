package SeleniumPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1st approches
//		driver.findElement(By.name("email")).sendKeys("lucky");
//		driver.findElement(By.name("password")).sendKeys("1233");
//		
		//2nd approches
		//By  approches
		
//		By username=By.name("email");
//		By pwd=By.name("password");
//		
//		driver.findElement(username).sendKeys("lucky");
//		driver.findElement(pwd).sendKeys("123444");
		
		//3rd approches
		
//	     By username=By.cssSelector("#input-email");
//	     By pwd =By.cssSelector("#input-password");
//	     By click=By.cssSelector("#content > div > div:nth-child(2) > div > form > input");
//	     sendKey(username,"lucky");
//	     sendKey(pwd,"233444");
//	     Onclick(click);
		
//		By link=By.linkText("Register");
//		Onclick(link);
		By text= By.tagName("h2");
   String tag=     GetText(text);
   System.out.println(tag);
   
   if(tag.contains("New")){
	   System.out.println("write text");
   }
   		
		
		
	}
	
	public static String GetText(By locator) {
		return GetElement(locator).getText();
	}
	public static void Onclick(By locator) {
       GetElement(locator).click();		
	}
	public static void sendKey(By locator,String value  ) {
		GetElement(locator).sendKeys(value);
	}
	
	public static WebElement GetElement(By locator) {
	return driver.findElement(locator);
	}
	

}
