package SeleniumPratice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {
      static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
        driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//		
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		
//Alert alert		= driver.switchTo().alert();
//           String text=  alert.getText();
//		System.out.println(text);
//		Thread.sleep(2000);
//		alert.accept();
		

//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		
//Alert alert		= driver.switchTo().alert();
//           String text=  alert.getText();
//		System.out.println(text);
//		Thread.sleep(2000);
//		alert.accept();
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
//		
//Alert alert		= driver.switchTo().alert();
//           String text=  alert.getText();
//		System.out.println(text);
//		Thread.sleep(2000);
//		alert.sendKeys("lucky1233");
//		alert.accept();
		
//		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));
//	String text=	driver.findElement(By.tagName("h2")).getText();
//	System.out.println(text);
//		Thread.sleep(2000);
//		driver.findElement(By.id("fileSubmit")).sendKeys("/home/bhavesh/Desktop/SQL.txt");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		Thread.sleep(2000);
	Alert alert=	driver.switchTo().alert();
	String text=     alert.getText();
	          System.out.println(text);
	          Thread.sleep(2000);
	          alert.accept();
	    driver.findElement(By.id("login1")).sendKeys("lucky1222");
	    driver.findElement(By.xpath("//input[@name='proceed']")).click();
	    Alert alertt=	driver.switchTo().alert();
		String textt=     alertt.getText();
		          System.out.println(textt);
		          Thread.sleep(2000);
		          alert.accept();
	    
	          
	
                    	}

}
