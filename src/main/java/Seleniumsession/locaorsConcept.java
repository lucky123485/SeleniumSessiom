package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locaorsConcept {
 static WebDriver driver;
	public static void main(String[] args) {
	driver =new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1.id is attribute unique
		
	//	driver.findElement(By.id("input-email")).sendKeys("lucky12222");
		
		
//		//2 name is an attribute some time duplicate in rarely cases
        //driver.findElement(By.name("email")).sendKeys("lucky12222");
//		
//		
//		
//		//3.className is an attribute most of the time is duplicate
	//	driver.findElement(By.className("form-control")).sendKeys("lucky12222");
		
		// className is can b more than one in tag like c1 c2 c3 etc
		
		//4.xpath : xpath is not an attribute the is the addresses of the the element in the html dom
		
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("lucky@123");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("234455");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input")).click();
		
//		By email=By.id("input-email");
//		By pwd =By.id("input-password");
//		By click=By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input");
//		dosendKeys(email,"lucky");
//		dosendKeys(pwd,"12333");
//		getclick(click);
		
		//5 cssSelector : it is not attribute
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("lucky12233");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("12233");
//		driver.findElement(By.cssSelector("input.btn")).click();
//        		
//		By emailid=By.cssSelector("#input-email");
//		By pwd=By.cssSelector("#input-password");
//		By loginbtn=By.cssSelector("input.btn");
//		
//	dosendKeys(emailid,"lucky1233");
//		dosendKeys(pwd,"2333");
//		getclick(loginbtn);
		
		
		//6 linkText : linkText is not an attribute, this is the text of the link
		//html tag=<a> anchor tag
		//linkText:can be duplicated
		
	//	driver.findElement(By.linkText("Register")).click();
	//	By registerlink=By.linkText("Register");
		//getclick(registerlink);
		
		//7: PartialLinkText: only for links
	//	driver.findElement(By.partialLinkText("Forgotten")).click();
	//By partical =By.partialLinkText("Forgotten");
	//getclick(partical);

		
		//8 tagname: html tag
//         String text=driver.findElement(By.tagName("h2")).getText();
//         System.out.println(text);
		
//		By header= By.tagName("h2");
//		
//		String headervalue=doElementGetTextBy(header);
//		System.out.println(headervalue);
//		if(headervalue.equals("New Customer")) {
//			System.out.println("Pass");
//		}else {
//			System.out.println("Fail");
		
//		
		By Logoimg=By.className("img-responsive");
		
		getclick(Logoimg);
		
		
			//so there is 8 locotors in selenium
			
			//id---------------------------if id is avilble we go the id ist
			//name---------------------------2nd
			//className------------------------3rd
			
			//xpath
			//css
			
			//linkText
			//partical linkText
			//tagName
		
	//	to check the unqueness of id= we use # and class we use 
		
		//No such element Exceptiuon:no such element: unable to locate element
		
		//if you are passing null keys in ur send keys method its always gives you IllgegalargumentException
		
		// we also put value in sendKeys usint string,string buffer and string builder ---> this are  coming in char sequence
		}
		
		
	
	public static String doElementGetTextBy(By locatore) {
		return getElement(locatore).getText();
	}
	public static void getclick(By locatore) {
		getElement(locatore).click();
	}
	
	
	public static void dosendKeys(By locatore,String value) {
		getElement(locatore).sendKeys(value);
	}
	
	public static WebElement getElement(By locatore) {
		return driver.findElement(locatore);
		
		
		
		
		
		
		
		
	}
}
