package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.homePagefactory.AddLocation;
import com.homePagefactory.LoginHomeFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepForLocation {
	WebDriver driver;

	@Given("^Admin is in Admin homepage$")
	public void admin_is_in_Admin_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rubeldm\\Documents\\workspace_driver\\chromedriver2.33.exe" );
		driver=new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		AddLocation l= new AddLocation(driver);
		l.LoUserName().sendKeys("Admin");
		l.LoPassword().sendKeys("admin");
		l.ClickLogin().click();
		
	   
	}

	@When("^Mouse hover to Admin, organization and click on locations link$")
	public void mouse_hover_to_Admin_organization_and_click_on_locations_link() throws Throwable {
		AddLocation l= new AddLocation(driver);
		l.MouseHoverToAdmin();
	}

	@When("^click Add Button$")
	public void click_Add_Button() throws Throwable {
		AddLocation l= new AddLocation(driver);
		l.clickADDbutton().click();
	 
	}

	@When("^Enter Name\"([^\"]*)\"$")
	public void enter_Name(String arg1) throws Throwable {
		AddLocation l= new AddLocation(driver);
		l.Name_Location().sendKeys(arg1);
		System.out.println("you have success fully Enter location name");
	    
	}

	@When("^Select_country$")
	public void select_country() throws Throwable {
		AddLocation l= new AddLocation(driver);
		l.Select_Country();
	 
	}

	@When("^Select State/Province$")
	public void select_State_Province() throws Throwable {
	 
		AddLocation l= new AddLocation(driver);
		l.Select_State();
	}

	@When("^Enter City\"([^\"]*)\"$")
	public void enter_City(String arg1) throws Throwable {
		AddLocation l= new AddLocation(driver);
		l.City_Name().sendKeys(arg1);
	  
	}

	@When("^Enter Address \"([^\"]*)\"$")
	public void enter_Address(String arg1) throws Throwable {
		AddLocation l= new AddLocation(driver);
		l.Write_Address().sendKeys(arg1);
	   
	}

	@When("^Enter ZipCode \"([^\"]*)\"$")
	public void enter_ZipCode(String arg1) throws Throwable {
		AddLocation l= new AddLocation(driver);
		l.Write_Zipcode().sendKeys(arg1);
	   
	}

	@When("^Enter phoneNumber\"([^\"]*)\"$")
	public void enter_phoneNumber(String arg1) throws Throwable {
		AddLocation l= new AddLocation(driver);
		l.Write_PhoneNumber().sendKeys(arg1);
	    
	}

	@When("^Enter FaxN\"([^\"]*)\"$")
	public void enter_FaxN(String arg1) throws Throwable {
		AddLocation l= new AddLocation(driver);
		l.Write_FaxNumber().sendKeys(arg1);
	    
	}

	@When("^Write Notes\"([^\"]*)\"$")
	public void write_Notes(String arg1) throws Throwable {
		AddLocation l= new AddLocation(driver);
		l.Write_Notes().sendKeys(arg1);
	
	}

	@When("^click On Save Button$")
	public void click_On_Save_Button() throws Throwable {
		AddLocation l= new AddLocation(driver);
		l.Click_Save().click();
		 System.out.println("You have Successfully Add Location");
	  
	}


	@Then("^Browser will closee After complete test$")
	public void browser_will_closee_After_complete_test() throws Throwable {
		driver.quit();
	
	}

	@When("^Enter InValidName\"([^\"]*)\"$")
	public void enter_InValidName(String arg1) throws Throwable {
		AddLocation l= new AddLocation(driver);
		l.Name_Location().sendKeys(arg1);
		System.out.println("you have success fully Enter Invalid location name");
	    
		
	}
	
	@Then("^Positiveconfirmation message will display$")
	public void positiveconfirmation_message_will_display() throws Throwable {
	System.out.println("You have successfully Add Location");

	
	}


@Then("^Negativeconfirmation message will display$")
public void negativeconfirmation_message_will_display() throws Throwable {
	AddLocation l= new AddLocation(driver);
	l.Errorlist();
}    
	

	

}//end class
