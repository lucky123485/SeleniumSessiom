package Seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlelanguagelinks {
static WebDriver driver;
	public static void main(String[] args) {
		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
	  By valuetext =By.xpath("//div[@id='SIvCob']/a");
	  clickonElement(valuetext,"తెలుగు");
		
	}
	public static void clickonElement(By locator,String value) {
		List<WebElement> valuetext	= driver.findElements(locator);
		System.out.println(valuetext.size());
		
		for(WebElement e:valuetext) {
			String text=e.getText();
			System.out.println(text);
			if(text.contains(value)) {
				e.click();
				break;
			}
		
		}
	}

}
