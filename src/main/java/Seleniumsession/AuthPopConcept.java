package Seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopConcept {
      static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		
		//Basic Auth
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}

}
