package Seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
      static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
        driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(2000);
     String parentwindow=driver.getWindowHandle();
     
     driver.switchTo().newWindow(WindowType.TAB);
     Thread.sleep(2000);
     
     driver.get("https://www.google.com/");
     System.out.println(driver.getTitle());
     driver.close();
     
     driver.switchTo().window(parentwindow);
      System.out.println(driver.getTitle());
	}

}
