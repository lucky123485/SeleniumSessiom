package Seleniumsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandlingWithoutSelectClass {
    static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/en/book-a-free-demo");
		
		By selectoption=By.cssSelector("select[name='Country']>option");
		
//		List<WebElement> select=driver.findElements(selectoption);
//		System.out.println(select.size());
//		
//		for(WebElement e:select) {
//		String text=	e.getText();
//		System.out.println(text);
//		}
		clickCountryOption(selectoption,"India");
		
		  
	}
	public static void clickCountryOption(By locator , String value) {
	List<WebElement> option=	driver.findElements(locator);
	for(WebElement e: option) {
	String ab=	e.getText();
	   if(ab.equals(value)) {
	    	 e.click();
	    	 break;
	     }
	     
	
	}
	
	}
	}
	


