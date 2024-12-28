package Seleniumsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleURL {
	
	  static WebDriver driver;
		public static void main(String[] args) {
	     //  driver=new ChromeDriver();
			driver=new EdgeDriver();
			
		   driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		   
		   driver.findElement(By.linkText("About Us")).click();
		   
//		   WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
//		if  (wait.until(ExpectedConditions.titleContains("About"))){
//			System.out.println(driver.getTitle());
//		}
//		else {
//			System.out.println("title is incorrect");
//		}
	  String title=	   WaitForTitleContains("About11",10);
	   System.out.println(title);
		   
		}
		
		    public static String WaitForTitleContains(String titleFraction,int Timeout) {
			   WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(Timeout));
			   
             	try {		   
				if  (wait.until(ExpectedConditions.titleContains(titleFraction))){
					return driver.getTitle();
				}
             	}catch(TimeoutException e) {
             		System.out.println(titleFraction + "   title value is not present");
             		e.printStackTrace();
             	}
             	return null;
		}
	    	public  static String WaitForTitleIs(String title, int Timeout) {
			 WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(Timeout));
			 try {
			 if(wait.until(ExpectedConditions.titleIs(title))) {
			 return	 driver.getTitle();
			 }
			 }catch(TimeoutException e) {
				 System.out.println(title+  "    title is not present");
				 e.printStackTrace();
			 }
			 return null;
		}
	    	
	     	public  static String WaitForURlContains(String URLfraction, int Timeout) {
				 WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(Timeout));
				 try {
				 if(wait.until(ExpectedConditions.urlContains(URLfraction))) {
				 return	 driver.getTitle();
				 }
				 }catch(TimeoutException e) {
					 System.out.println(URLfraction+  "    title is not present");
					 e.printStackTrace();
				 }
				 return null;
			}
	     	
	     	public  static String WaitForURlToBe(String URL, int Timeout) {
				 WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(Timeout));
				 try {
				 if(wait.until(ExpectedConditions.urlToBe(URL))) {
				 return	 driver.getTitle();
				 }
				 }catch(TimeoutException e) {
					 System.out.println(URL+  "    title is not present");
					 e.printStackTrace();
				 }
				 return null;
			}
		
		
}
