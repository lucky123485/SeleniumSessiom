package Seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarouselHandling {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		Thread.sleep(5000);
		while(true) {
			if(driver.findElements(By.xpath("//td[text()='Canada']")).size()>0) {
				selectcountry("Canada");
				break;
				
			}else {
		WebElement ele= driver.findElement(By.linkText("Next"));
		   if(ele.getAttribute("class").contains("disabled")) {
			   System.out.println("pagination is over element is not found");
			   break;
		   }
		
		  ele.click();
		  Thread.sleep(1000);
			}
		}
		
			
    	   
  
			
		
		
		
	}
	
	public static void selectcountry(String country) {
		driver.findElement(By.xpath("//td[text()='"+country+"']//preceding-sibling::td/input[@type='checkbox']")).click();
		
	}
		
		
}	
		
		
		
		
		

		
		
		
		
	

