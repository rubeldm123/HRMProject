package stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.homePagefactory.AdminAdd_PF;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepAddNewAdmin {
	WebDriver driver;

	 AdminAdd_PF pagefactory;
	@Given("^Admin Login to Admin homepage$")
	public void admin_Login_to_Admin_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rubeldm\\Documents\\workspace_driver\\chromedriver2.33.exe" );
		driver=new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		AdminAdd_PF l= new AdminAdd_PF(driver);
		l.ADEnterUserName().sendKeys("Admin");
		l.AEnterPassword().sendKeys("admin");
		l.ClickLogin().click();  
	}
	@When("^Admin click on Admin link,$")
	public void admin_click_on_Admin_link() throws Throwable {
		AdminAdd_PF l= new AdminAdd_PF(driver);
		l.click_Admin().click();
		
		
	   
	}

	@When("^click on AddButton$")
	public void click_on_AddButton() throws Throwable {
		AdminAdd_PF l= new AdminAdd_PF(driver);
		l.click_AddButton().click();
	}

	@When("^select UserRole Admin,$")
	public void select_UserRole_Admin() throws Throwable {
		AdminAdd_PF l= new AdminAdd_PF(driver);
		l.SelectUserRole();
	    
	}

	@When("^Write Valid EmployeeName  \"([^\"]*)\"$")
	public void write_Valid_EmployeeName(String EN) throws Throwable {
		AdminAdd_PF l= new AdminAdd_PF(driver);
		l.Enter_EmployName().sendKeys(EN);
	    
	}

	@When("^Write username  \"([^\"]*)\"$")
	public void write_username(String arg1) throws Throwable {
		AdminAdd_PF l= new AdminAdd_PF(driver);
		l.EnterUserName().sendKeys(arg1);
	}

	@When("^Select Status as Enabled,$")
	public void select_Status_as_Enabled() throws Throwable {
		AdminAdd_PF l= new AdminAdd_PF(driver);
		l.SelectStatus();
	 
	}

	@When("^Enter Password\"([^\"]*)\"$")
	public void enter_Password(String arg1) throws Throwable {
		AdminAdd_PF l= new AdminAdd_PF(driver);
		l.EnterPassword().sendKeys(arg1);
	   
	}

	@When("^ConfirmPassword \"([^\"]*)\"$")
	public void confirmpassword(String arg1) throws Throwable {
		AdminAdd_PF l= new AdminAdd_PF(driver);
		l.Confirm_Password().sendKeys(arg1);
	  
	}

	@When("^click Save Button$")
	public void click_Save_Button() throws Throwable {
		AdminAdd_PF l= new AdminAdd_PF(driver);
		l.clickSave_Button().click();
	
	}

	@Then("^ConfirmationMessage will display$")
	public void confirmationmessage_will_display() throws Throwable {
		System.out.println("You have successfully Add New Admin");
	    
	}

	@Then("^close Browser$")
	public void close_Browser() throws Throwable {
		driver.close();
	   
	}

	@When("^Null  EmployeeName Text box \"([^\"]*)\"$")
	public void null_EmployeeName_Text_box(String arg1) throws Throwable {
		AdminAdd_PF l= new AdminAdd_PF(driver);
		l.Enter_EmployName().sendKeys(arg1);
	}

	@Then("^EmployeeName Edite box Cannot be emty message will appear$")
	public void employeename_Edite_box_Cannot_be_emty_message_will_appear() throws Throwable {
		AdminAdd_PF l= new AdminAdd_PF(driver);
		l.HardVarification();
		
		
		
	
		}
		
		
	
	




}//End class
