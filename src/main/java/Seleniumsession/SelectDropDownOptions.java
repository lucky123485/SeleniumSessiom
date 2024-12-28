package Seleniumsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownOptions {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
       driver =new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/en/book-a-free-demo");
		
		Thread.sleep(1000);
		
		By country = By.id("Form_getForm_Country");
		
//		WebElement countryele= driver.findElement(country);
//		
//		Select select =new Select(countryele);
//		
//    List<WebElement> countryList= select.getOptions();
//    
//    System.out.println(countryList.size());
//    
//	 for(WebElement e:countryList) {
//    String text= e.getText();
//    System.out.println(text);
//    if(text.equals("India")) {
//    	e.click();
//    	
	int ab=	getDropDownOptionCount(country)-1;
	if(ab==232){
		System.out.println("pass");
	}
//	
//List<String>abc=	getDropDownoptions(country);
////System.out.println(abc);
//   for(String e:abc) {
//	   System.out.println(e);
//	  
//   }
	if(getDropDownoptions(country).contains("India")) {
		System.out.println("pass");
	}
	
	  
		
   //SelectCountry(country,"India");
		
    }
	
	public static WebElement getElement(By locator) {
	return	driver.findElement(locator);
	  	  
		
	}
	public static int getDropDownOptionCount(By locator) {
		Select select=new Select(getElement(locator));
	return	select.getOptions().size();
		
	}
	public static List<String> getDropDownoptions(By locator) {
		Select select=new Select(getElement(locator));
	List<WebElement> optionList=	select.getOptions();
	List<String> optionTextList=new ArrayList<String>();
	for(WebElement e:optionList) {
	String text=e.getText();
	optionTextList.add(text);
	}
	return optionTextList;
	}
	 
	public static void SelectCountry(By locator, String value) {
		Select select=new Select(getElement(locator));
		List <WebElement>countryName=select.getOptions();
		for(WebElement e: countryName) {
		String name=	e.getText();
		System.out.println(name);
		if(name.equals(value)) {
			e.click();
			break;
		}
		//return name;
		}
		
		
	}

}
