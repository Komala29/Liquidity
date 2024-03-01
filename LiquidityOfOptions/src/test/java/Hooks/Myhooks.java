package Hooks;

import java.time.Duration;
import java.util.Properties;

import Factory.DriverFactory;
import Utilities.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;


public class Myhooks extends DriverFactory{
	//WebDriver driver;
	@BeforeAll
	public static void setUp() {
		System.out.println("Browser opening");
		
		Properties prop = ConfigReader.intializeProperties();
		 driver = DriverFactory.IntializeBrowser(prop.getProperty("browser"));
		 driver.get(prop.getProperty("url"));
	}
	@AfterAll
	public static void tearDown() {
			driver.quit();
	}
}
