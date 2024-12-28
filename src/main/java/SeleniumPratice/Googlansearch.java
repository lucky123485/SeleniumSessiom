package SeleniumPratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlansearch {
	static WebDriver driver;

	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		By lang=By.xpath("//div[@id='SIvCob']/a");
		getlangclick(lang,"தமிழ்");
	}
	public static void getlangclick(By locator, String value) {
		
		List<WebElement> getLang=	driver.findElements(locator);
		System.out.println(getLang.size());
		
		for(WebElement e:getLang) {
		String text=	e.getText();
		System.out.println(text);
		if (text.contains(value)) {
			e.click();
			break;
		}
		}
		
	}
		
		
	}


