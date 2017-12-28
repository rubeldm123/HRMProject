package stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.homePagefactory.LogoutPF;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepLogout {
	WebDriver driver;
	@Given("^Admin in Admin home page$")
	public void admin_in_Admin_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rubeldm\\Documents\\workspace_driver\\chromedriver2.33.exe" );
		driver=new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		LogoutPF ph= new LogoutPF(driver);
		ph.LoUserName().sendKeys("Admin");
		ph.LoPassword().sendKeys("admin");
		ph.ClickLogin().click();
		
	}

	@When("^Admin click on Welcom Admin link$")
	public void admin_click_on_Welcom_Admin_link() throws Throwable {
		LogoutPF ph= new LogoutPF(driver);
		//ph.WelcomeAdminLink().click();
	}

	@When("^Click on LOgout link$")
	public void click_on_LOgout_link() throws Throwable {
		LogoutPF ph= new LogoutPF(driver);
		//ph.LogoutLink().click();
	   
	}

	@Then("^Admin Logout Success full$")
	public void admin_Logout_Success_full() throws Throwable {
		System.out.println("You have successfully Logout ");
	 
	}
	@Then("^Browser close$")
	public void browser_close() throws Throwable {
	 driver.close();
	}

}//Ed class
