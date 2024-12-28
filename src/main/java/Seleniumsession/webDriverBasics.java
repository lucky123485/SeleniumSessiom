package Seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class webDriverBasics {
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		String browser= "chrome";
		//cross browser logic:with top casting:parallel testing
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			driver=new ChromeDriver();
			
			break;
		case "firefox":
			driver=new FirefoxDriver();
			
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		default:
			System.out.println("plese pass the right:");
			break;
		}
		
		
		//open the browser: chrome
		//enter the url
		//get title
		//verify the title actual vs exp
		// close the browser
		
	//WebDriver driver = new ChromeDriver();
		//EdgeDriver driver=new EdgeDriver();
	//	FirefoxDriver driver=new FirefoxDriver();
		//ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		String acttitle=driver.getTitle();
		System.out.println("title is:" +acttitle);
		
		if(acttitle.equals("Google")) {
			System.out.println("Title is correct......Pass");
		
			
		}
		else {
			System.out.println("Title is incorrect .....Fail");
		}
	String url=	driver.getCurrentUrl();
		System.out.println(url);
		
		if(url.contains("google")) {
			System.out.println("url is ----Pass");
		}
		else {
		System.out.println("Fail");
		}
		
// String Pagesource=		driver.getPageSource();
//		System.out.println(Pagesource);
//		
//		if(Pagesource.contains("html")) {
//			System.out.println("Pass");
//		}
//		
	//	driver.quit();
		
		
		
		
		
		
		
		
	}

}
