package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMenuHandle {
      static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		
	
		By parentShopMenu=By.xpath("(//span[text()='Shop by'])[2]");
		
	//	By BeavergesSecondMenu=By.xpath("(//a[text()='Beverages'])[2]");
		By BeavergesSecondMenu=By.xpath("(//a[text()='Apparel'])[2]");
		
	//	By TeaThirdMenu=By.xpath("//a[text()='Tea']");
		By TeaThirdMenu=By.xpath("//a[text()='Women's Apparel']");
		
	//	By GreenTeaFourthMenu=By.xpath("//a[text()='Green Tea']");
		
		By GreenTeaFourthMenu=By.xpath("//a[text()='Women's Bottom Wear']");
		
		
//		Actions act =new Actions(driver);
//		Thread.sleep(2000);
//		
//		driver.findElement(parentShopMenu).click();
//		
//		Thread.sleep(2000);
//		 
//		act.moveToElement(driver.findElement(BeavergesSecondMenu)).build().perform();
//		
//		Thread.sleep(2000);
//		
//		act.moveToElement(driver.findElement(TeaThirdMenu)).build().perform();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(GreenTeaFourthMenu).click();
		
		Multihandle(parentShopMenu,BeavergesSecondMenu,TeaThirdMenu,GreenTeaFourthMenu);
		
		 
			
		}
	    
	public static WebElement getElement(By locator) {
	return	driver.findElement(locator);
		
	}
	public static void Multihandle(By parentShopMenu,By FirstchildMenuLocator ,By SecondChildMenuLocator,By ThirdChildMenuLocator) throws InterruptedException {
		Actions act= new Actions(driver);
		Thread.sleep(2000);
		getElement(parentShopMenu).click();
		Thread.sleep(2000);
		act.moveToElement(getElement(FirstchildMenuLocator)).build().perform();
		Thread.sleep(2000);
		act.moveToElement(getElement(SecondChildMenuLocator)).build().perform();
		Thread.sleep(2000);
		getElement(ThirdChildMenuLocator).click();
	}

}
