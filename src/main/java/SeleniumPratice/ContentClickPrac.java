package SeleniumPratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContentClickPrac {
    static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions act =new Actions(driver);
		
		act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).build().perform();
		
	List<WebElement> options=	driver.findElements(By.cssSelector("li.context-menu-icon>span"));
	    System.out.println(options.size());
	    
	    for(WebElement e:options) {
	 String text=   	e.getText();
	      System.out.println(text);
	      
	      if(text.contains("Quit")) {
	    	  e.click();
	      }
	    }
		
	}

}
