package MyTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class OpenCart extends BaseTest {

        
     
     @Test(priority=0)
      public void isOpenCartLogoVisible() {
      boolean flag=driver.findElement(By.xpath("//*[@id=\"logo\"]/a/img")).isDisplayed();
      Assert.assertEquals(flag,true);
     }
     
     @Test(priority=1)
    public void OpenCartTitleTest() {
    String title=	 driver.getTitle();
      System.out.println(title);
     Assert.assertEquals(title,"Account Login");
     }
     
     @Test(priority=2)
     public void OpenCartUrlTest() {
   String url= 	 driver.getCurrentUrl();
    System.out.println();
    Assert.assertTrue(url.contains("naveen"));
     }
    
 
     
     
     
}
