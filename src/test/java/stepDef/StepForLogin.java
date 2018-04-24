package stepDef;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
	System.setProperty("webdriver.chrome.driver", "/Users/mdrubel/Desktop/chromedriver" );
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://opensource.demo.orangehrmlive.com/");
	}


@When("^Admin Enter valid userName and password$")
public void admin_Enter_valid_userName_and_password() throws Throwable {
	
	driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
	driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin");
	
}


	@When("^click on LOGIN Button$")
	public void click_on_LOGIN_Button() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
	}

	@Then("^Admin will Land in Admin HomePage$")
	public void admin_will_Land_in_Admin_HomePage() throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(), "http://opensource.demo.orangehrmlive.com/index.php/dashboard");
		String actualURL= driver.getCurrentUrl();
		
	}

	@Then("^Close The Browser$")
	public void close_The_Browser() throws Throwable {
	driver.close();
	
	}

	
	@When("^Admin Enter invalid userName and Invalidpassword$")
	public void admin_Enter_invalid_userName_and_Invalidpassword() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admaswqin");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admsq	sqin");	
	  
	}

	@When("^click Login$")
	public void click_Login() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	  
	}


	@Then("^Error message Dispaly$")
	public void error_message_Dispaly() throws Throwable {
		
		//ScreenShot
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("/Users/mdrubel/git/HRMProject/ScreenShot/error.png"));
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		Assert.assertEquals(driver.getCurrentUrl(), "http://opensource.demo.orangehrmlive.com/index.php/auth/validateCredentials");
		String actualURL= driver.getCurrentUrl();
		System.out.println("Actual URL for This page is :" +actualURL);
	}
	

	 
	}//end class


