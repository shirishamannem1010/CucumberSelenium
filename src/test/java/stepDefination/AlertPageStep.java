package stepDefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;
import pageFactory.AlertPage;

public class AlertPageStep {

	WebDriver driver ;
	
	AlertPage alertpage= new AlertPage(LetcodeSetup.driver);
	
	@When("click on alert analog")
	public void clickonAnalog() {
		alertpage.clickAnalog();
	}
	
	
}
