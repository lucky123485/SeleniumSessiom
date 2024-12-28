package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTabKeyConcept {
    static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=4145655117809813419&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9040170&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
//		WebElement user=driver.findElement(By.id("input-firstname"));
//		
//		
//		Actions act =new Actions(driver);
//		act.sendKeys(user,"lucky@12233")
//		                              .sendKeys(Keys.TAB)
//		                               .pause(500)
//		                               .sendKeys("automation")
//		                               .sendKeys(Keys.TAB)
//		                               .pause(500)
//		                                .sendKeys("lucky@1233")
//		                                .sendKeys(Keys.TAB)
//		                                 .pause(500)
//		                                 .sendKeys("123333").build().perform();
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys("Macbook")
		.sendKeys(Keys.ENTER).build().perform();
		                              
	}

}
