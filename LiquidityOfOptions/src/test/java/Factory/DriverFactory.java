package Factory;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
		public static WebDriver driver=null;

	public static WebDriver IntializeBrowser(String browsername) {
		
		if(browsername.equals("Chrome")) {
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver();
		
		}else if(browsername.equals("Firefox")) {
			driver = new FirefoxDriver();
		}else if(browsername.equals("Edge")){
			driver = new EdgeDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
		
		}
	public static  WebDriver getDriver() {
		
		return driver;
	}
		
	}


