package SeleniumPratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksImage {
      static WebDriver driver;
	public static void main(String[] args) {
	         driver =new ChromeDriver();
	         driver.get("https://www.amazon.in/ref=nav_logo");
	         
	 List<WebElement> tag=   driver.findElements(By.tagName("img"));
	 System.out.println(tag.size());
//	 
//	 for(WebElement e:tag) {
//	String text=e.getText();
//	   if(text.length()!=0) {
//		 String hrefval=  e.getAttribute("href");
//		 System.out.println("href val:"+  " " +hrefval);
	 
    for (WebElement e:tag) {
    	String text=  e.getText();
    //	if(text.length()!=0) {
    		String attval=e.getAttribute("alt");
    		String attva=e.getAttribute("src");
    		System.out.println(attva+  " ======================" +attval);
    	}
    }
	   }
	 
	         
	//}


