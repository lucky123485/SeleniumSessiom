package SeleniumPratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitIframePractice {
      static  WebDriver driver;
	public static void main(String[] args) {
       driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		By frame=By.xpath("//iframe[@id='singleframe']");
		By text=By.xpath("(//input[@type='text'])[1]");
			
		
//		WebDriverWait wait=new WebDriverWait (driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
//		
//        wait.until(ExpectedConditions.visibilityOfElementLocated(text)).sendKeys("lucky");	
		switchIframe(frame,10);
		visibilityofElement(text,10).sendKeys("happy");
		
		driver.switchTo().defaultContent(); 
	
	} 
	 public static WebElement visibilityofElement(By locator ,int Timeout) {
		 WebDriverWait wait=new WebDriverWait (driver,Duration.ofSeconds(Timeout));
		return  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	 }
	
	 
	 public static void switchIframe (By locator,int Timeout) {
		 WebDriverWait wait=new WebDriverWait (driver,Duration.ofSeconds(Timeout));
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
	 }
	
	
	

}
