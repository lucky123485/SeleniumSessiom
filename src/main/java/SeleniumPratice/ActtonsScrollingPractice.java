package SeleniumPratice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActtonsScrollingPractice {
      static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		Actions act=new Actions(driver);
//		act.sendKeys(Keys.PAGE_DOWN).build().perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.PAGE_UP).build().perform();
		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).build().perform();
		}

}
