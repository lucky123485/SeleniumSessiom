package Seleniumsession;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMInsideIframe {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver =new ChromeDriver();
	    driver.get("https://selectorshub.com/shadow-dom-in-iframe/#");	
	   Thread.sleep(4000);
	   
	   driver.switchTo().frame("pact");
	
	String lunchTime="return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	WebElement Timing=	(WebElement)js.executeScript(lunchTime);
		Timing.sendKeys("12 pm");
	
	//SVG-------->local-name()----->name()---ony applicable xpath not applicable csss selector
		
	//shadow DOM--------------->CSS selector applicable	
	}

}
