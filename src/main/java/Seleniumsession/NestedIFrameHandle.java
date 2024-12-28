package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIFrameHandle {
        static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		Thread.sleep(2000);
		
		//Frame1
		driver.switchTo().frame("pact1");
	    driver.findElement(By.id("inp_val")).sendKeys("first crush1");
	    
		//Frame2
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("first crush2");
		
		//Frame3
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("first crush3");
		
		driver.switchTo().parentFrame();   //Frame3---->Frame2
		driver.switchTo().parentFrame();   // Frame2----->Frame1
		
		driver.findElement(By.id("inp_val")).sendKeys("first crush");
		
		//driver.switchTo().parentFrame();    Frame1------->outside
		driver.switchTo().defaultContent();
		
	String ab=	driver.findElement(By.tagName("h3")).getText();
	System.out.println(ab);
	}

}
