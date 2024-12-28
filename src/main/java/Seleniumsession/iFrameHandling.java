package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameHandling {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(2000);
	//	driver.switchTo().frame(0);
	//	driver.switchTo().frame("singleframe");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='singleframe']")));
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("lucky123344");
		
		driver.switchTo().defaultContent();
	}

}
