package MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{

	
	
	   @Test(priority=1)
	    public void GoogleTitleTest() {
	   String title=	 driver.getTitle();
	   System.out.println(title);
	     Assert.assertEquals(title,"Google");
	     }
	     
	     @Test(priority=2)
	     public void GoogleUrlTest() {
	   String url= 	 driver.getCurrentUrl();
	    System.out.println();
	    Assert.assertTrue(url.contains("https://www.google.com/"));
	     }
	    
}
