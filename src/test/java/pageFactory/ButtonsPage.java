package pageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage {

	
WebDriver driver;

@FindBy(xpath = "//a[text()='Click']")
WebElement clickBtn;
@FindBy(id = "home")
WebElement gotoHome;
@FindBy(xpath = "//a[text()='New Course!']")
WebElement newCourse;
@FindBy(xpath = "(//a[text()='Enroll to the free course'])[2]")
WebElement enrollNew;
@FindBy(id = "position")
WebElement findLocation;
@FindBy(id="color")
WebElement findBtnColor;

@FindBy(id="property")
WebElement findPropertyBtn;

@FindBy(id="isDisabled")
WebElement btnisDisable;

	

public ButtonsPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
public void buttonPage() {
	this.clickBtn.click();
	System.out.println("---------Buttons page opened--------");
}

public NavigatingBrowser gotoButton() {
	  String originalUrl = driver.getCurrentUrl();
	this.gotoHome.click();
	
	this.newCourse.click();
	  return new NavigatingBrowser(driver, originalUrl);
	//this.enrollNew.click();
}

public void locationBtn() {
	 String currentUrl = driver.getCurrentUrl();
	    System.out.println("=================Current URL: " + currentUrl);
//	this.findLocation.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("position")));
    int xCoordinate = element.getLocation().getX();
    int yCoordinate = element.getLocation().getY();
    
    System.out.println("X coordinate : "+ xCoordinate);
    System.out.println("Y coordinate : "+ yCoordinate);
}

public void colorBtn() {
    String buttonColor = findBtnColor.getCssValue("background-color");
    // Print the color
    System.out.println("Button Color: " + buttonColor);

	
}



public ButtonsPage() {}
}
