package stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.homePagefactory.AddEmployee_PF;
import com.homePagefactory.AddVacancyFactor;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepForAddNewEmploy {
	WebDriver driver;
	@Given("^Admin navigate to Admin HomePage$")
	public void admin_navigate_to_Admin_HomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rubeldm\\Documents\\workspace_driver\\chromedriver2.33.exe" );
		driver=new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	 
		AddEmployee_PF e=new AddEmployee_PF(driver); 
					 
					 e.enterUserName().sendKeys("Admin");
					 e.enterPassword().sendKeys("admin");
					 e.ClickLogin().click();	   

	}
	
	@When("^Admin click on PIM link$")
	public void admin_click_on_PIM_link() throws Throwable {
		AddEmployee_PF e=new AddEmployee_PF(driver);
		e.click_PIM().click();
	}

	@When("^Click on Add Button$")
	public void click_on_Add_Button() throws Throwable {
		AddEmployee_PF e=new AddEmployee_PF(driver);
		e.click_AddButton().click();
	}


	@When("^Admin enter FirstName\"([^\"]*)\"$")
	public void admin_enter_FirstName(String arg1) throws Throwable {
		AddEmployee_PF e=new AddEmployee_PF(driver); 
		e.EnterFirstName().sendKeys(arg1);
	
	}

	@When("^Enter MiddleName \"([^\"]*)\"$")
	public void enter_MiddleName(String arg1) throws Throwable {
		AddEmployee_PF e=new AddEmployee_PF(driver); 
		e.EnterMidName().sendKeys(arg1);
	  
	}

	@When("^Enter LastName\"([^\"]*)\"$")
	public void enter_LastName(String arg1) throws Throwable {
		AddEmployee_PF e=new AddEmployee_PF(driver); 
		e.EnterLastName().sendKeys(arg1);

	}

	@When("^Enter EmployeeId\"([^\"]*)\"$")
	public void enter_EmployeeId(String arg1) throws Throwable {
		AddEmployee_PF e=new AddEmployee_PF(driver); 
		e.EnterID().sendKeys(arg1);
	
	}

	@When("^Upload Photograph$")
	public void upload_Photograph() throws Throwable {
		AddEmployee_PF e=new AddEmployee_PF(driver); 
		e.ChooseFIleUpLoad();
	 
	}

	@When("^click on Create Login Details ,$")
	public void click_on_Create_Login_Details() throws Throwable {
		AddEmployee_PF e=new AddEmployee_PF(driver); 
		e.ClickCheckBox().click();
	 
	}

	@When("^Enter UserName \"([^\"]*)\"$")
	public void enter_UserName(String arg1) throws Throwable {
		AddEmployee_PF e=new AddEmployee_PF(driver); 
		e.enter_UserName().sendKeys(arg1);
	
	}

	@When("^Enter password\"([^\"]*)\"$")
	public void enter_password(String arg1) throws Throwable {
		AddEmployee_PF e=new AddEmployee_PF(driver); 
		e.enter_password().sendKeys(arg1);
	}

	@When("^Enter ConfirmPassword \"([^\"]*)\",$")
	public void enter_ConfirmPassword(String arg1) throws Throwable {
		AddEmployee_PF e=new AddEmployee_PF(driver); 
		e.ConfirmPassword().sendKeys(arg1);
	
	}

	@When("^Status should be Enable$")
	public void status_should_be_Enable() throws Throwable {
		AddEmployee_PF e=new AddEmployee_PF(driver); 
		e.SelectStatus();
	
	 
	}

@When("^clickon Save button$")
public void clickon_Save_button() throws Throwable {
	AddEmployee_PF e=new AddEmployee_PF(driver); 
	e.ClickSave().click();
   
}

	@Then("^Admin will get confirmation$")
	public void admin_will_get_confirmation() throws Throwable {
		System.out.println("You have successfully Add NewEmployee");
	
	}

	@Then("^Browser Will close$")
	public void browser_Will_close() throws Throwable {
		driver.close();
		
	  
	}

	@When("^Admin enter FirstName Null\"([^\"]*)\"$")
	public void admin_enter_FirstName_Null(String arg1) throws Throwable {
		AddEmployee_PF e=new AddEmployee_PF(driver); 
		e.EnterFirstName().sendKeys(arg1);
	   
	}

	@When("^Enter MiddleName Null\"([^\"]*)\"$")
	public void enter_MiddleName_Null(String arg1) throws Throwable {
		AddEmployee_PF e=new AddEmployee_PF(driver); 
		e.EnterMidName().sendKeys(arg1);
	 
	}

	@When("^Enter LastName Null\"([^\"]*)\"$")
	public void enter_LastName_Null(String arg1) throws Throwable {
		AddEmployee_PF e=new AddEmployee_PF(driver); 
		e.EnterLastName().sendKeys(arg1);
	  
	}

	@Then("^Admin will get an Error Dirst and LastName is required$")
	public void admin_will_get_an_Error_Dirst_and_LastName_is_required() throws Throwable {
		AddEmployee_PF e=new AddEmployee_PF(driver); 
		e.HardAssert();
		
	   
	}	


}//end class
