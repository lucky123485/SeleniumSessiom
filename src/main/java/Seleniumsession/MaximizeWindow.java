package Seleniumsession;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
static WebDriver driver;
	public static void main(String[] args) {
		 driver=new ChromeDriver();
			
	        
	   //    driver.manage().window().maximize();
		     driver.manage().window().fullscreen();	        
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			
	}

}
