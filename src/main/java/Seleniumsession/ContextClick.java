package Seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
  static WebDriver driver;
	public static void main(String[] args) {
	//	Context click is the Right click both are the same or we can say handling the context menu
		
		driver= new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act=new Actions(driver);
		
		act.contextClick(rightclick).build().perform();
		
	List<WebElement> contextsize=	     driver.findElements(By.cssSelector("li.context-menu-icon>span"));
	  System.out.println(contextsize.size()); 
	      
	     for(WebElement e: contextsize) {
	    	String text=   e.getText();
	    	System.out.println(text);
	    	
	    	if(text.contains("Cut")) {
	    		e.click();
	    		break;
	    	}
	     }
	  
	}

}
