package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Factory.DriverFactory;
import Pages.HomePage;
import Pages.OrganizationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Organization extends DriverFactory{
	
	private OrganizationPage organizationPage;
	private HomePage homepage;
	
	@Given("User is on organization page")
	public void User_is_on_organization_page() throws InterruptedException {
		organizationPage = new OrganizationPage(driver);
		Assert.assertTrue(organizationPage.settingIconOrganizationPage());
	}
	@And("Click on the organization")
	public void Click_on_the_organization() throws InterruptedException {
		organizationPage.clickOnOrganizationName();
		Thread.sleep(5000);
	}
	@Then("User should be navigated to the homepage")
	public void User_should_be_navigated_to_the_homepage() throws InterruptedException {
		homepage = new HomePage(driver);
		Thread.sleep(5000);
		for(String windowName : driver.getWindowHandles()) {
			driver.switchTo().window(windowName);	
		}
		Assert.assertTrue(homepage.infoModal());
		System.out.println("Info modal verified");
	}

}
