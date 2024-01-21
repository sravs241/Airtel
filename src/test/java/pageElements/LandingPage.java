package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.AbstractMethods;

public class LandingPage extends AbstractMethods {
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		super(driver);  
		//AbstractMethods in utilit
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void GoTo() {
		driver.get("https://www.airtel.in/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.airtel.in");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	By PrepaidMenuItem= By.id("nav-dropdowns-1");
	
	@FindBy (id="nav-dropdowns-1")
	WebElement PrepaidDropDown;
	@FindBy (xpath="(//label[text()='View Plans'])[2]")
	WebElement ViewPlans;
	
	public void Click_on_ViewPlans() {
		Wait_Till_Label_Is_Clickable(PrepaidMenuItem);
		HoverAnyElement(PrepaidDropDown);
		ViewPlans.click();
	}

}
