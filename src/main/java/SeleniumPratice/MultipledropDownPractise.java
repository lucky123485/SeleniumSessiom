package SeleniumPratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipledropDownPractise {
  static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		
		driver.get("https://html.com/attributes/select-multiple/");
		By selectt=By.xpath("//select");
		 By option=By.xpath("//select/option");
		WebElement mul=driver.findElement(selectt);
 Select select=new Select(mul);
//		  if(select.isMultiple()) {
//			  System.out.println("multiple option allow");
//			  
//			  select.selectByVisibleText("American flamingo");
//			  select.selectByVisibleText("Chilean flamingo");
//			  select.selectByVisibleText("James's flamingo");
//			  
//			  select.deselectByVisibleText("American flamingo");
//	List<WebElement> value= select.getAllSelectedOptions();
//	System.out.println(value.size());
//	
//	select.deselectAll();
//		  }
//		
				 selectmultipleoption(selectt,option,"all");
				 Thread.sleep(2000);
		        select.deselectAll();
		        selectmultipleoption(selectt,option,"American flamingo","Chilean flamingo");
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator); 
	}
	public static Select CreateSelect(By locator) {
		Select select=new Select(getElement(locator));
		return select;
	}
   public static boolean ismultipleSelection(By locator) {
	  return CreateSelect(locator).isMultiple() ? true : false;
   }
   public static void selectmultipleoption(By locator, By optionlocator, String... values) {
	   if(ismultipleSelection(locator)) {
		   
		   if(values[0].equalsIgnoreCase("all")) {
		List<WebElement> optionlist=	   driver.findElements(optionlocator);
		      for(WebElement e:optionlist) {
		    	  e.click();
		      }
			   
		   }
		   
		   else {
			   for(String value:values) {
				   CreateSelect(locator).selectByVisibleText(value);
			   }
		   }
	   }
   }
   
   
}
