package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "src/test/resources/features",
	    glue = "stepDefination",
	    plugin = {"json:target/Reports/cucumber.json", "html:target/Reports/cucumber-reports.html"})

	
public class CucumberTestRunner  {
	
}
