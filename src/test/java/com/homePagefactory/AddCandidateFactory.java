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

public class AddCandidateFactory {
WebDriver driver;//diclar driver
	
	//create constractor
	public AddCandidateFactory(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}//end constructor
	
	//admin credential
	//systemProperty
	/*
	 * System.setProperty("webdriver.chrome.driver",
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
	
//Revruitment
	@FindBy(how=How.LINK_TEXT, using ="Recruitment")
	@CacheLookup
	WebElement recruitment;
	public WebElement EnterRecruitment() {
		return recruitment;
	}
	//Candidates
	@FindBy(how=How.LINK_TEXT, using ="Candidates")
	@CacheLookup
	WebElement candidate;
	public WebElement clickCandidate() {
		return candidate;
	}
	//Add Button
	@FindBy(how=How.XPATH, using ="//input[@name='btnAdd']")
	@CacheLookup
	WebElement ADDBtn;
	public WebElement clickOnAddbottn() {
		return ADDBtn;
	}	
	
	//Admin fill out form
	//FirstName
	@FindBy(how=How.XPATH, using ="//input[@name='addCandidate[firstName]']")
	@CacheLookup
	WebElement firstName;
	public WebElement EnterFirstName() {
		return firstName;
	}	
	
	//MiddleName
	@FindBy(how=How.XPATH, using ="//input[@name='addCandidate[middleName]']")
	@CacheLookup
	WebElement mName;
	public WebElement EnterMidName() {
		return mName;
	}	
	//LastName
	@FindBy(how=How.XPATH, using ="//input[@name='addCandidate[lastName]']")
	@CacheLookup
	WebElement LName;
	public WebElement EnterLastName() {
		return LName;
		
	}	
	//Email
	@FindBy(how=How.XPATH, using ="//input[@name='addCandidate[email]']")
	@CacheLookup
	WebElement Email;
	public WebElement EnterEmail1() {
		return Email;
	}	
	
	//ContactNo
	@FindBy(how=How.XPATH, using ="//input[@name='addCandidate[contactNo]']")
	@CacheLookup
	WebElement ContactN;
	public WebElement EnterContactNu() {
		return ContactN;
	}	
	
	//Add Resume
		@FindBy(how=How.XPATH, using ="//input[@name='addCandidate[resume]']")
		@CacheLookup
		WebElement r;
		public WebElement ChooseFIleUpLoad() {
			r.sendKeys("C:\\Users\\rubeldm\\Desktop\\OrangeHRMSteps\\ResumeByMohammedRubel.txt");
			return r;
		}	
	

	
	//Write KeyWords
	@FindBy(how=How.XPATH, using ="//input[@name='addCandidate[keyWords]']")
	@CacheLookup
	WebElement KeyWord;
	public WebElement WriteKeyword() {
		return KeyWord;
	}	
	
	//Write Comment
	@FindBy(how=How.XPATH, using ="//textarea[@name='addCandidate[comment]']")
	@CacheLookup
	WebElement Wrmsg;
	public WebElement WritComment() {
		return Wrmsg;
	}	
	//Applied date
	@FindBy(how=How.XPATH, using ="//input[@name='addCandidate[appliedDate]']")
	@CacheLookup
	WebElement ApplicationDate;
	public WebElement ChooseDate() {
		ApplicationDate.clear();
		ApplicationDate.findElement(By.xpath("//div[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[4]/a")).click();
		return ApplicationDate;
	}
	//Save Button
	@FindBy(how=How.XPATH, using ="//input[@id='btnSave']")
	@CacheLookup
	WebElement Save;
	public WebElement ClickSave() {
		return Save;
	}
	
	
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"frmAddCandidate\"]/fieldset/ol[1]/li[1]/ol/li[1]/span")
	@CacheLookup
	WebElement Error;
	public WebElement ErrorMessage() {
		
		String ActualError=Error.getText();
		String ExpectedError= "Required";
		
		if (ActualError.equals(ExpectedError)) {
			System.out.println("pass test");
		}
		else {
			System.out.println("Your Test Fail");
			driver.quit();
		}
			Assert.assertEquals(ActualError, ExpectedError);
		return Error;
		}
		

	
	

}//end class
