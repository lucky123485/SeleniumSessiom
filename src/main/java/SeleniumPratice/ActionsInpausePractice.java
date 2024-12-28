package SeleniumPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsInpausePractice {
      static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement user=driver.findElement(By.id("input-email"));
		
		Actions act =new Actions(driver);
		
		String value="lucky12333";
		char val[]=value.toCharArray();
		
		for(char c:val) {
			act.sendKeys(user, String.valueOf(c)).pause(500).build().perform();
		}
		
	}

}
