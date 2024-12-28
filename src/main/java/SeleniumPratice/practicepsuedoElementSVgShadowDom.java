package SeleniumPratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practicepsuedoElementSVgShadowDom {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/giardia/dog/united-states/nevada");
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance-')]")));
	List<WebElement> state=	  driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @class='region']"));
	  System.out.println(state.size());
	  
	  Actions act=new Actions(driver);
	
		for(WebElement e:state) {
			act.moveToElement(e).build().perform();
 String ab=			e.getAttribute("id");
 System.out.println(ab);
 
       if(ab.contains("colorado")) {
    	   e.click();
    	   break;
       }
			
		}
	
		}
	}
	


