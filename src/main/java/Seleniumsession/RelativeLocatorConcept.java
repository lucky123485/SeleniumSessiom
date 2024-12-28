package Seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorConcept {
   static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
	//	By table= By.xpath("Francisco Chang");
		
	   WebElement ele=driver.findElement(By.xpath("//span[text()='Francisco Chang']"));
		
		
	   String rightside=driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(ele)).getText();
	   System.out.println(rightside);
	
	   String leftside=driver.findElement(RelativeLocator.with(By.xpath("//span[text()='Meta']")).toLeftOf(ele)).getText();
	   System.out.println(leftside);
	   
	   String above=driver.findElement(RelativeLocator.with(By.tagName("span")).above(ele)).getText();
	   System.out.println(above);
	 
	   String below=driver.findElement(RelativeLocator.with(By.tagName("span")).below(ele)).getText();
	   System.out.println(below);
	 
List<WebElement>count= driver.findElements(RelativeLocator.with(By.xpath("//div[@dir='ltr']//td[contains(@style,'border:')]/span")).above(ele));
	 System.out.println(count.size());
	    for(WebElement e:count) {
	   String text= 	e.getText();
	   System.out.println(text);
	    }
	}

}
