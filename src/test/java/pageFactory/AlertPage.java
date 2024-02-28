package pageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPage {
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='Dialog']")
	WebElement analog;
	
	public void clickAnalog() {
		this.analog.click();
	}
	
	public AlertPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
}
