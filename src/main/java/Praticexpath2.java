import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Praticexpath2 {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver =new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
	//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//strong[text()='Australia']//parent::td//preceding-sibling::td//input[@type='checkbox']")).click();
//		countryclick("Afghanistan");
//		countryclick("Austria");
//		countryclick("Bhutan");
//		countryclick("India");
//		
//	String afan=	capital("Afghanistan");
//	System.out.println(afan);
//	String aus=	capital("Austria");
//	System.out.println(aus);
//	String bh=	capital("Bhutan");
//	System.out.println(bh);
//	String ind=	capital("India");
//	System.out.println(ind);
//	List<String> tex=countryinfo("Afghanistan");
//	System.out.println(tex);
//	List<String> te=countryinfo("Austria");
//	System.out.println(te);
//	List<String> t=countryinfo("Bhutan");
//	System.out.println(t);
//	List<String> hind=countryinfo("India");
//	System.out.println(hind);
	
	
	
	
  }
	
	public static List<String> countryinfo(String coninfo) {
	List<WebElement> cou=	driver.findElements(By.xpath("//strong[text()='"+coninfo+"']//parent::td//following-sibling::td"));
	List<String> info=new ArrayList<String>();
	for(WebElement e:cou) {
	String text=	e.getText();
	info.add(text);
	}
	return info;
	}
	
	public static String capital(String capitals) {
	return	driver.findElement(By.xpath("(//strong[text()='"+capitals+"']//parent::td//following-sibling::td)[1]")).getText();
	}
	public static void countryclick(String country) {
		driver.findElement(By.xpath("//strong[text()='"+country+"']//parent::td//preceding-sibling::td//input[@type='checkbox']")).click();
	}
      
	}


