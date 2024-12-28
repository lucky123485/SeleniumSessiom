import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseXpath {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver =new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);
    //   driver.manage().window().maximize();
		
	//	driver.findElement(By.xpath("//a[text()='Joe.Root']//parent::td//preceding-sibling::td//child::input[@type='checkbox']")).click();
    //   clickuser("John.Smith");
//String li=       driver.findElement(By.xpath("//a[text()='John.Smith']//parent::td//following-sibling::td[text()='Admin']")).getText();
//System.out.println(li);
//if(li.equals("Admin")) {
//	System.out.println("pass");
//}    
//		List<String> user=GetUserData("Garry.White");
//	//	System.out.println(user);
//		for(String e: user) {
//		System.out.println(e);
//		}
//	String text=     userrole("Garry.White");
//	System.out.println(text);
//	String tex=     userrole("John.Smith");
//	System.out.println(tex);
	
	String text=     employeeName("Garry.White");
	System.out.println(text);
	String tex=     employeeName("John.Smith");
	System.out.println(tex);
	}
		public static String userrole(String users) {
		return	driver.findElement(By.xpath("(//a[text()='"+users+"']//parent::td//following-sibling::td)[1]")).getText();
		}
		public static String employeeName(String users) {
			return	driver.findElement(By.xpath("(//a[text()='"+users+"']//parent::td//following-sibling::td)[2]")).getText();
		}
	public static List<String> GetUserData(String users) {
	List <WebElement> gettext=	driver.findElements(By.xpath("//a[text()='"+users+"']//parent::td//following-sibling::td"));
	List<String> value= new ArrayList<String>();
	for(WebElement e:gettext ) {
		String text=e.getText();
		value.add(text);
	}
	return value;
	}
	
	
   public static void clickuser(String username) {
	   driver.findElement(By.xpath("//a[text()='"+username+"']//parent::td//preceding-sibling::td//child::input[@type='checkbox']")).click();
	   
   }
  
   
}
