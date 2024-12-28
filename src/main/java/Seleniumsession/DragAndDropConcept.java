package Seleniumsession;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {
     static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		By sreEle=By.id("draggable");
		By targetEle=By.id("droppable");
		
		WebElement ele=driver.findElement(sreEle);
		WebElement eles=driver.findElement(targetEle);
		
		Actions act= new Actions(driver);
		
		
		//Ist method used drag and drop
//		act
//		    .clickAndHold(ele)
//		             .moveToElement(eles)
//		                    .release()
//		                           .build()
//		                               .perform();
		       
		//2nd method used drag and drop
		act.dragAndDrop(ele, eles).build().perform();
		//assignment big basket app mousehover
	}

}
