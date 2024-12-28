package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisible {
      static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//	Boolean flag=	driver.findElement(By.linkText("Desktops")).isDisplayed();
//	System.out.println(flag); 
	  WebElement submitbutton=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
	  System.out.println(submitbutton.isDisplayed());
	  
	  WebElement submitbutton1=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
	  System.out.println(submitbutton1.isEnabled());
	  
	  WebElement submitbutton2=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
	  System.out.println(submitbutton2.isSelected());
	}

}
