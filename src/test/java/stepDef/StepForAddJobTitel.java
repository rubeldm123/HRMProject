package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.homePagefactory.AddJobTitelPF;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepForAddJobTitel {
	WebDriver driver;
	@Given("^Admin Login it Admin HomePage$")
	public void admin_Login_it_Admin_HomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rubeldm\\Documents\\workspace_driver\\chromedriver2.33.exe" );
				  driver=new ChromeDriver();
				  driver.get("http://opensource.demo.orangehrmlive.com/");
				  driver.manage().window().maximize();
					AddJobTitelPF a= new AddJobTitelPF(driver);
					a.EnterUserName().sendKeys("Admin");
					a.EnterPassword().sendKeys("admin");
					a.ClickLogin().click();
	 
	}

	@When("^Admin MouseHober Admin, job, select Jobtitles and click$")
	public void admin_MouseHober_Admin_job_select_Jobtitles_and_click() throws Throwable {
		AddJobTitelPF a= new AddJobTitelPF(driver);
		//a.MouseHoverToAdmin();
		 driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")).click();
			a.MouseHoverToAdmin();
	 
	}
	@When("^click onAdd Button$")
	public void click_onAdd_Button() throws Throwable {
		AddJobTitelPF a= new AddJobTitelPF(driver);
		a.clickADDbutton().click();
	}

	@When("^Write jobTitel \"([^\"]*)\"$")
	public void write_jobTitel(String arg1) throws Throwable {
		AddJobTitelPF a= new AddJobTitelPF(driver);
		a.WriteJobTitel().sendKeys(arg1);

	}

	@When("^Write JobDescription \"([^\"]*)\"$")
	public void write_JobDescription(String arg1) throws Throwable {
		AddJobTitelPF a= new AddJobTitelPF(driver);
		a.WriteDiscription().sendKeys(arg1);
	
	}

	@When("^Choose FIle$")
	public void choose_FIle() throws Throwable {
		AddJobTitelPF a= new AddJobTitelPF(driver);
		a.ChooseFIleUpLoad();

	}

	@When("^Write Note \"([^\"]*)\"$")
	public void write_Note(String arg1) throws Throwable {
		AddJobTitelPF a= new AddJobTitelPF(driver);
		a.WriteNote().sendKeys(arg1);
	 
	}

	@When("^click Save$")
	public void click_Save() throws Throwable {
		AddJobTitelPF a= new AddJobTitelPF(driver);
		a.ClickSave().click();
	  
	}

	@Then("^Confirmation Message will display$")
	public void confirmation_Message_will_display() throws Throwable {
	    System.out.println("You have successfully Add Job Titl");
	}

	@Then("^Browser will Close$")
	public void browser_will_Close() throws Throwable {
		driver.close();
	  
	}

	@When("^Write jobTitel Nul \"([^\"]*)\"$")
	public void write_jobTitel_Nul(String arg1) throws Throwable {
		AddJobTitelPF a= new AddJobTitelPF(driver);
		a.WriteJobTitel().sendKeys(arg1);
	
	}

	@Then("^Error Message will display$")
	public void error_Message_will_display() throws Throwable {
		AddJobTitelPF a= new AddJobTitelPF(driver);
		a.Errorlist();
	  
	}

}//End class
