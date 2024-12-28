package Seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGGraphElement {
      static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	      driver=new ChromeDriver();
	      driver.get("https://petdiseasealerts.org/forecast-map#/giardia/dog/united-states/oregon");
	      driver.manage().window().maximize();
	      
	      Thread.sleep(5000);
	      
	      driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance-')]")));
	  List<WebElement> stateList=          driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @class='region']"));
	  
	  System.out.println(stateList.size());
	  
	  Actions act=new Actions(driver);
	  
	  
	  for(WebElement e:stateList) {
		  act.moveToElement(e).build().perform();
		  
     String statenames= e.getAttribute("id");
     System.out.println(statenames);
     
     if(statenames.contains("texas")) {
    	 e.click();
    	 break;
     }
		  
		  
	  }
	}

}







//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @class='region']