package SeleniumPratice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		//a[text()='John.Smith']/parent::td//preceding-sibling::td//child::input[@type='checkbox']
		
		driver= new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		Thread.sleep(4000);
	//	driver.findElement(By.xpath("//a[text()='Garry.White']/parent::td//preceding-sibling::td//child::input[@type='checkbox']")).click();
		
		//use classic crm application more for webtablehandling
		
		userSelect("Garry.White");
		userSelect("Jasmine.Morgan");
		userSelect("Jordan.Mathews");
		
List<String> textvalue=		getUserInfo("Jordan.Mathews");
		System.out.println(textvalue);
		
		
	}
	
	public static void userSelect(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td//preceding-sibling::td//child::input[@type='checkbox']")).click();
		
	}
	public static List<String> getUserInfo(String userInfo) {
	List <WebElement> colEles=	driver.findElements(By.xpath("//a[text()='"+userInfo+"']/parent::td/following-sibling::td"));
	List<String>colValuesList=new ArrayList<String>();
	for(WebElement e: colEles) {
	String text=e.getText();
	colValuesList.add(text);
	}
	return colValuesList;
	}

}
