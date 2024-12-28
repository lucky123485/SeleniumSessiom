 package Seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDownHandling {
      static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
        driver=new ChromeDriver();
		
		driver.get("https://html.com/attributes/select-multiple/");
		
		
		//tc3: All value
		//This is rough code
	//	By selectmultiple=By.xpath("//select");
		
//		WebElement mult=driver.findElement(selectmultiple);
//		
//		Select select =new Select(mult);
//		
//	if (select.isMultiple()) {
//		System.out.println("multiple option allow ");
//		
//		select.selectByVisibleText("American flamingo");
//		select.selectByVisibleText("Andean flamingo");
//		select.selectByVisibleText("Chilean flamingo");
//		select.selectByVisibleText("Lesser flamingo");
//	}
//	
//	int count= select.getAllSelectedOptions().size();
//	System.out.println(count);
//	Thread.sleep(2000);
//	select.deselectByVisibleText("American flamingo");
//	Thread.sleep(2000);
//	select.deselectAll();
		
		//This is dropdown utility part
		By selectmultiple=By.xpath("//select");
		By optionlocator=By.xpath("//select//option");
		
		//Tc1: single value
		//SelectMultipleDropdownValue(selectmultiple,"American flamingo");
		
		
		//Tc2:multiple value		
    //	SelectMultipleDropdownValue(selectmultiple,optionlocator,"American flamingo","Lesser flamingo","Chilean flamingo");
		
		//Tc3 select all value 
		SelectMultipleDropdownValue(selectmultiple,optionlocator,"all");
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public static boolean isDropDownMultiple(By locator) {
		Select select= new Select(getElement(locator));
	return	select.isMultiple() ? true  : false;
	}
	
	// This method is used the select value from the dropdown it can select
	//1 single selection
	//2. multiple selection
	//3 select all
	
	
	public static void SelectMultipleDropdownValue(By locator, By optionlocator,String...  values) {
		Select select=new Select(getElement(locator));
		
		if(isDropDownMultiple(locator)) {
			
			if(values[0].equalsIgnoreCase("all")) {
				List <WebElement> optionList= driver.findElements(optionlocator);
				for(WebElement e:optionList) {
					e.click();
				}
			}
				else {
					for(String value: values) {
						select.selectByVisibleText(value);
					}
				}
			}
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	

