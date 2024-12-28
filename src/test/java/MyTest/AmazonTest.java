package MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {
	
	
        @Test(priority=1)
        public void AmazonTitleTest() {
       String title= driver.getTitle();
       System.out.println(title);
        Assert.assertEquals(title,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
       }
     
       @Test(priority=2)
        public void AmazonURLTest() {
       String url= 	 driver.getCurrentUrl();
       System.out.println();
       Assert.assertTrue(url.contains("amazon"));
     }
    

}
