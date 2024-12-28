package SeleniumPratice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandlingPratice {
     static WebDriver driver;;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
	//	By country=By.xpath("//select");
		
//		WebElement countryList=driver.findElement(country);
//		
//		Select select=new Select(countryList);
//		select.selectByVisibleText("American Samoa");
//		
//		Thread.sleep(2000);
//		select.selectByIndex(10);
//		
//
//		Thread.sleep(2000);
//		select.selectByValue("AND");
		
//		selectElementbyvisibleText(country,"Kyrgyzstan");
//		Thread.sleep(2000);
//		selectElementbyIndex(country,2);
//		Thread.sleep(2000);
//		selectElementbyvalue(country,"IND");
		
	//	By countryList=By.xpath("//select//option");
		
//		WebElement countryName= driver.findElement(countryList);
//		
//		Select select=new Select(countryName);
//	List<WebElement> lis=	select.getOptions();
//	  System.out.println(lis.size());
//		for(WebElement e:lis) {
//		String ab=	e.getText();
//	//	System.out.println(ab);
//		   if(ab.equals("India")) {
//			   e.click();
//			   break;
//		   }
//		
//    		}
//	  
//	int ab=	countCountry(countryList)-1;
//	System.out.println(ab);
//	if(ab==248) {
//		System.out.println("pass");
//	}
		
//	List<String> ab=	countryNames(countryList);
//	    //System.out.println(ab);
//	 if (ab.contains("Albania")) {
//		 System.out.println("pass");
//	    //for(String e: ab) {
//	    	//System.out.println(e);
//	    //	if(e.contains("Albania")) {
//	    	//	System.out.println("pass");
//	    	}
//	    }
		//getCountryClick(countryList,"Albania");
//	    List<WebElement> ab=  driver.findElements(By.xpath("//select//option"));
//	    System.out.println(ab.size());
//		 
//	    for(WebElement e:ab) {
//	    String am=	e.getText();
//	 //   System.out.println(am);
//	    if(am.contains("Albania")) {
//	    	e.click();
//	    	break;
//	    }
//	    }
		
		By country=By.xpath("//select//option");
		HandleDropdown(country,"Yemen");
//	    
	}
        
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static Select CreateSelect(By locator) {
		Select select=new Select(getElement(locator));
		return select;
	}
	
	public static void selectElementbyvisibleText(By locator,String value) {
	//	Select select=new Select(getElement(locator));
		CreateSelect(locator).selectByVisibleText(value);
	}
	public static void selectElementbyIndex(By locator,int index) {
		//Select select=new Select(getElement(locator));
		CreateSelect(locator).selectByIndex(index);
	}
	public static void selectElementbyvalue(By locator,String value) {
	//	Select select=new Select(getElement(locator));
		
		CreateSelect(locator).selectByValue(value);
	}
	public static int countCountry(By locator) {
	return	CreateSelect(locator).getOptions().size();
	}

	public  static List<String> countryNames(By locator) {
	List <WebElement> name=	CreateSelect(locator).getOptions();
	List<String> nameList= new ArrayList<String>();
	for(WebElement e: name) {
	String cou=	e.getText();
	    nameList.add(cou);
	}
	return nameList;
	
	}
	
	public static void getCountryClick(By locator, String value) {
		List<WebElement> ab=CreateSelect(locator).getOptions();
	     for(WebElement e:ab) {
	    	String al= e.getText();
	    	if(al.equals(value)){
	    		e.click();
	    		break;
	    	}
	     }
		
		
		
		
		
		
		
	}
	public static void HandleDropdown(By locator,String value) {
		List<WebElement> list= driver.findElements(locator);
		for(WebElement e:list) {
	String al=		e.getText();
	    if(al.contains(value)) {
	    	e.click();
	    	break;
	    }
		}
	}
	
	

}
