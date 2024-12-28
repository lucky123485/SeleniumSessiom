package Seleniumsession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJSPopupHandling {
       static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		//alert: javScript popup or model dialog pop ups  there are three types of alert
		
		//1 alert
		
		//2 prompt
		
		//3 confirm
		
		//All these three types of alert handle by:: Alert API
		
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		//1. Alert Js popup handle:
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//        Alert alert=driver.switchTo().alert();
//          String text=    alert.getText();
//             System.out.println(text); 
//             Thread.sleep(2000);
//             alert.accept(); // accept the alert
//             
//           //  alert.dismiss();  dismiss the alert
		
		
		//2.confirm popup
		
    //driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
//	Alert alert=	driver.switchTo().alert();
//	     String text=    alert.getText();
//	     System.out.println(text);
//	     Thread.sleep(2000);
//	//     alert.accept();
//	     alert.dismiss();
		
	     //3. prompt up alert
	     
   driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
	Alert alert=	driver.switchTo().alert();
	String text= alert.getText();
	System.out.println(text);
	 alert.sendKeys("Testing the tool");
	 Thread.sleep(3000);
	 alert.accept();
             
	}

}
