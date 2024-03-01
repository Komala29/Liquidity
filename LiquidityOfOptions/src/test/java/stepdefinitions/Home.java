package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Factory.DriverFactory;
import Pages.HomePage;

public class Home extends DriverFactory{
	
	private HomePage homepage;
	//WebDriver driver = null;
	
	@Given("User is on home page and Information Modal opens")
	public void User_is_on_home_page() throws InterruptedException {
//		driver = DriverFactory.getDriver();
		homepage = new HomePage(driver);
		for(String windowName : driver.getWindowHandles()) {
			driver.switchTo().window(windowName);	
		}
		Thread.sleep(1000);
		Assert.assertTrue(homepage.infoModal());
		System.out.println("Information modal is displayed");
		System.out.println(homepage.manageButtonDisplayed());
		Assert.assertTrue(homepage.manageButtonDisplayed());
	}
	@When("Click on Close icon of information modal")
	public void Click_on_Close_icon_of_information_modal() throws InterruptedException {
		
		Thread.sleep(1000);
		homepage.infoModalCloseIcon();
	}
	@And("Click on Manage Options")
	public void Click_on_Manage_Options() {
		homepage.manageButton();
	}
	@And("Select Exercise Options")
	public void Select_Exercise_Options() {
		homepage.selectExerciseOptions();
	}
	@And("Click on Create New Exercise Event Button")
	public void Click_on_Create_New_Exercise_Event_Button() {
		homepage.createExerciseEventButton();
	}
	@Then("User should be navigated to the Exercise Event Creation page")
	public void User_should_be_navigated_to_the_Exercise_Event_Creation_page() {
		System.out.println(homepage.newExerciseEventText());
		Assert.assertTrue(homepage.newExerciseEventText());
	}

}
