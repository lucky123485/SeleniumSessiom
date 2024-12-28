package SeleniumPratice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaSscriptutilPractice {
    private WebDriver driver;
    private JavascriptExecutor js;
    
    
  public JavaSscriptutilPractice(WebDriver driver) { 
	  this.driver=driver;
	  
	  js=(JavascriptExecutor)this.driver;
	  
  }
    public String GetTitleinJs() {
    	return js.executeScript("return document.title").toString();
    }
   public String GetUrlinJs() {
	   return js.executeScript("return document.URL").toString();
   }
    	
    public void pageScrollDown() {
    	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    	
    }
    
    public void pageScrollUp() {
    	js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
    	
    }
    
    public void pageScrollMidway() {
    	js.executeScript("window.scrollTo(0,document.body.scrollHeight/2)");
    
    
    }
    
    public String getPageText() {
    	return js.executeScript("return document.documentElement.innerText").toString();
    }
     
    public void forwardInJs() {
    	js.executeScript("history.go(1)");
    }
    public void BackwardInJs() {
    	js.executeScript("history.go(-1)");
    }
    public void RefreshInJs() {
    	js.executeScript("history.go(0)");
    }
    
    
    
    
    
}