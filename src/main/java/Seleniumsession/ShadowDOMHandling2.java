package Seleniumsession;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMHandling2 {
      static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/#");	
		
	// driver.manage().window().maximize();
		Thread.sleep(4000);
			
		String pizza="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	WebElement pizzaname=	(WebElement)js.executeScript(pizza);
		pizzaname.sendKeys("veg pizza");
	}

}
