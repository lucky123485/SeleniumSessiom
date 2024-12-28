package Seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jqyeryDropdownHandlingConcept {
	  static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
			
			driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
			
			Thread.sleep(2000);
			  driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
			  
	List<WebElement> choiceoption	=	  driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
	 //  System.out.println(choiceoption.size());
		for(WebElement e:choiceoption) {
//		String ab=	e.getText();
//		System.out.println(ab);
			try {
			e.click(); 
			}
			catch(ElementNotInteractableException ex) {
				System.out.println("choice question is finished");
				break;
		}
			
				
		
		
	}

}
}