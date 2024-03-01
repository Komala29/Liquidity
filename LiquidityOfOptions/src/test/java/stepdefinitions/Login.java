package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import Pages.HomePage;
import Pages.LoginPage;
import Pages.OrganizationPage;
import Pages.WebsitePage;


import Factory.DriverFactory;
import org.openqa.selenium.JavascriptExecutor;


public class Login {
	
	WebDriver driver = null;
	private LoginPage loginPage;
	private OrganizationPage organizationPage;

@Given("^User is on marketplace login page and enters valid username (.+)$")
	public void user_enters_valid_username_something(String emailText) throws InterruptedException {
		driver = DriverFactory.getDriver();
	 	 Thread.sleep(5000);
		 loginPage = new LoginPage(driver);
		 loginPage.EmailAddress(emailText);
	}
@And("^enters valid password (.+)$")
	public void enters_valid_password_something(String passwordText) {
		loginPage.Password(passwordText);
	}

@And("Click on Login button")
	public void click_on_login_button() throws InterruptedException { 
		loginPage.LoginButton();
		Thread.sleep(5000);
	}

@Then("User should login successfully and be on organization page")
public void user_should_login_successfully_and_be_on_organization_page() throws InterruptedException {
		organizationPage = new OrganizationPage(driver);
		organizationPage.settingIconOrganizationPage();
}


}