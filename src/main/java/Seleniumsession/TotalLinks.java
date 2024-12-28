package Seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		//get the total  links on the page
		//get the text of each links
		//get the href value 
		
	List<WebElement> links=	driver.findElements(By.tagName("a"));
	System.out.println(links.size());
//	
//      for(int i =0; i<links.size();i++) {
//    	String text=  links.get(i).getText();
//    	 if(text.length()!=0) {
//    		 System.out.println(i+ ":" +text);
//    	 }
//    	 
    	   //    }
//	
// for(WebElement e:links) {
//  String text=  e.getText();
//  if(text.length()!=0);
// String hrefval= e.getAttribute("href");
//  System.out.println(hrefval+"================== "+text);
//  
  //called webScrapping
 }
}
