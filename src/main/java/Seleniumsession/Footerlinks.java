package Seleniumsession;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Footerlinks {
static WebDriver driver;
	public static void main(String[] args) {
		 driver= new ChromeDriver();
		 
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		 By footerlink= By.xpath("//footer//a");
		 
//		List<WebElement> footerlist= driver.findElements(footerlink);
//		System.out.println(footerlist.size());
//		
//		for(WebElement e: footerlist) {
//		String list=	    e.getText();
//		System.out.println(list);
//		
		ElementUtil eli=new ElementUtil(driver);
		
	int totalLinks=	eli.getTotalcount(footerlink);
	System.out.println(totalLinks);
	List<String> ListLinks=	eli.getElementsTextList(footerlink);
	List<String> ExpectedList= Arrays.asList("About Us","Contact Us","My Account");
		
	if(ListLinks.containsAll(ExpectedList)){
		System.out.println("imp footer links___________pass");
	}
		
			
		}
		
		}
		 
		 
		 
	


