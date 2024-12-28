package SeleniumPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysPractise {
    static WebDriver driver;
	public static void main(String[] args) {
       driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By sendKey=By.id("input-email");
		By sendpas=By.id("input-email");
		By click=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		Actions act =new Actions(driver);
		
		act.sendKeys(driver.findElement(sendKey),"lucky").build().perform();
		act.sendKeys(driver.findElement(sendpas), "1223").build().perform();
		act.click(driver.findElement(click)).build().perform();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
    public static void doSendKeys(By locator,String value) {
    	Actions act =new Actions(driver);
    	act.sendKeys(getElement(locator),value).build().perform();
    }
    public static void doClick(By locator) {
    	Actions act =new Actions(driver);
    	act.click(getElement(locator)).build().perform();
    }
}
