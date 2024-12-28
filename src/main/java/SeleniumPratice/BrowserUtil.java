package SeleniumPratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
 private WebDriver driver;
	
	public WebDriver launchBrowser(String Browser) {
		System.out.println("launch the browser"+ "" +Browser);
		
		switch (Browser.toLowerCase().trim()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		case "safari":
			driver=new SafariDriver();
			break;
		default:
			System.out.println("plsese pass the right browser");
			throw new Automationexception("invalid browser");
			
		}
	 return driver;
		
		
	}
	public void LaunchUrl(String url) {
		if(url==null) {
			throw new Automationexception("url null");
		}
		if(url.indexOf("http")==0) {
			driver.get(url);
		}
		else {
			throw new Automationexception("incorrect url");
		}
	}
	public String GetPagetitle() {
		String title=driver.getTitle();
		System.out.println(title);
		return title ;
	}
	public String GetPageUrl() {
		String Urls=driver.getCurrentUrl();
		System.out.println("This right Urls"+ " " +Urls);
		return Urls;
		
	}
	public void CloseBrowser() {
		driver.close();
		System.out.println("Browser is closed");
	}
	
	

}
