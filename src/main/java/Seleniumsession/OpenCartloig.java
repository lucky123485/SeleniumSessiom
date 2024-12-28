package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartloig {

	public static void main(String[] args) {
		browserUtil brUtil =new browserUtil();
		
         WebDriver driver =brUtil.launchBrowser("chrome");
         brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
          String title=     brUtil.GetPageTitle();
          System.out.println(title);
          
          ElementUtil elUtil =new ElementUtil(driver);
          By eid =By.id("input-email");
          By pwd=By.id("input-password");
          By click=By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input");
          By image=By.className("img-responsive");
          By attribute=By.linkText("Forgotten Password");
         
//          elUtil.dosendKeys(eid,"lucky1233");
//          elUtil.dosendKeys(pwd,"23444");
//          elUtil.getclick(click);
    //    String img=  elUtil.doElementGetTextBy(image);
      String attributeval=    elUtil.doGetElementAttributeval(attribute, "href");
      System.out.println(attributeval);
        
        
       
	//	brUtil.closeBrowser();
	}

}
