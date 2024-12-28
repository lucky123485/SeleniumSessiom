package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		Thread.sleep(1000);
		
		//driver.switchTo().frame(2);
		//  driver.switchTo().frame("main");
		
		 driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));
		
		
		
		
		
       String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		
		//two types of frame
		//1.frame tag------->old-not recommend by w3c
		
		//2.iFrame------->new------>	recommend by w3c
		}

}
