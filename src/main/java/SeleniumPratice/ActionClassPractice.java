package SeleniumPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassPractice {
	
      static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver =new ChromeDriver();
		
		driver.get("https://www.bigbasket.com");
		
	//	Actions act=new Actions(driver);
		
//	    act.moveToElement(driver.findElement(By.cssSelector("button.dropbtn"))).build().perform();
//	    
//	    driver.findElement(By.linkText("Link 3")).click();
////	    
//	    By parentclick=By.cssSelector("button.dropbtn");
//	    By childclick=By.linkText("Link 1");
//	    
//	    Actiononlink(parentclick,childclick);
//		
//		Thread.sleep(5000);
//		
//		 driver.findElement(By.xpath("(//span[text()='Shop by'])[2]")).click();
//		 Thread.sleep(2000);
//		 act.moveToElement(driver.findElement(By.xpath("(//a[text()='Fashion'])[2]"))).build().perform();
//		 Thread.sleep(2000);
//		 act.moveToElement(driver.findElement(By.linkText("Men's Apparel"))).build().perform();
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("//a[text()='Innerwear']")).click();
 	 By parentmenu=By.xpath("(//span[text()='Shop by'])[2]");
 	 By firstchild=By.xpath("(//a[text()='Fashion'])[2]");
 	 By secondchild=By.linkText("Men's Apparel");
 	 By ThirdChild=By.xpath("//a[text()='Innerwear']");
 	 
 	BigBasketActionsClass(parentmenu,firstchild,secondchild,ThirdChild);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static void Actiononlink(By mouseHoverlocator,By clickLocator) throws InterruptedException {
		Actions act =new Actions(driver);
		act.moveToElement(getElement(mouseHoverlocator)).build().perform();
		
		Thread.sleep(2000);
		doClick(clickLocator);
		
	}
	
	public static void BigBasketActionsClass(By parentMenu,By firstchild, By secondchild, By ThirdChild) throws InterruptedException {
		Actions act=new Actions(driver);
	    
		Thread.sleep(2000);
		doClick(parentMenu);
		Thread.sleep(2000);
		act.moveToElement(getElement(firstchild)).build().perform();
		Thread.sleep(2000);
		act.moveToElement(getElement(secondchild)).build().perform();
		Thread.sleep(2000);
		doClick(ThirdChild);
		
		
		
		
	}

}
