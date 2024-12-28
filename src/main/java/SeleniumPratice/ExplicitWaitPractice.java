package SeleniumPratice;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitPractice {
      static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By username=By.name("firstname");
		By con=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
//		WebDriverWait  wait=new WebDriverWait(driver,Duration.ofSeconds(10),Duration.ofSeconds(10));
//		
//	WebElement ele=	wait.until(ExpectedConditions.visibilityOfElementLocated(username));
//		ele.sendKeys("Lucky1233");
//		
//		WebElement ele1=wait.until(ExpectedConditions.visibilityOfElementLocated(con));
//		ele1.click();
	//	TimeINtervalVisibilityWait(username,10,2).sendKeys("lucky12333");
		
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		if(wait.until(ExpectedConditions.titleContains("Register"))){
//			System.out.println(driver.getTitle());
//		}
	String ab=	waitContainGetTitle("Register",10);
	System.out.println(ab);
String Url=	waitcontainsURL("naveen",10);
System.out.println(Url);
		
	}
	public static WebElement TimeINtervalVisibilityWait(By locator,int Timeout,int TimeInterval) {
		WebDriverWait  wait=new WebDriverWait(driver,Duration.ofSeconds(Timeout),Duration.ofSeconds(TimeInterval));
	return	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	public static String waitContainGetTitle(String value,int Timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Timeout));
		 try {
		if(wait.until(ExpectedConditions.titleContains(value))) {
		return	driver.getTitle();
		}
		 }
		 catch (org.openqa.selenium.TimeoutException e) {
			 System.out.println(value+ "    Title is not present");
			 e.printStackTrace();
		 }
		 return null;
	}
	public static String waitcontainsURL(String URL,int Timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Timeout));
		try {
		if(wait.until(ExpectedConditions.urlContains(URL))) {
		return	driver.getCurrentUrl();
			
		}
		}catch(org.openqa.selenium.TimeoutException e) {
			System.out.println(URL+ "      url is not correct");
			e.printStackTrace();
			
		}
		return null;
	}
	
	
	
	
	
	
	

}
