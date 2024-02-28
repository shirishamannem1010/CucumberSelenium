package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageFactory.SelectPage;

public class SelectDropDownStep {
	WebDriver driver;
	SelectPage selectpage= new SelectPage(LetcodeSetup.driver);
	
	@When("click on drop down button")
	public void clickDropDownBtn() {
		selectpage.selectDropDown();
		LetcodeSetup.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@And("select fruit")
	public void selectFruit() {
		selectpage.selectFruit();
	}
	@And("select super hero in drop down")
	public void selectSuperHero() {
		selectpage.selectHeros();
	}
	@And("select last programming language in drop down")
	public void selectProgrammingLanguage() {
		selectpage.programmingLanguage();
	}
	 @When("I print all options from the dropdown")
	    public void printAllOptionsFromDropdown() {
	       selectpage.printallOptions();
	  }
	 
	 @And ("print select value from the dropdown")
	 public void printSelectedValue() {
		 selectpage.printSelectedValue();
}
}
