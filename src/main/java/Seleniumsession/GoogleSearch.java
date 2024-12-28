package Seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation Testing");
		
		Thread.sleep(3000);
		List<WebElement> googleserch=driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		System.out.println(googleserch.size());
		for(WebElement e:googleserch) {
	String text=		e.getText();
	System.out.println(text);
	if(text.contains("automation testing tools")) {
		e.click();
		break;
	}
		}
		
	}
}
