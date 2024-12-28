package SeleniumPratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jqueryhandlingDropdown {
      static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://jqueryui.com/selectmenu/");
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span#speed-button")).click();
		
	List<WebElement> ele=	driver.findElements(By.cssSelector("ul#speed-menu>li"));
	     System.out.println(ele.size());
	     
	     for(WebElement e:ele) {
	    String ab=	 e.getText();
	    System.out.println(ab);
	      if(ab.contains("Faster")) {
	    	  e.click();
	    	  break;
	      }
	    
	     }
		
		
		
		
		
	}

}
