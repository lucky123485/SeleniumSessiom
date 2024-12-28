package SeleniumPratice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elementutil {
	
	private WebDriver driver;
	
	public Elementutil(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getAttribute(By locator,String attvalue) {
		return getElement(locator).getAttribute(attvalue);
	}
	public String gettext(By locator) {
		return getElement(locator).getText();
	}
	
	public void getclick(By locator) {
		getElement(locator).click();
	}
	
	public void sendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<String> getElementsTextList(By locator) {
		List <WebElement> elelist=getElements(locator);
		List<String> eleText=new ArrayList<String>();
		for(WebElement e:elelist) {
		String Text=e.getText();
		 if(Text.length()!=0) {
			 eleText.add(Text);
		 }
		}
		return eleText;
	}
	
	public List<String> getElemntsAttribute(By locator, String attvalue) {
		List<WebElement> AttList=getElements(locator);
		List<String> attText=new ArrayList<String>();
		for(WebElement e:AttList) {
			String Attvalues=e.getAttribute(attvalue);
			attText.add(Attvalues);
			
		}
		return attText;
	}
	
	public int getTotalCount(By locator) {
		return getElements(locator).size();
	}
	
	public List<WebElement> getElements(By locator) {
	return	driver.findElements(locator);
	}

}
