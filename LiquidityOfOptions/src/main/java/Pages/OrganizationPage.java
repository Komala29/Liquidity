package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OrganizationPage  {
	
	WebDriver driver;
	
	public OrganizationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div/span/span[@class='anticon anticon-setting']")
	private WebElement SettingIconOrg;
	
	@FindBy(xpath = "//div/div/h1[text()='SouledStore']")
	public WebElement OrganizationName;
	
	public boolean settingIconOrganizationPage() {
		return SettingIconOrg.isDisplayed();
	}
	
	public void clickOnOrganizationName() {
		OrganizationName.click();
	}

}
