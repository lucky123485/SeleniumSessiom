package Seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class browserUtil {
 private WebDriver driver;
 
 
 public WebDriver  launchBrowser(String BrowserName) {
	 System.out.println("Launch the browser: " +BrowserName);
	 switch (BrowserName.toLowerCase().trim()) {
	case "chrome":
		driver=new ChromeDriver();
		break;
	case "edge":
		driver=new EdgeDriver();
		break;
	case "firefox":
		driver=new FirefoxDriver();
		break;

	default:
		System.out.println("Plese pass the right browser");
		throw new AutomationException("Invalid browser");
		
	}
	 return driver;
 }
	 public void launchUrl(String url) {
		 if(url==null) {
			 System.out.println("url is null");
			 throw new AutomationException("Url null");
		 }
		 if(url.indexOf("http")==0) {
			 driver.get(url) ;
			 
		 }else {
			 System.out.println("url is incorrect");
			 throw new AutomationException("incorrect url");
		 }
		 
	 
 }
	 public String GetPageTitle() {
		 String Title= driver.getTitle();
		 return Title;
	 }
	 
	 public String GetPageUrl() {
		 String Url=driver.getCurrentUrl();
		 return Url;
	 }
	 public boolean getPageResource(String value) {
		 String page=driver.getPageSource();
		 if(page.contains(value)) {
			return true;
		 }
		 return false;
		 }
	 public void closeBrowser() {
	driver.close();
	System.out.println("close the browser");
	 }
  

    	
    }
	


