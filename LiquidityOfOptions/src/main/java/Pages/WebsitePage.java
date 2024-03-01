package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class WebsitePage {
	
	WebDriver driver;
	
	public WebsitePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
		@FindBy(xpath="//div/h1[contains(text(),'Login to Qapita')]")
		private WebElement LoginToQapita;
		
		@FindBy(xpath = "//div/button[2][text()='LOGIN']")
		private  WebElement LiquidityLoginButton;
		
		public boolean loginToQapita() {
			return LoginToQapita.isDisplayed();
			
		}
		 
		
		public void clickOnLiquidityLoginButton() {
			// TODO Auto-generated method stub
			LiquidityLoginButton.click();
		}
	

}
