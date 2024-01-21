package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageElements.LandingPage;

public class BaseTests {
	WebDriver driver;
	
	public WebDriver InitializeBrowser() {
		driver=new ChromeDriver();
		return driver;
	}
	
	public LandingPage LaunchApplication() {
		driver=InitializeBrowser();
		LandingPage landingpage=new LandingPage(driver);
		landingpage.GoTo();
		landingpage.Click_on_ViewPlans();
		return landingpage;
	}

}
