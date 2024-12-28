package Seleniumsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsFunction {
     static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		
		By links=By.tagName("a");
		By img=By.tagName("img");
//		
//       int TotalLinks=	getTotalcount(links);
//       int Totalimg=getTotalcount(img);
//       System.out.println(TotalLinks);
//       System.out.println(Totalimg);
//       
//   List<String> linksTextList=   getElementsTextList(links);
//   System.out.println(linksTextList);
//   if(linksTextList.contains("Desktops")){
//	   System.out.println("pass");
//   }
	List<String>AttributeProperty=getElementsAttributeList(links,"href");
	System.out.println(AttributeProperty);
	for(String e:AttributeProperty) {
		System.out.println(e);// for vertically print
		
	}
	}
	
	//Write the function:capture of the all the pages links and returm List<String>
	
	public static List<String>getElementsTextList(By locator) {
	List<WebElement>eleList=getElements(locator);
	List<String> eleTextList=new ArrayList<String>(); 
	for(WebElement e:eleList) {
	String text=e.getText();
	if (text.length()!=0) {
		eleTextList.add(text);
	}
	
	}
	return eleTextList;
	
		
	}
	// write a function capture attribute from the list
	public static List<String> getElementsAttributeList(By locator, String AttriName) {
	List<WebElement> AttributeList =getElements(locator);
	List <String> EleTextList=new ArrayList<String>();
	for(WebElement e:AttributeList) {
		String Text=  e.getAttribute(AttriName);
		  EleTextList.add(Text);
	}
	return EleTextList;	
	}
	
	
	public static int getTotalcount(By locator) {
		return getElements(locator).size();
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
}
