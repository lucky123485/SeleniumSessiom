package Seleniumsession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowMultipleHandler {
      static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
        driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String parentWindow   =  driver.getWindowHandle();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		
	Set<String>	handles= driver.getWindowHandles();
	     Iterator<String> it=handles.iterator();
	     
	     while(it.hasNext()) {
	     String windowid= it.next();
	      driver.switchTo().window(windowid);
	      System.out.println(driver.getCurrentUrl());
	      Thread.sleep(1500);
	      
	      if(!windowid.equals(parentWindow)) {
	    	  driver.close();
	      }
	     }
	     driver.switchTo().window(parentWindow);
	     System.out.println(driver.getCurrentUrl());
		
	}

}
