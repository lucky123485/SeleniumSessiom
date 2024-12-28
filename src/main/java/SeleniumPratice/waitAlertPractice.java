package SeleniumPratice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitAlertPractice {
      static WebDriver driver;
	public static void main(String[] args) {
		 driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//	Alert alert=	wait.until(ExpectedConditions.alertIsPresent());
//	       System.out.println(alert.getText());
//	       alert.accept();
		
		String text=getalertText(10);
       System.out.println(text);
       entervalueinjsalert("lucky",10);
       alertaccept(10);
	}
	
	
	public static Alert waitforalert(int Timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Timeout));
		return wait.until(ExpectedConditions.alertIsPresent());
		
	}
	
	public static void alertaccept(int Timeout) {
		waitforalert(Timeout).accept();
		
	}
	
	public static String getalertText(int Timeout) {
	return 	waitforalert(Timeout).getText();
	}
	
	public static void entervalueinjsalert(String value,int Timeout) {
		waitforalert(Timeout).sendKeys(value);
	}

}
