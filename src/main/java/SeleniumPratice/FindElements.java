package SeleniumPratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		List<WebElement> Elements=driver.findElements(By.className("list-group-item"));
//		
//		System.out.println(Elements.size());
//		By attval=By.name("email");
//		String get=GetAttribute(attval,"className");
//		System.out.println(get);
		
		By attval=By.linkText("Register");
	String get=	GetAttribute(attval,"href");
	System.out.println(get);
	}
	
	public static String GetAttribute(By locator,String Attvalue) {
		return getElements(locator).getAttribute(Attvalue);
	}
	
	public static WebElement getElements(By locator) {
		return driver.findElement(locator);
	}

}
