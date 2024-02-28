package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
public class LetcodeSetup {
	 static WebDriver driver;
	@Before
	public void browserSetUp() {
		 System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver2.exe");
		 System.setProperty("webdriver.chrome.logfile", "chromedriver.log");
	     System.setProperty("webdriver.chrome.verboseLogging", "true");
		 
		 	ChromeOptions chromeOptions = new ChromeOptions();
	        chromeOptions.setBinary("C:/Program Files/Google/Chrome/Application/chrome.exe");
	        chromeOptions.addArguments("--remote-debugging-port=61358");
	        //chromeOptions.addArguments("--remote-debugging-port=0");
	        chromeOptions.addArguments("--whitelisted-ips=");
	        chromeOptions.addArguments("--disable-gpu");
	        driver = new ChromeDriver(chromeOptions);
	        
	        System.out.println("Browser Launched successfully==========");
	        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

    @After
    public void tearDown() {
        driver.quit();
    }
	
}
