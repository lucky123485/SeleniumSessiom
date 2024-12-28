package Seleniumsession;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFForAlertConcept {
     static WebDriver driver; 
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		
//	Alert alert=	wait.until(ExpectedConditions.alertIsPresent());
//	
//	  System.out.println(alert.getText());
//	      alert.accept();
//	  
		//waitForJsAlert(10);
 String text=		getJsAlertText(10);
 System.out.println(text);
		AcceptJsAlert(10);
	//	getJsAlertText(10);
		
		
	}
	
	public static Alert waitForJsAlert(int Timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Timeout));
	return	wait.until(ExpectedConditions.alertIsPresent());
		
		
	}
	public static void AcceptJsAlert(int Timeout) {
		 waitForJsAlert(Timeout).accept();

}
	public static void dismissJsAlert(int Timeout) {
		 waitForJsAlert(Timeout).dismiss();
	
	
}	
	public static String getJsAlertText(int Timeout) {
		return waitForJsAlert(Timeout).getText();
	
	
	
}	
	
	public static void enterValueOnJsAlert( int Timeout, String value) {
		 waitForJsAlert(Timeout).sendKeys(value);
	
	
	
	
	
}	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
