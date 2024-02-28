package stepDefination;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageFactory.InputFieldPage;

public class InputFieldStep {
	WebDriver driver;
//	HomePage homepage;
	InputFieldPage homepage = new InputFieldPage(LetcodeSetup.driver);
//	private ExtentTest extentTest = ExtentReportManager.createTest("InputFieldStep operations");

	
	@Given("letcode is open")
	public  void openLetCode() {
		 System.out.println("let code opened successfully==========");
		 LetcodeSetup.driver.get("https://letcode.in/test");
		 LetcodeSetup.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		 extentTest.pass("let code is opened");
	}
	@And("Input Field page open")
	public void inputFieldPage() {
		InputFieldPage edit= new InputFieldPage(LetcodeSetup.driver);
		edit.inputFieldsPage();
		LetcodeSetup.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	@When("Fill details in input fields")
	public void fillingInputFields() {
		InputFieldPage input= new InputFieldPage(LetcodeSetup.driver);
		input.fulName();
		LetcodeSetup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		input.clearText();
//		 extentTest.pass("Fill details in input fields passed ");
		//driver.quit();
	}
	
}
