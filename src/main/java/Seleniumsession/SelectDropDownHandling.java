package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		//dropdown----->htmltag:<select>--.whwnever you see select tag the child of select tag is <option> and we use select class
		
		// use select class
		
		//There are two types of dropdown in select
		//1. single select
		//2.multiselection option
		
		driver =new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/en/book-a-free-demo");
		
		Thread.sleep(1000);
		
		By country = By.id("Form_getForm_Country");
		
//		WebElement ele= driver.findElement(country);
//		
//		Select select =new Select(ele);
//		select.selectByIndex(10);
//		
//		Thread.sleep(1000);
//		select.selectByVisibleText("India");
//		
//		Thread.sleep(1000);
//		select.selectByValue("Mexico");
		
		DoSelectDropdownByIndex(country,15);
		Thread.sleep(1000);
		SelectByVisibleText(country,"India");
		Thread.sleep(1000);
		SelectByValue(country,"Mexico");
				
	}
    public static WebElement getElement(By locator) {
       return driver.findElement(locator);
    }
     public static void DoSelectDropdownByIndex(By locator, int index) {
    	 Select select= new Select(getElement(locator));
    	 select.selectByIndex(index);
  	 
     }
     public static void SelectByVisibleText(By locator, String visible) {
    	 Select select= new Select(getElement(locator));
    	 select.selectByVisibleText(visible);
     }
     public static void SelectByValue(By locator,String value) {
    	 Select select=new Select(getElement(locator));
    	 select.selectByValue(value);
     }
 
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}
