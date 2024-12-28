package SeleniumPratice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavSriptExecutorPractice {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//	String title=	         js.executeScript("return document.title").toString();
//		System.out.println(title);
//
	JavaSscriptutilPractice jse=new JavaSscriptutilPractice(driver);
//		Thread.sleep(2000);
//		jse.BackwardInJs();
//		Thread.sleep(2000);
//		jse.forwardInJs();
//		Thread.sleep(2000);
//		jse.RefreshInJs();
//		Thread.sleep(2000);
//		jse.pageScrollDown();
//		Thread.sleep(2000);
//		jse.pageScrollUp();
//		Thread.sleep(2000);
//	    jse.pageScrollMidway();
//	    Thread.sleep(2000);
//      
//String text= jse.getPageText();
//
//System.out.println(text);
	Thread.sleep(2000);
	String title=	jse.GetTitleinJs();
	System.out.println(title);
	Thread.sleep(2000);
	String URL=jse.GetUrlinJs();
	System.out.println(URL);
	}

}
