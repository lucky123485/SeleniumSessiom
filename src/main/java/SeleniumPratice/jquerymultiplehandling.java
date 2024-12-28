package SeleniumPratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jquerymultiplehandling {
         static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
		driver.findElement(By.cssSelector("input#justAnInputBox")).click();
	List<WebElement> el=	driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
	System.out.println(el.size());
	     for(WebElement e:el) {
	    	String ab=e.getText();
	    	System.out.println(ab);
	    	if(ab.equals("choice 6")) {
	    		try {
	    		e.click();
	    		}
	    			catch(ElementNotInteractableException ex) {
	    				System.out.println("slelct the right option");
	    				break;
	    			}
	    		}
	    	}
	     
	
	}

}
