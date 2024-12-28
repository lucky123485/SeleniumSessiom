package SeleniumPratice;

public class Opencart {

	public static void main(String[] args) {
		BrowserUtil br=new BrowserUtil();
		br.launchBrowser("chrome");
		br.LaunchUrl("https://naveenautomationlabs.com/opencart/");
		br.GetPagetitle();
		br.GetPageUrl();
		br.CloseBrowser();
		
	}

}
