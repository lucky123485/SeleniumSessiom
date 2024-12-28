package Seleniumsession;

public class OpenCarts {

	public static void main(String[] args) {
		browserUtil brUtl=new browserUtil();
	brUtl.launchBrowser("chrome");	
	brUtl.launchUrl("https://naveenautomationlabs.com/opencart/");
	String title=brUtl.GetPageTitle();
	if(title.equals("Your Store")) {
		System.out.println("Title is correct");
	}
	else {
		System.out.println("title is incorrect");
	}
	String Url=brUtl.GetPageUrl();
	if(Url.contains("opencart")) {
		System.out.println("Url is correct");
	}
	brUtl.closeBrowser();
	
	}

}
