package stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.homePagefactory.AssignLeavePF;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepAssignLeave {
	WebDriver driver;
	@Given("^Admin in Admin HomePage$")
	public void admin_in_Admin_HomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rubeldm\\Documents\\workspace_driver\\chromedriver2.33.exe" );
				 driver=new ChromeDriver();
				  driver.get("http://opensource.demo.orangehrmlive.com/");
				  driver.manage().window().maximize();
					AssignLeavePF a= new AssignLeavePF(driver);
					a.EnterUserName().sendKeys("Admin");
					a.EnterPassword().sendKeys("admin");
					a.ClickLogin().click();
		
	
	}
	@When("^click on Leave Link$")
	public void click_on_Leave_Link() throws Throwable {
		AssignLeavePF a= new AssignLeavePF(driver);
		a.clickOnLeaveLink().click();
	    
	}
	@When("^click on Assign Link$")
	public void click_on_Assign_Link() throws Throwable {
		AssignLeavePF a= new AssignLeavePF(driver);
		a.clickOnAssignLeave().click();
	}

	@When("^Admin Write EmployeeName \"([^\"]*)\"$")
	public void admin_Write_EmployeeName(String arg1) throws Throwable {
		AssignLeavePF a= new AssignLeavePF(driver);
		a.Write_EmployeName().sendKeys(arg1);
	 
	}

	@When("^select Leave Type$")
	public void select_Leave_Type() throws Throwable {
		AssignLeavePF a= new AssignLeavePF(driver);
		a.Select_LeaveType();
	   
	}

	@When("^Select From Date from calender$")
	public void select_From_Date_from_calender() throws Throwable {
		AssignLeavePF a= new AssignLeavePF(driver);
		a.FromDate();
	
	}

	@When("^Select To date from calender$")
	public void select_To_date_from_calender() throws Throwable {
		AssignLeavePF a= new AssignLeavePF(driver);
		a.ToDate();
	  
	}

	@When("^click on Assign button$")
	public void click_on_Assign_button() throws Throwable {
		AssignLeavePF a= new AssignLeavePF(driver);
		a.ClickOnAssignButton().click();
	
	}

	@Then("^confirmation message will display$")
	public void confirmation_message_will_display() throws Throwable {
		
		AssignLeavePF a= new AssignLeavePF(driver);
		a.ClickOnOK().click();
		 System.out.println("You have Successfully AssignLeave");
	}	
		@Then("^close driver$")
		public void close_driver() throws Throwable {
		  driver.close();
		}
	

	@When("^Admin Write EmployeeName null \"([^\"]*)\"$")
	public void admin_Write_EmployeeName_null(String arg1) throws Throwable {
		AssignLeavePF a= new AssignLeavePF(driver);
		a.Write_EmployeName().sendKeys(arg1);
	  
	}
	


	@Then("^Error  message will display and fail test$")
	public void error_message_will_display_and_fail_test() throws Throwable {
		AssignLeavePF a= new AssignLeavePF(driver);
		a.Errorlist();
	 
	}

}//end class
