package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {
	
	
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//Action Class:Action Class means user action
        // There are the two types of action either mouse and keyboard
	//	
		driver= new ChromeDriver();
		
		driver.get("https://stqatools.com/demo/MouseHover.php");
		
//		Actions act= new Actions(driver); 
//		
//		By mouse=By.cssSelector("button.dropbtn");
		
//		WebElement hover= driver.findElement(mouse);
//		act.moveToElement(hover).build().perform();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Link 1")).click();
		 
		By parentMenulocator=By.cssSelector("button.dropbtn");
		By childMenulocator=By.linkText("Link 2");
		
		parentchildMenu(parentMenulocator,childMenulocator);
			
		}
		 public static WebElement getElement(By locator) {
		return 	 driver.findElement(locator);
		 }
		 
		 public static void parentchildMenu(By parentMenulocator,By childMenuLocator) throws InterruptedException {
			 Actions act =new Actions(driver);
			 act.moveToElement(getElement(parentMenulocator)).build().perform();
			 Thread.sleep(2000);
			// driver.findElement(childMenuLocator).click();
			 getElement(childMenuLocator).click();
		 }
		
	}

