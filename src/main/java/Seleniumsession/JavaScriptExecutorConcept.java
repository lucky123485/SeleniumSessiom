package Seleniumsession;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//JavaScriptExecutor:(JavaScriptExecutor)driver;
		//JavaScriptExecutor : its helping me to execute javaScript on the browser
		
		// selenium gives  JavaScriptExecutor interface and with this interface RemoteWebDriver class directly implemented JavaScriptExecutor
		
		// RemoteWebDriver implemented JavaScriptExecutor
		
		//And than this JavaScriptExecutor we have one method execute script method
		
		//execute script method say give me your javascript here
		
		//so we do we have create one script and we call this  execute script method and we supply the script in  execute script method 
		
		// And with the help of this method it will executed on the browser---page
		
	  //	 JavascriptExecutor js=(JavascriptExecutor)driver;
		
          //String title=		   js.executeScript("return document.title").toString();
         //System.out.println(title);

        // String title1=    js.executeScript("return document.URL").toString();
        // System.out.println(title1);

	JavaScriptUtil obj=new JavaScriptUtil(driver);
//        String title=		obj.getTitleByjs();
//        System.out.println(title);
//        String URL=		obj.getURLByjs();
//        System.out.println(URL);
//	  	 
//	  	String text= js.executeScript("return document.documentElement.innerText").toString();
//	  	System.out.println(text);
//	  	if(text.contains("Order History")) {
//	  		System.out.println("passs");
//	  	}
	     Thread.sleep(1000);
	  	 obj.ScrollPageDown();
	  	 Thread.sleep(1000);
	  	 obj.ScrollPageUp();
	}
           
}
