package SeleniumPratice;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Foooterlink {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver =new ChromeDriver();
		driver.get("https://hackernoon.com/recommended-websites-to-practice-selenium-and-test-automation");
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

	//	Thread.sleep(3000);
		By footerlink =By.className("sc-c154f978-6");
		
//		List <WebElement>ab= driver.findElements(footerlink);
//		System.out.println(ab.size());
//		
//		for(WebElement e:ab) {
//		String ac=	e.getTagName();
//         System.out.println(ac);	
		Elementutil el =new Elementutil(driver);
int ab=		el.getTotalCount(footerlink);
System.out.println(ab);
          List<String> ac= el.getElementsTextList(footerlink);
          System.out.println(ac);
          List<String> expectedList= Arrays.asList("about","Contact","Cookies");
          if(ac.containsAll(expectedList)) {
        	  System.out.println("pass");
          }
		
		}
		
	}


