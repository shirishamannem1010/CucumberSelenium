package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectPage {

	WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Drop-Down']")
	WebElement selectDropDown;
	@FindBy(id="fruits")
	WebElement selectFruit;
	@FindBy(xpath="//option[text()='Orange']")
	WebElement selectOrange;
	@FindBy(xpath = "//option[text()='Batman']")
	WebElement selectHero;
	
	@FindBy(id="lang")
	WebElement printOptions;
	@FindBy(id="country")
	WebElement printSelectedValue;
	@FindBy(xpath = "//option[text()='Suriname']")
	WebElement selectSuriname;
	
	public  SelectPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void selectDropDown() {
		this.selectDropDown.click();
	}
	public void selectFruit() {
		this.selectFruit.click();
		this.selectOrange.click();
		System.out.println("selected fruit : "+this.selectOrange.isSelected());
	}
	public void selectHeros() {
		this.selectHero.click();
	}
	
	public void programmingLanguage() {
		WebElement dropdownElement = driver.findElement(By.id("lang"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("C#");
	}
	public void printallOptions() {
//		 WebElement dropdownElement = driver.findElement(By.id("lang"));
	        Select dropdown = new Select(printOptions);
	        java.util.List<WebElement> options = dropdown.getOptions();
	    	System.out.println("Print all options in dropdown : ");
	        for (WebElement option : options) {
	        
	            System.out.println(option.getText());
	        }
	}
	public void printSelectedValue() {
	
//		this.printSelectedValue.click();
//		this.selectSuriname.click();
		Select dropdown = new Select(printSelectedValue);
		dropdown.selectByVisibleText("Suriname");
	      WebElement selectedOption = dropdown.getFirstSelectedOption();
	        String selectedValue = selectedOption.getText();
	        System.out.println("Selected Value: " + selectedValue);
	}
	
}








