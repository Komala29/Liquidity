package Pages;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ConfigReader;

public class EventInfoPage {
	
	WebDriver driver = null;

	public EventInfoPage(WebDriver driver) {
		this.driver =  driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="eventName")
	private WebElement NameofLiquidityEvent;
	
	@FindBy(id="eventStartDate_date")
	private WebElement EventstartDate;
	
	@FindBy(className="ant-picker-header-view")
	private WebElement CurrentMonth;
	
	@FindBy(id="eventStartDate_time")
	private WebElement EventStartTime;
	
	@FindBy(id="eventEndDate_date")
	private WebElement EventEndDate;
	
	@FindBy(id="eventEndDate_time")
	private WebElement EventEndtime;
	
	@FindBy(xpath="//footer/div/div/button[@class='ant-btn ant-btn-primary qap-liq-next-button']")
	private WebElement NextButton;
	
	public void EventName(String getEventNameWithTimeStamp) {
		NameofLiquidityEvent.sendKeys(getEventNameWithTimeStamp());
	}
	public void EventStartDate() {
		EventstartDate.click();
	}
	public String CurrentMonth() {
		return CurrentMonth.getText();
	}
	public void EventStarttime() {
		EventStartTime.sendKeys(null);
	}
	public void EventEndDate() {
		EventEndDate.sendKeys(null);
	}
	public void EventEndtime() {
		EventEndtime.sendKeys(null);
	}
	public void NextButton() {
		NextButton.click();
	}
	public static String getEventNameWithTimeStamp() {
		Date date = new Date();
		String timeStamp = date.toString().replace(" ","_").replace(":","_" );
		System.out.println(timeStamp);
		return "Event"+ timeStamp;
	}
	

}
