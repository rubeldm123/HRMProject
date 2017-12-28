package com.homePagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SearchDirectoryPF {
	WebDriver driver;
	public SearchDirectoryPF(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}//end constructor
	
	
	 /*System.setProperty("webdriver.chrome.driver",
			 * "C:\\Users\\rubeldm\\Documents\\workspace_driver\\chromedriver2.33.exe" );
			 * driver=new ChromeDriver();
			 * driver.get("http://opensource.demo.orangehrmlive.com/");
			 * driver.manage().window().maximize();
			 */
			//username
				@FindBy(how=How.XPATH, using ="//input[@name='txtUsername']")
				@CacheLookup
				WebElement user_name;
				public WebElement EnterUserName() {
					return user_name;
				}
				//password
				@FindBy(how=How.XPATH, using ="//input[@name='txtPassword']")
				@CacheLookup
				WebElement Password;
				public WebElement EnterPassword() {
					return Password;
				}
				
				//Login button
				@FindBy(how=How.XPATH, using ="//input[@name='Submit']")
				@CacheLookup
				WebElement login;
				public WebElement ClickLogin() {
					return login;
				}
	//click on Directory link
	@FindBy(how=How.LINK_TEXT, using ="Directory")
	@CacheLookup
	WebElement dire;
	public WebElement click_Directory() {
		return dire;
	}

	//typr valid employee name
	@FindBy(how=How.XPATH, using ="//input[@id='searchDirectory_emp_name_empName']")
	@CacheLookup
	WebElement E_name;
	public WebElement Enter_Name() {
		return E_name;
	}
	//selec jobtitel
	public void JobTitel() {
		Select v=new Select(driver.findElement(By.xpath("//*[@id=\"searchDirectory_job_title\"]")));
		v.selectByVisibleText("Sales Manager");
		}
	//select location
	public void SelectLocation() {
		Select v=new Select(driver.findElement(By.xpath("//*[@id=\"searchDirectory_location\"]")));
		v.selectByVisibleText("    New York Sales Office");
		}
	
	//click Search  button
	@FindBy(how=How.XPATH, using ="//input[@id='searchBtn']")
	@CacheLookup
	WebElement E_searc;
	public WebElement ClickSearch() {
		return E_searc;
	}
	@FindBy(how=How.XPATH, using ="//*[@id=\"content\"]/div[2]/div[2]")
	@CacheLookup
	WebElement Error;
	public WebElement ErrorMessage() {
		
		String ActualError=Error.getText();
		String ExpectedError="  Records Found";
		
		if (ActualError.equals(ExpectedError)) {
			System.out.println("your test is Fail As Expected");
			driver.close();
		}
		else {
			driver.quit();
		}
		
	Assert.assertEquals(ActualError, ExpectedError);
	
					return Error;
	}
	
	
	}	


