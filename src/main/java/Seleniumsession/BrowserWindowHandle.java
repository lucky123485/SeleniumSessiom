package Seleniumsession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {
        static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		
		// step 1:  fetch the window id 
		
	     Set<String>handles=	driver.getWindowHandles();
	     Iterator<String> it=  handles.iterator();
	                String parentWindow= it.next();
	                System.out.println("parent window id"+ ":"   +parentWindow);
	                
	     String childWindow= it.next();
	     System.out.println("child window id"+ ": "  +childWindow);
	     
	     Thread.sleep(3000);
	     
	     //step 2 switching the window
	     
	     driver.switchTo().window(childWindow);
	     System.out.println("child windwo url:  "  +driver.getCurrentUrl());
	     
	     driver.close();   //child window will be closed
	     
	     Thread.sleep(3000);
	     
	     //Step 3: back to parent window
	     
	     driver.switchTo().window(parentWindow);
	     System.out.println("parent window url:   " +driver.getCurrentUrl());
	}

}
