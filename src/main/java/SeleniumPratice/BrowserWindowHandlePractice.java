package SeleniumPratice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class BrowserWindowHandlePractice {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
        driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		                   
	// String parentwindow=   driver.getWindowHandle();
	 
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
        driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
    	driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
    	driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
         
    Set<String> handles=	driver.getWindowHandles();
      Iterator<String> it= handles.iterator();
        String parentwindow    =  it.next();
        System.out.println(parentwindow);
        
            String childid =it.next();
		System.out.println(childid);
		 
	     String childid2 =it.next();
			System.out.println(childid2);
			
		     String childid3 =it.next();
				System.out.println(childid3);
              
			     String childid4 =it.next();
					System.out.println(childid4);
					
					Thread.sleep(2000);
					driver.switchTo().window(childid);
					System.out.println("child id 1 url: "   +driver.getCurrentUrl());
					driver.close();
					
					Thread.sleep(2000);
					
					driver.switchTo().window(parentwindow);
					System.out.println("parent id url:  "     +driver.getCurrentUrl());
				//	driver.close();
					
					Thread.sleep(2000);
					driver.switchTo().window(childid2);
					System.out.println("child id 2 url:  "   +driver.getCurrentUrl());
					if(childid2.contains("facebook")) {
						System.out.println("pass the url");
					}
					driver.close();
					
                    Thread.sleep(2000);
					
					driver.switchTo().window(parentwindow);
					
					Thread.sleep(2000);
					driver.switchTo().window(childid3);
					System.out.println("child id 3 url:  "    +driver.getCurrentUrl());
					driver.close();
					
					  Thread.sleep(2000);
						
					driver.switchTo().window(parentwindow);
					
					Thread.sleep(2000);
					driver.switchTo().window(childid4);
					System.out.println("child id 4 url:   "   +driver.getCurrentUrl());
					driver.close();
					
					  Thread.sleep(2000);
						
					driver.switchTo().window(parentwindow);
					
					
	}

}
