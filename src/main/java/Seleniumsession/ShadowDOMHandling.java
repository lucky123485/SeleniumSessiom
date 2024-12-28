package Seleniumsession;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMHandling {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
	      driver.get("chrome://settings/");
	       
	      driver.manage().window().maximize();
	      Thread.sleep(4000);
	   String search_input= "return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";  
	     
	   
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   //html element convert in webElement because selenium does not understand html element
       WebElement search=	     (WebElement)js.executeScript(search_input);
       search.sendKeys("privacy");

	      
	}

}
