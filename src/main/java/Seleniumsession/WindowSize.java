package Seleniumsession;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {
     static WebDriver driver;
	public static void main(String[] args) {
        driver=new ChromeDriver();
		
        
        driver.manage().window().setSize(new Dimension(1080,1080));
        
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	}

}
