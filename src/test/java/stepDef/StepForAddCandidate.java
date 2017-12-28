package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.homePagefactory.AddCandidateFactory;
import com.homePagefactory.LoginHomeFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepForAddCandidate {
	WebDriver driver;

@Given("^Admin navigate to AdminHomePage$")
public void admin_navigate_to_AdminHomePage() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rubeldm\\Documents\\workspace_driver\\chromedriver2.33.exe" );
	driver=new ChromeDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	
	AddCandidateFactory a=new AddCandidateFactory(driver);
	a.EnterUserName().sendKeys("Admin");
	a.EnterPassword().sendKeys("admin");
	a.ClickLogin().click();
	
	
}

@When("^Admin click on Recruitment link$")
public void admin_click_on_Recruitment_link() throws Throwable {
	AddCandidateFactory c= new AddCandidateFactory (driver);
	c.EnterRecruitment().click();
 
}

@When("^click on Candidates$")
public void click_on_Candidates() throws Throwable {
	AddCandidateFactory c= new AddCandidateFactory (driver);
	c.clickCandidate().click();

}

@When("^click on Add Button$")
public void click_on_Add_Button() throws Throwable {
	AddCandidateFactory c= new AddCandidateFactory (driver);
	c.clickOnAddbottn().click();
   
}

@When("^enter FirstName\"([^\"]*)\"$")
public void enter_FirstName(String arg1) throws Throwable {
	AddCandidateFactory c= new AddCandidateFactory (driver);
	c.EnterFirstName().sendKeys(arg1);
	
	

  
}

@When("^enter MiddleName\"([^\"]*)\"$")
public void enter_MiddleName(String arg1) throws Throwable {
	AddCandidateFactory c= new AddCandidateFactory (driver);
	c.EnterMidName().sendKeys(arg1);
}

@When("^enter LastName\"([^\"]*)\"$")
public void enter_LastName(String arg1) throws Throwable {
	AddCandidateFactory c= new AddCandidateFactory (driver);
	c.EnterLastName().sendKeys(arg1);
 }

@When("^enter Email\"([^\"]*)\"$")
public void enter_Email(String arg1) throws Throwable {
	AddCandidateFactory c= new AddCandidateFactory (driver);
	c.EnterEmail1().sendKeys(arg1);

}

@When("^enter contactNO\"([^\"]*)\"$")
public void enter_contactNO(String arg1) throws Throwable {
	AddCandidateFactory c= new AddCandidateFactory (driver);
	c.EnterContactNu().sendKeys(arg1);
	c.ChooseFIleUpLoad();
	;
   
}

@When("^AttachFil,$")
public void attachfil() throws Throwable {
	AddCandidateFactory c= new AddCandidateFactory (driver);
	c.ChooseFIleUpLoad();
    
}

@When("^Write Keywords \"([^\"]*)\"$")
public void write_Keywords(String arg1) throws Throwable {
	AddCandidateFactory c= new AddCandidateFactory (driver);
	c.WriteKeyword().sendKeys(arg1);
   
}

@When("^WriteComment\"([^\"]*)\"$")
public void writecomment(String arg1) throws Throwable {
	AddCandidateFactory c= new AddCandidateFactory (driver);
	c.WritComment().sendKeys(arg1);
  
  
 
}

@When("^choose date of application$")
public void choose_date_of_application() throws Throwable {
	AddCandidateFactory c= new AddCandidateFactory (driver);
	c.ChooseDate();
}

@Then("^Browser Must closssAfter All test Completed$")
public void browser_Must_closssAfter_All_test_Completed() throws Throwable {
	driver.close();
 
}

@When("^FirstName Null\"([^\"]*)\"$")
public void firstname_Null(String arg1) throws Throwable {
	AddCandidateFactory c= new AddCandidateFactory (driver);
	c.EnterFirstName().sendKeys(arg1);
	
  
}
@When("^clickOn Save Button$")
public void clickon_Save_Button() throws Throwable {
	AddCandidateFactory c= new AddCandidateFactory (driver);
	c.ClickSave().click();
 
}

@Then("^confirmationMmessage will display$")
public void confirmationmmessage_will_display() throws Throwable {
  System.out.println("You have successfully add candidate");
}

@Then("^confirmationMessage will display$")
public void confirmationmessage_will_display() throws Throwable {
	AddCandidateFactory c= new AddCandidateFactory (driver);
	c.ErrorMessage();

   
}


	

}//end class
