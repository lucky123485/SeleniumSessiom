package SeleniumPratice;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassPratice {
        static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://www.bigbasket.com/?utm_source=google&utm_medium=cpc&utm_campaign=Brand-T2-FSD-5K&gad_source=1&gclid=Cj0KCQiAouG5BhDBARIsAOc08RRqy84bsDKzQpH7_90MmjYd489Qe_Tq6G1x8QLo-9lxDhu70kn5ByUaAp8-EALw_wcB");
	//	By mouseHover=By.xpath("//button[text()='Mouse Hover DropDown']");
//		By clickText=By.xpath("//a[text()='Link 3']");
//		
//		WebElement ele=driver.findElement(mouseHover);
//		WebElement ex=driver.findElement(clickText);
//		
//		Actions act=new Actions(driver);
//		
//		act.moveToElement(ele).build().perform();
//		
//		Thread.sleep(2000);
//	//	driver.findElement(By.xpath("\"//a[text()='Link 3'")).click();
//		ex.click();
//		
//		By drag=By.cssSelector("div#draggable");
//		By drop=By.cssSelector("div#droppable");
//		
//		WebElement ele=driver.findElement(drag);
//		
//		WebElement abc=driver.findElement(drop);
//		
//		Thread.sleep(2000);
//		Actions act=new Actions(driver);
//		
////		act
////		   .clickAndHold(ele)
////		                    .moveToElement(abc)
////		                                    .release()
////		                                           .build()
////		                                                  .perform();     // //a[text()='Flower Bouquets, Bunches']
//		act.dragAndDrop(ele, abc).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();
		
		
		
        
		 
			 
		
	
		Actions act =new Actions(driver);	
		
		 Thread.sleep(2000);
		 By moveElement=By.xpath("(//a[text()='Fruits & Vegetables'])[2]");
			
		 WebElement move1=driver.findElement(moveElement);
		
		act.moveToElement(move1).build().perform();
		

		 Thread.sleep(2000);
		 By moveElement2=By.xpath("//a[text()='Flower Bouquets, Bunches']");
			
	     WebElement move2=driver.findElement(moveElement2);
		
		act.moveToElement(move2).build().perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Marigold']")).click();
		
	   
	}

}
