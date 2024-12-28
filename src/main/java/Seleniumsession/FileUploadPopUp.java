package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/upload");
		
		// <tag type='file'>should be there-----------99.99% there
		// if not there:
		//1 ask the devloper to add that type: file
		//2 3rd party libs:AutoIT(Windows),Robot(Window),Sikuli(image-based)
		
		driver.findElement(By.id("fileInput")).sendKeys("/home/bhavesh/Desktop/patterns.txt");
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[@id='fileSubmit']")).click();
	}

}
