package SeleniumPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class opencartLogin {

	

	public static void main(String[] args) {
		BrowserUtil br=new BrowserUtil();
		
		WebDriver driver = br.launchBrowser("chrome");
		
//		br.launchBrowser("chrome");
		br.LaunchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		Elementutil el=new Elementutil(driver);
		By username= By.name("email");
		By pwd=By.name("password");
		By click=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		By tag=By.tagName("h2");
		By tagg=By.tagName("img");
//		el.sendkeys(username,"lucky");
//		el.sendkeys(pwd, "123344");
//		el.getclick(click);
//       String text=  el.gettext(tag);
//       System.out.println(text);
	     el.getclick(tagg);
    
       
	}

}