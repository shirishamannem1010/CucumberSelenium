package stepDefination;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageFactory.ButtonsPage;
import pageFactory.NavigatingBrowser;
public class ButtonsPageStep {

	ButtonsPage buttonspage = new ButtonsPage(LetcodeSetup.driver);
	WebDriver driver;
	 NavigatingBrowser navigatingBrowser;
	
	@When("click on buttons page")
	public void openButtonsPage() {
		
		buttonspage.buttonPage();
		System.out.println("clicked on buttons ===========");
			
	}
	@And("click on gotobutton")
	public void gotoButton() {
		navigatingBrowser = buttonspage.gotoButton();
		System.out.println("clicked on goto button");
	}
	
	@And("find the location of button")
	public void locationButtons() {
		  navigatingBrowser.navigateBack();
		buttonspage.locationBtn();
		System.out.println("=====found the location coordinations=====");
	}
	
	@And("find the button color")
	public void findBtnColor() {
		buttonspage.colorBtn();
		System.out.println("--------Completed the buttons operations------- ");
	}
	
	
}
