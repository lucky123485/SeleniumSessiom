package SeleniumPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelector {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		driver =new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(4000);
		//css selecter is used===locator approach
		//one things you remember in css when you see id use # ===#id 
		//when you see class use .(dot) ====.class
		
		//for id=#input-firstname
	//	By.cssSelector("#input-firstname");
		
		
		//for class=.form-control
		
		//we can also write together id and class=====#input-firstname.form-control
		
		//if we have multiple class in one elementuse of dot between them =========.form-control.input-lg  
		//.form-control.input-lg  
		//.form-control.private-form__control.login-email
		
		//we also use id with multiple class===
		//.form-control.private-form__control.login-email#username
		//#username.form-control.private-form__control.login-email==change the sequence
		
		//for other attribute type,name and other attribute we create in css formula:
		//  htmltag[attribute='value']===css selector  ======input[name='email']
		
		//for multiple use attribute we create this in csss=======input[name='email'][placeholder='E-Mail Address']
		
		//we can also write lyk this======input[name='email']#input-email  
		//also==============input#input-email[name='email']
		
		//  //htmltag[@attribute='value']===for xpath
		
	//	driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("lucky");//interview question===invalid
		//invalid  Selector exception: 	Compound class names not permitted	
	//	driver.findElement(By.cssSelector(".form-control.private-form__control.login-email")).sendKeys("lucky");//valid
		
		// text() in css==== not available text function in css
		
		// contains in css=== yess===htmltag[attribute*='value']====input[id*='username']
		//starts-with=use of^====input[id^='username']
	   //ends with=use of$ sign=====input[placeholder$='Address']
	  
	// parernt to child in csss
		
		
	    //   //select[@id='Form_getForm_Country']//option====this is for xpath  ==website used   ==https://www.orangehrm.com/en/book-a-free-demo
		
		//   select[id='Form_getForm_Country']>option========this for css== direct child element: parent>child==https://www.orangehrm.com/en/book-a-free-demo
		 
		//  div.pull-left  div=== this is give direct +indirect child(space)
		
		//child to parent in css==not allowed backward tranvserse in not allowed in css
		//child to anchester=not allowed
		//preceding -sibling ==not allowed
		
		//follwing siblin in css =yes===label[for='input-email']+input===use of + plus sign
	//	label[for='input-email']+input===this is for immediate sibling	
		//label[for='input-email']~input ==this is for all sibling
		
		//comma in csss
		//"input#username,input#password,button#loginBtn,span#checkbox-content-4"
		
//      int a=driver.findElements(By.cssSelector("input#username,input#password,button#loginBtn,span#checkbox-content-4")).size();
//	
//	System.out.println(a);
//	
//	if(a==4) {
//		System.out.println("passs");
//	}else {
//		System.out.println("fail");
//	}
		
		//indexing in css
		
	//	select[name='Country']>option:nth-of-type(15)-------->specific select
	//  select[name='Country']>option:nth-of-type(n)---------->all
	//	select[name='Country'] option:first-child
	//  select[name='Country'] option:last-child	
	//  select[name='Country'] option:nth-child(24)
	//  select[name='Country'] option:nth-last-child(2)
	//  select[name='Country'] option:nth-child(odd)
	//  select[name='Country'] option:nth-child(even)	
	//  select[name='Country'] option:nth-child(n+2)
    //  select[name='Country'] option:nth-child(4n)
	
		
    //                                                      xpath                    vs               css		                              
	//1 syntax                                              complex                                   good
		
    //2	performance                                         good                                       good
		
	//3	backward                                            yes                                        no
		
	//4 sibling                                             yes                                        yes-only following
		
	//5 text                                                yes                                         no
		
	//6 ancestor                                             yes                                        no
		
	//7 index                                                yes                                         yes+1
		
	//8 comma                                                 no                                          yes
		
	//9	SVG                                                   yes                                         no
		
	//10 shadowDOM                                           no                                           yes 
		
	//11 endswith                                             no                                           yes
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
