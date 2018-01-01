package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.homePagefactory.AddVacancyFactor;
import com.homePagefactory.AdminAdd_PF;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddVacancyStep {
	WebDriver driver;
	@Given("^Admin navigate to Admin Home Page$")
	public void admin_navigate_to_Admin_Home_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rubeldm\\Documents\\workspace_driver\\chromedriver2.33.exe" );
		driver=new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	 
					 
					 AddVacancyFactor a=new AddVacancyFactor(driver);
					 a.EnterUserName().sendKeys("Admin");
					 a.EnterPassword().sendKeys("admin");
					 a.ClickLogin().click();	
	   
	}

	@When("^Admin click on Recruitment link,$")
	public void admin_click_on_Recruitment_link() throws Throwable {
		 AddVacancyFactor a=new AddVacancyFactor(driver);
		 a.click_Recruitment().click();	
	  
	}

	@When("^click on Vacancies link$")
	public void click_on_Vacancies_link() throws Throwable {
		AddVacancyFactor a=new AddVacancyFactor(driver);
		 a.click_vacancies().click();
	  	
	    
	}

	@When("^click on Add button$")
	public void click_on_Add_button() throws Throwable {
		 AddVacancyFactor a=new AddVacancyFactor(driver);
		 a.clickOnAddbottn().click();	
	 
	}

	@When("^Select Job Titel as IT Manager,$")
	public void select_Job_Titel_as_IT_Manager() throws Throwable {
		 AddVacancyFactor a=new AddVacancyFactor(driver);
		 a.Select_JobTitel();
	  
	}

	@When("^enter VacancyName \"([^\"]*)\"$")
	public void enter_VacancyName(String arg1) throws Throwable {
		 AddVacancyFactor a=new AddVacancyFactor(driver);
		 a.Write_VacancyName().sendKeys(arg1);
	
	}

	@When("^enter HiringManager \"([^\"]*)\"$")
	public void enter_HiringManager(String arg1) throws Throwable {
		 AddVacancyFactor a=new AddVacancyFactor(driver);
		 a.Write_HiarinManagerName().sendKeys(arg1);
	
	 
	}

	@When("^enter NumberOfPosition \"([^\"]*)\"$")
	public void enter_NumberOfPosition(String arg1) throws Throwable {
		 AddVacancyFactor a=new AddVacancyFactor(driver);
		 a.Number_Of_Position().sendKeys(arg1);
	 
	  
	}

	@When("^Write Description\"([^\"]*)\"$")
	public void write_Description(String arg1) throws Throwable {
		 AddVacancyFactor a=new AddVacancyFactor(driver);
		 a.Write_Description().sendKeys(arg1);
		
	
	}

	@When("^click on Active Box$")
	public void click_on_Active_Box() throws Throwable {
		 AddVacancyFactor a=new AddVacancyFactor(driver);
		 a.clickBox();
	  
	}

	@When("^click on Save button$")
	public void click_on_Save_button() throws Throwable {
		
		 AddVacancyFactor a=new AddVacancyFactor(driver);
		 a.ClickSave().click();
	   	
	 
	}

	@Then("^Admin will get confirmation message$")
	public void admin_will_get_confirmation_message() throws Throwable {
		System.out.println("You have successfully add vacancy");
	}

	@Then("^Browser will close Automaticaly$")
	public void browser_will_close_Automaticaly() throws Throwable {
		driver.close();
	    
	}

	@When("^And enter VacancyName \"([^\"]*)\"$")
	public void and_enter_VacancyName(String arg1) throws Throwable {
		 AddVacancyFactor a=new AddVacancyFactor(driver);
		 a.Write_VacancyName().sendKeys(arg1);
	  
	}

	@When("^HiringManager Null\"([^\"]*)\"$")
	public void hiringmanager_Null(String arg1) throws Throwable {
		 AddVacancyFactor a=new AddVacancyFactor(driver);
		 a.Write_HiarinManagerName().sendKeys(arg1);
	}

	@When("^cick on Save Button$")
	public void cick_on_Save_Button() throws Throwable {
		 AddVacancyFactor a=new AddVacancyFactor(driver);
		 a.ClickSave().click();
		 System.out.println("You have Successfully Add Vacancy");
	
		
	}

	@Then("^VacancyName fild cannot be empty$")
	public void vacancyname_fild_cannot_be_empty() throws Throwable {
		
		AddVacancyFactor a=new AddVacancyFactor(driver);
		 a.ErrorList();
	
	
		 }
	

	@Then("^Browser will close Automaticly$")
	public void browser_will_close_Automaticly() throws Throwable {
		driver.close();
	    
	}

}//end class
