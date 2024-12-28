package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackGroundColour {
 static WebDriver driver;
	public static void main(String[] args) {
		
		       driver=new ChromeDriver();
		        
				driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
				
				WebElement element= driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
				
				String bgcolour= element.getCssValue("backgroundColor");
				System.out.println(bgcolour);
		
	}

}
