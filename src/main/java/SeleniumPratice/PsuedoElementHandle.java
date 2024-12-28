package SeleniumPratice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PsuedoElementHandle {
      static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		//:: before return type of psuedo
		//:: after
		
		String script="return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('content');";
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
String mandtext=		js.executeScript(script).toString();
    System.out.println(mandtext);
    if(mandtext.contains("*")) {
    	System.out.println("First name is mandatory");
    }
		
		
	}
}
	


