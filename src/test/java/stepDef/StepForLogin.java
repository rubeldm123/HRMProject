package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.homePagefactory.BrowserFactory;
import com.homePagefactory.LoginHomeFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepForLogin {
	WebDriver driver;
	
	
@Given("^Admin Navigate to HRM Login page$")
	public void admin_Navigate_to_HRM_Login_page() throws Throwable {

	

    //BrowserFactory.initializeBrowser("chrome", "http://opensource.demo.orangehrmlive.com/");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rubeldm\\Documents\\workspace_driver\\chromedriver2.33.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
 
    
	}
	
	@When("^Admin Enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void admin_Enter_valid_and(String un, String pw) throws Throwable {
		LoginHomeFactory l= new LoginHomeFactory(driver);
		l.EnterUserName().sendKeys(un);
		l.EnterPassword().sendKeys(pw);
	}

	@When("^click on LOGIN Button$")
	public void click_on_LOGIN_Button() throws Throwable {
		LoginHomeFactory l=new LoginHomeFactory(driver);
		l.ClickLogin().click();
		 System.out.println("You have Successfully Login");
		
	 
	}

	@Then("^Admin will Land in Admin HomePage$")
	public void admin_will_Land_in_Admin_HomePage() throws Throwable {
		String titel=driver.getTitle();
		System.out.println("Welcome to " + titel + " page!");
	  
	}

	@Then("^Close The Browser$")
	public void close_The_Browser() throws Throwable {
		driver.close();
	
	}

	@When("^Admin Enter invalid \"([^\"]*)\" and \"([^\"]*)\" and click Login$")
	public void admin_Enter_invalid_and_and_click_Login(String wun, String wpw) throws Throwable {
		LoginHomeFactory l= new LoginHomeFactory(driver);
		l.EnterUserName().sendKeys(wun);
		l.EnterPassword().sendKeys(wpw);
		l.ClickLogin().click();
	  
	}

	@Then("^Error message Dispaly$")
	public void error_message_Dispaly() throws Throwable {
		LoginHomeFactory l= new LoginHomeFactory(driver);
		l.ErrorMessage();
		System.out.println("Your You Test is faild as expected ");
		
		
	  
	}
	

	 
	}//end class


