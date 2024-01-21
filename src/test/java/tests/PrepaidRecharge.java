package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Utilities.BaseTests;
import pageElements.LandingPage;

public class PrepaidRecharge extends BaseTests {
	LandingPage lp;
	@Test
	public void WorldCupPlanRecharge() throws InterruptedException  {

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		lp= LaunchApplication();
		
	//	Thread.sleep(5000);
		
		//using Explicitwait until the webelement ic clickable
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-dropdowns-1")));
		
		
		
		
	}

}
