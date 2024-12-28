package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickAndSendKeys {
     static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		Actions act =new Actions(driver);
//		
//		act.sendKeys(driver.findElement(By.id("input-email")), "lucky@12334").build().perform();
//		act.sendKeys(driver.findElement(By.id("input-password")),"234555").build().perform();
//		act.click(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"))).build().perform();
		
		By ab=By.id("input-email");
		By ac=By.id("input-password");
		By al=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		
		doActionsSendKeys(ab,"lucky1222");
		doActionsSendKeys(ac,"12233");
		doActionsClick(al);
		
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
      public static void doActionsSendKeys(By locator,String value) {
    	  Actions act=new Actions(driver);
    	  act.sendKeys(getElement(locator),value).build().perform();
      }
      public static void doActionsClick(By locator) {
    	  Actions act=new Actions(driver);
    	  act.click(getElement(locator)).build().perform();
      }
}
