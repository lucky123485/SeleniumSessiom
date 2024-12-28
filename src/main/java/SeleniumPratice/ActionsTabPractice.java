package SeleniumPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTabPractice {
          static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement user=driver.findElement(By.id("input-firstname"));
		
		Actions act=new Actions(driver);
		
		act.sendKeys(user,"lucky122")
		                         .sendKeys(Keys.TAB)
		                         .pause(500)
		                          .sendKeys("sharma")
		                          .sendKeys(Keys.TAB)
		                          .pause(500)
		                          .sendKeys("lucky@12334").build().perform();
	}

}
