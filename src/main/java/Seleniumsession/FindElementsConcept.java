package Seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		//findElement : find single element +perform action
		//findElements:find multiple elements and store in the list +No action
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
List<WebElement> Listvalue=driver.findElements(By.className("form-control"));
   System.out.println(Listvalue.size());
	
	}
	
}
