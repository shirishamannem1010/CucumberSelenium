package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonsPage {

	
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='Toggle']")
	WebElement toggle;
	
	public RadioButtonsPage(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	public void clickOnToggle() {
		this.toggle.click();
	}
	
	
}
