package stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.homePagefactory.SearchDirectoryPF;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepSearchDirectory {
	
	WebDriver driver;
	@Given("^Admin in AdminHomePage$")
	public void admin_in_AdminHomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rubeldm\\Documents\\workspace_driver\\chromedriver2.33.exe" );
				 driver=new ChromeDriver();
				 driver.get("http://opensource.demo.orangehrmlive.com/");
				 driver.manage().window().maximize();
				 
				 SearchDirectoryPF a= new SearchDirectoryPF(driver);
				 a.EnterUserName().sendKeys("Admin");
				 a.EnterPassword().sendKeys("admin");
				 a.ClickLogin().click();
	}

	@When("^Click on Directory$")
	public void click_on_Directory() throws Throwable {
		 SearchDirectoryPF a= new SearchDirectoryPF(driver);
		 a.click_Directory().click();
	
	}

	@When("^Write Existing EmployeeName\"([^\"]*)\"$")
	public void write_Existing_EmployeeName(String arg1) throws Throwable {
		 SearchDirectoryPF a= new SearchDirectoryPF(driver);
		 a.Enter_Name().sendKeys(arg1);

	}

	@When("^Select Job Titel$")
	public void select_Job_Titel() throws Throwable {
		 SearchDirectoryPF a= new SearchDirectoryPF(driver);
		 a.JobTitel();

	}

	@When("^Select Location$")
	public void select_Location() throws Throwable {
		 SearchDirectoryPF a= new SearchDirectoryPF(driver);
		 a.SelectLocation();
	}

	@When("^Click on Searc Button$")
	public void click_on_Searc_Button() throws Throwable {
		 SearchDirectoryPF a= new SearchDirectoryPF(driver);
		 a.ClickSearch().click();
	
	}

	@Then("^I should be able to see the user name with his/her details$")
	public void i_should_be_able_to_see_the_user_name_with_his_her_details() throws Throwable {
		System.out.println("You have Successfully Searc vaild Employee");
	
	}

	@Then("^Close Browser$")
	public void close_Browser() throws Throwable {
		driver.close();
	  
	}



	@When("^WriteInvalidEmployeeName\"([^\"]*)\"$")
	public void invalidemployeename(String arg1) throws Throwable {
		 SearchDirectoryPF a= new SearchDirectoryPF(driver);
		 a.Enter_Name().sendKeys(arg1);
	
	}

	@Then("^No Record found Message Will display$")
	public void no_Record_found_Message_Will_display() throws Throwable {
		 SearchDirectoryPF a= new SearchDirectoryPF(driver);
		a.ErrorMessage();
		 driver.close();
	 
	}
	
	
	

}//end class
