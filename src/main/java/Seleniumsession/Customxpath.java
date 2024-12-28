package Seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customxpath {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		//xpath:address of the element in the html dom
		//1. absolute xpath:/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[1]/div
		//2. relative xpath:using element attribute with xpath function
		
		//formula to create releative xpath: //htmltag[attrName='value']://input[@name='firstName'] ://input[@placeholder='First Name']
		
		//use multiple attribute create relative xpaTh: //htmltag[@attr1='value' and @attr2='value']://input[@placeholder='First Name' and @name='firstName']
		
		//input[@name]: 3 found: use findElements
		
		//a -- 81 links--------->use findElements
		
		
		
		 driver= new ChromeDriver();
		 driver.get("https://www.freshworks.com/?tactic_id=6525630&utm_source=google-adwords&utm_medium=FWorks-Search-Brand-Core-India&utm_campaign=FWorks-Search-Brand-Core-India&utm_term=freshworks&device=c&matchtype=e&network=g&gclid=Cj0KCQjwgrO4BhC2ARIsAKQ7zUm5kn3nceb41WgYJFxCfBYct-0c7YQg7LVJy99W3XaJ9fAF9Qi0jwoaAlhsEALw_wcB&gad_source=1");
		 
//int Totalcount=	driver.findElements(By.xpath("//img")).size();
//System.out.println(Totalcount);

//we can also use or opertor://input[@type='text' or @type='email' or @type = 'password']
//we can also use xpath without value //input[@type and @id]
		 
	//	 By imgtext=By.xpath("//img[@class='_2puWtW _3a3qyb']");
		 
//		 List<WebElement> imglinks=driver.findElements(By.xpath("//a[@title='Advertise']"));
//		 System.out.println(imglinks.size());
//		 
//		 for(WebElement e:imglinks) {
//			String text= e.getText();
//			System.out.println(text);
//		 }
//	 
		 
		 //*=check this total element on the page
		 
		 //text() text function in xpath: formula //htmltag[text()='value']--------------------->//h2[text()='Test login']
		 //text() in xpath : headers,links spans: //anchertag[text()='value']---------------------->//a[text()='requiring payment']
     // we can also write text() function with attribute://a[text()='value' and @attrbute= 'value']--------------->//a[text()='payment' and @class='form-control']
		 
		 //contains() in xpath://htmltag[contains(@attr, 'value')]----------->//input[contains(@name,'username')] or also write 2 Aattribute //input[contains(@name,'user') and @id='username']
        //we can also use contains function multiple tym: //input[contains(@name,'user') and @id='username' and contains(@type,text)]
		 
		 //contains() function with long text: //htmltag[contains(text(),'value')]-------------> //h3[contains(text(),'Contact Management')] or //small[contains(text(),' Free CRM can alert you to')]
		 
		 //when we use contains------->long text and also when we have dynamic attribute
		 
 		 // we can write contains() with text and attribute: htmltag[contains(text(),'value') and contains(attribute,'value')]
		 
		 
		 //2: Dynamic attribute 
		 //dynamic id: dynamic attribute is those attribute which value always change when page goes refresh mode example
		 // <input>id =firstname_123>
		 //<input>id=firstname_234>
		 //<input>id=firstname_345>
		 //every time page refresh value of attribute change so we handle this type of dynamic attribute problem with the use of contains
		 
		 //input[contains(@id,'firstname'_)]
		 
		 //3 starts-with()in xpath
		//small[starts-with(text(),'Free CRM')]
		 
		 //4 space with text 
		 //label[normalize-space()='Yes]
		 
		 
		 //5 index capture group
	//	 (//input[@type='text'])[1]
		 
	//	 driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("lucky");
	//	 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("sharma");
		 
		 //example of find help in amazon using indexing
//		 
//	String text=driver.findElement(By.xpath("((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]")).getText();
//	System.out.println(text);	 
//	if(text.equals("help")) {
//		System.out.println("pass");
//	}
		 
	//2nd example
//	String textt=driver.findElement(By.xpath("((//div[@class='sc-6293d692-0 eNMhGa'])[last()]//li)[last()]")).getText();
//	System.out.println(textt);	 
//	if(textt.contains("Freddy AI ")) {
//		System.out.println("pass");
//		
//	}
//	else {
//		System.out.println("fail");
//	}
//		 
	//1.Parent to child
    //direct child: use of single slash /
    //indirect +direct child: use of double slash // form[@id='form-currency']//ul[@class='dropdown-menu']//button
		 
   //2.child to parent: //input[@type='email']/../../../../../../../../../..
	//website name :https://demo.automationtesting.in/Register.html	 
		 
	//3 child to parent and again parent to child:
   //input[@type='email']/../../label[@class='col-md-3 col-xs-3 col-sm-3 control-label']/.. 	Both are same 
	//input[@placeholder='First Name']/parent::div/input[@type='text']	 both are same
	////input[@placeholder='First Name']/parent::div/child::input[@type='text']: this also same use child keyword
	////input[@placeholder='First Name']/ancestor::div[@class='form-group']/label[text()='Full Name* '] :ancestor concept
		 
	//4:in this child to parent to sibling using preceding-sibling keyword:
	//	eg://input[@id='input-firstname']/parent::div/preceding-sibling::label[@for='input-firstname'] 
	// eg: //a[text()='Careers']/ancestor::ul//preceding-sibling::div	 
	
   //5.4: parent to sibling using following sibling keyword -sibling keyword: (forward direction)
	//	 eg://div[@class='col-sm-10']/following-sibling::input[@name='firstname']
		 
	// parent ,child, sibling,preceding,following these all are called---xpath axis	 
}
}