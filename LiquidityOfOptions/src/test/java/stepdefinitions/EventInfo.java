package stepdefinitions;

import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Factory.DriverFactory;
import Pages.EventInfoPage;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class EventInfo extends DriverFactory{
	
	private HomePage homepage;
	private EventInfoPage eventinfopage;
	//WebDriver driver = null;
	
	@Given("User is on the event creation page")
	public void User_is_on_the_event_creation_page() throws InterruptedException {
		homepage = new HomePage(driver);
		Thread.sleep(1000);
		System.out.println(homepage.newExerciseEventText());
		Assert.assertTrue(homepage.newExerciseEventText());
	}
	
	@When("^User should be able to enter Event Name (.+)$")
	public void User_should_be_able_to_enter_Event_Name(String getEventNameWithTimeStamp) {
		eventinfopage = new EventInfoPage(driver);
//		System.out.println(getEventNameWithTimeStamp);
		eventinfopage.EventName(getEventNameWithTimeStamp);
	}
	@And("User should be able to enter the Event Start Date")
	public void User_should_be_able_to_enter_the_Event_Start_Date() {
		eventinfopage.EventStartDate();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ant-picker-panel']")));
		String CurrentMonth = eventinfopage.CurrentMonth();
		System.out.println(CurrentMonth);
		String Month = " ";
		String Year = " ";
		for(int i=0;i<CurrentMonth.length();i++) {
			char MonthYear = CurrentMonth.charAt(i);
			System.out.print(MonthYear);
			if((MonthYear>='A'&& MonthYear<='Z')||(MonthYear>='a'&& MonthYear<='z')) {
				 Month += MonthYear;
			}else{
				 Year += MonthYear;
			}
		  
		}
		System.out.println(Month);
		System.out.println(Year);
		/*
		 * Date date = new Date(); SimpleDateFormat formatter = new
		 * SimpleDateFormat("dd/MM/yy"); String str = formatter.format(date);
		 * System.out.println("Current date: "+str); Date previousDate = new
		 * Date(date.getTime() - 24 * 60 * 60 * 1000); SimpleDateFormat formatter1 = new
		 * SimpleDateFormat("dd/MM/yy"); String str1 = formatter1.format(previousDate);
		 * System.out.println("Previous date: "+str1);
		 */
	
	List<WebElement> elements = driver.findElements(By.xpath("//div/table[@class='ant-picker-content']/tbody/tr"));
	for(WebElement e : elements) {
		System.out.println(e.getText());
	}
	}
}
