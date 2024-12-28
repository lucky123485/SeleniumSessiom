package Seleniumsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforFrame {
      static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		By frame=By.xpath("//iframe[@id='singleframe']");
		By text=By.xpath("(//input[@type='text'])[1]");
			
//		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
//		
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
//		
		 waitforFrameBylocator(frame,5);
		waitVisible(text,10).sendKeys("lucky");
				
		
	}
	public static WebElement waitVisible(By locator,int Timeout) {
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(Timeout));
	return  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
		
	}
	public static void waitforFrameBylocator(By framelocator,int Timeout) {
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(Timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framelocator));
	}

}
