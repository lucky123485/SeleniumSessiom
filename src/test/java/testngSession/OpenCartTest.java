package testngSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTest {
	
	WebDriver driver;
		
		@BeforeTest
		public void setup() throws InterruptedException {
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			
		}
			
		@Test (priority=2)
		public void isOpenCartLogoIsVisibleHere() {
	    boolean flag=driver.findElement(By.xpath("//*[@id=\"logo\"]/a/img")).isDisplayed();
	       Assert.assertEquals(flag,true);
		}
		
		@Test(priority=1)
		public void openCartTitleTest() {
	    String title=		driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals(title,"Account Login");
		}
		
		@Test(priority=0)
		public void getUrlTest() {
	    String Url=		driver.getCurrentUrl();
	    System.out.println(Url);
	    Assert.assertTrue(Url.contains("naveen"));
		}
		
		@AfterTest
		public void tearDown() {
			driver.quit();
		}
			
		
	
      
	
}
