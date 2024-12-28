package Seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jqueryDropDownHandle {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
        driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/selectmenu/");
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		  driver.findElement(By.xpath("//span[@id='speed-button']")).click();
		
List<WebElement> optionlist=		 driver.findElements(By.cssSelector("ul#speed-menu div"));
      System.out.println(optionlist.size());
      
      for(WebElement e:optionlist) {
   String s= 	  e.getText();
   System.out.println(s);
       if(s.contains("Faster")) {
    	   e.click();
    	   break;
       }
      }
      System.out.println("-----------------------------------------------------------------------------------------------------");
     Thread.sleep(2000);
      driver.findElement(By.cssSelector("span#files-button")).click();
     List <WebElement> ab= driver.findElements(By.cssSelector("ul#files-menu div"));
     System.out.println(ab);
      for(WebElement e:ab) {
    	String al=  e.getText();
    	System.out.println(al);
    	
    	if(al.equals("Some other file with a very long option text")) {
    		e.click();
    		break;
    	}
      }
      
    System.out.println("-----------------------------------------------------------------------------------------------------------");
      driver.findElement(By.cssSelector("span#number-button")).click();
      
  List<WebElement> ac=    driver.findElements(By.cssSelector("ul#number-menu div"));
  System.out.println(ac.size());
       for(WebElement e: ac) {
    	  String r= e.getText();
    	  System.out.println(r);
    	  if(r.equals("17")) {
    		  e.click();
    	  }
       }
      
	}

}
