package Seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePagination {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
	
		driver.get("https://selectorshub.com/xpath-practice-page/");
	
		
		Thread.sleep(5000);
		//single selection
//		
//		while(true) {
//			//if ele on the 1st page itself
//			if(driver.findElements(By.xpath("//td[text()='Denmark']")).size()>0) {
//			selectCountry("DenMark");
//			break;
//			
//			}else {
//				//pagination logic
//				//click on next
//				WebElement next=driver.findElement(By.linkText("Next"));
//				if(next.getAttribute("class").contains("disabled")){
//				System.out.println("pagination is over country not found");	
//				break;
//				}
//				
//				next.click();
//				Thread.sleep(1000);
//				
//			}
//			
//		}
		//for multiple selection
		
		while(true) {
		if	(driver.findElements(By.xpath("//td[text()='India']")).size()>0) {
			selectmultiplecountry("India");
			
		}
		
		WebElement next=driver.findElement(By.linkText("Next"));
		if(next.getAttribute("class").contains("disabled")){
			System.out.println("pagination is over page not found");
			break;
		}

		
	   next.click();
	   Thread.sleep(1000);
		}
	}
	
	public static void selectmultiplecountry(String countryName) {
  List<WebElement> country=		driver.findElements(By.xpath("//td[text()='"+countryName+"']//preceding-sibling::td/input[@type='checkbox']"));
  for(WebElement e:country) {
	  e.click();
  }
	}

    
	public static void selectCountry(String countryName) {
		driver.findElement(By.xpath("//td[text()='"+countryName+"']//preceding-sibling::td/input[@type='checkbox']")).click();
		
	}
	
}
