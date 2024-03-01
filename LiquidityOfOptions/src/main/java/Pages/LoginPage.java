package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath="//div/h1[contains(text(),'Login to Qapita')]")
	private WebElement LoginToQapita;
	
	@FindBy(id = "emailAddress")
	private WebElement emailAddress;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(xpath = "//div/div/button[@value='login']")
	private WebElement LoginButton;
	
	public boolean loginToQapita() {
		return LoginToQapita.isDisplayed();
		
	}
	
	public void EmailAddress(String emailText) {
		emailAddress.sendKeys(emailText);
	}
	
	public void Password(String passwordText) {
		password.sendKeys(passwordText.trim());
	}
	 
	public OrganizationPage LoginButton() {
		LoginButton.click();
		return new OrganizationPage(driver);
	}

}
