package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementshandles {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//SVG:=Cannot use CSS for SVG
		//SVG:=only xpath is applicable:special xpath syntax
		
		driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone");
		
		driver.findElement(By.xpath("//button//*[local-name()='svg'  and @fill='none']")).click();
		
	}

}