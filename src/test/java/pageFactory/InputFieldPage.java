package pageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class InputFieldPage {
 WebDriver driver;
 
	
 @FindBy(xpath = "//a[text()='Edit']")
	 WebElement editBtn;
 
 @FindBy(id = "fullName")
 WebElement fullName;
 
 @FindBy(id="join")
 WebElement text;
 
 @FindBy(id="getMe")
 WebElement appendText;
 @FindBy(id="dontwrite")
 WebElement readOnly;
 
	
	public InputFieldPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void inputFieldsPage() {
		System.out.println("button click =============="+this.editBtn);
		  WebDriverWait wait = new WebDriverWait(driver, 10);
	      wait.until(ExpectedConditions.visibilityOf(editBtn));
		this.editBtn.click();
	}
	public void fulName() {
		this.fullName.sendKeys("ShirishaMannem");
	}
	public void clearText() {
		this.text.clear();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		this.text.sendKeys("I'm fantastic");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		this.appendText.sendKeys(" Im adding new text to existing text");
		String currentText = appendText.getAttribute("value");
		System.out.println("Input field value: " + currentText);
		
		System.out.println("it is for readonly : "+!readOnly.isEnabled());
	}
	
	
	
	
	
	
	
	
	
	public InputFieldPage() {}
	
	
	//https://letcode.in/test
}
