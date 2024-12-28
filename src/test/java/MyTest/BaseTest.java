package MyTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
     protected WebDriver driver;
      
      @Parameters({"url","Browser"})
      @BeforeTest
	  public void setup(String URL,String BrowserName) {
    	  System.out.println("Browser name " +BrowserName );
    	  
    	  switch (BrowserName.toLowerCase().trim()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "operamini":
			driver=new EdgeDriver();
			break;	
		
		default:
			System.out.println("Plese pass the right browser"  +BrowserName);
			break;
		}
	  	  
	  	  driver.manage().deleteAllCookies();
	  	  driver.manage().window().maximize();
	  	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  	  driver.get(URL);
	  	  
	  	   
	     }
       
       
       
      @AfterTest
      public void tearDown() {
   	   driver.quit();
      }
       
       
       
       
       
       
}
