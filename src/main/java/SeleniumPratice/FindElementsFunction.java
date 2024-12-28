package SeleniumPratice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsFunction {
	static WebDriver driver;

	public static void main(String[] args) {
		driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");	
		
		By img = By.tagName("img");
		By links=By.tagName("a");
	//	List<WebElement> imgg=driver.findElements(img);
	//System.out.println(imgg.size());
		
//	int sizee=	totalsize(img);
//        System.out.println(sizee);	
//        int link=totalsize(links);
//       System.out.println(link);
//	List<String> textnames=	getText(links);
//	System.out.println(textnames);
		
//		List<String> srcvalue=getAttribute(img ,"src");
//		System.out.println(srcvalue);
//		for(String e:srcvalue) {
//			System.out.println(e);
//		}
       Elementutil el=new Elementutil(driver);
//      int ab= el.getTotalCount(img);
//      System.out.println(ab);
     //  List<String> ab=el.getElementsTextList(links);
   //    System.out.println(ab);
List<String> text= el.getElemntsAttribute(links,"href");
      System.out.println(text);
      for(String e:text) {
    	  System.out.println(e);
      }
		
	}
	public static List<String> getAttribute(By locator, String attvalue) {
		List <WebElement> attributevalue = FindElements(locator);
		List <String> attval=new ArrayList<String>();
		for(WebElement e: attributevalue) {
		String value=	e.getAttribute(attvalue);
		attval.add(value);
		}
		return attval;
	}
	
	
	public static List<String> getText(By locator) {
		List<WebElement> text= FindElements(locator);
		List<String> textName=new ArrayList<String>();
		for(WebElement e:text) {
		String textt=	e.getText();
		if(textt.length()!=0) {
			textName.add(textt);
			
		}
		
		}
		return textName;
	}
	
	
	public static int totalsize(By locator) {
		return FindElements(locator).size();
	}
	
	public static List<WebElement> FindElements(By locator) {
	return 	driver.findElements(locator);
	}

}
