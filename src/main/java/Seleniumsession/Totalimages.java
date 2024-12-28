package Seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Totalimages {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
	List<WebElement> imglist=driver.findElements(By.tagName("img"));
	System.out.println(imglist.size());
	
	for(WebElement e:imglist) {
	String altvalue	=e.getAttribute("alt");
	String srcvalue=e.getAttribute("src");
	System.out.println(altvalue +  "=========== " + srcvalue);
	
	}
	}

}
