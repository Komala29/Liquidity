package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div/div[@class='modal-content admin-modal-content']")
	private WebElement InfoModalPage;
	
	@FindBy(xpath = "//span[@class='anticon anticon-close ant-modal-close-icon']")
	private WebElement InfoModalCloseIcon;
	
	@FindBy(xpath ="//div/span/span[@class='anticon anticon-setting']")
	private WebElement HomePageSettingIcon;
	
	@FindBy(xpath="//div/div[2]/span/div/span[2]")
	private WebElement Home_SelectLogoutButton;
	
	@FindBy(xpath= "//div/span[text()='Logout']")
	private WebElement HomePage_Logout;
	
	@FindBy(xpath = "//div/ul/li/button[contains(text(),Manage)]")
	private WebElement ManageButton;
	
	@FindBy(xpath = "//div/span[contains(text(),'Exercise Options')]")
	private WebElement SelectExerciseOptions;
	
	@FindBy(xpath = "//div/button/span[contains(text(),'Create New Exercise Event')]")
	private WebElement CreateExerciseEventbutton;
	
	@FindBy(xpath="//header/div/div[contains(text(),'New Exercise Event')]")
	private WebElement NewExerciseEventText;
	
	public boolean infoModal() {
		return InfoModalPage.isDisplayed();
	}
	
	public void infoModalCloseIcon() {
		InfoModalCloseIcon.click();
	}
	public void homepageSettingIcon() {
		HomePageSettingIcon.click();
	}
	
	public boolean manageButtonDisplayed() {
		return ManageButton.isDisplayed();
	}
	
	public void manageButton() {
		ManageButton.click();
	}
	
	public void homepageSelectLogout() {
		 Home_SelectLogoutButton.click();
	}
	
	public void homepageLogoutButton() {
		HomePage_Logout.click();
	}
	 
	public void selectExerciseOptions() {
		SelectExerciseOptions.click();
	}
	
	public void createExerciseEventButton() {
		CreateExerciseEventbutton.click();
	}
	public boolean newExerciseEventText() {
		return NewExerciseEventText.isDisplayed();
	}
	

}
