package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					features = "src/test/resources/features",
					glue = {"stepdefinitions","Hooks"},
					//tags =
					publish = true, 
//					dryRun = true,
//					monochrome = true,
					plugin={
							"pretty",
							"html:target/CucumberReports/CucumberReport.html",
							"json:target/CucumberReports/CucumberJSONReport.json",
							"junit:target/CucumberReports/CucumberXMLReport.xml"
							}
				)
public class TestRunner {

}
