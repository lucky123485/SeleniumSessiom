package SeleniumPratice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class ShadowDOMPractice {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver =new ChromeDriver();
	    driver.get("https://books-pwakit.appspot.com/");	
	   Thread.sleep(4000);
	   
	 //  driver.switchTo().frame("pact");
	
	String Book="return document.querySelector(\"body > book-app\").shadowRoot.querySelector(\"#input\")";
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	WebElement bookName=	(WebElement)js.executeScript(Book);
		bookName.sendKeys("Por Dad Rich Dad");
	}

}
