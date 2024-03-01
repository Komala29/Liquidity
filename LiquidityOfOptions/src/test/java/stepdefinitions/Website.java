package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Factory.DriverFactory;
import Pages.WebsitePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Website {
	
	WebDriver driver = null;
	private WebsitePage webpage;
	
	@Given("User is on marketplace login page")
	public void user_is_on_marketplace_login_page() throws InterruptedException {
	
		driver = DriverFactory.getDriver();
		webpage = new WebsitePage(driver);
		// Create a JavascriptExecutor instance try { // Create a JavascriptExecutor
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollBy("+1297+", "+2500+");");
		Thread.sleep(2000);
		
		 
	}
	@When("Click on liquidity login button")
	public void Click_on_liquidity_login_button() {
		webpage.clickOnLiquidityLoginButton();
	}
	@Then("User is on login page")
	public void User_is_on_login_page() throws InterruptedException {
		Assert.assertTrue(webpage.loginToQapita());
		System.out.println(webpage.loginToQapita());
		Thread.sleep(2000);
	}

}
