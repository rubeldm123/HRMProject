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

public class AddEmployee_PF {
	
WebDriver driver;//diclar driver
	
	//create constractor
	public  AddEmployee_PF(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}//end constructor
	//username
		@FindBy(how=How.XPATH, using ="//input[@name='txtUsername']")
		@CacheLookup
		WebElement user_name;
		public WebElement enterUserName() {
			return user_name;
		}
		//password
		@FindBy(how=How.XPATH, using ="//input[@name='txtPassword']")
		@CacheLookup
		WebElement Password;
		public WebElement enterPassword() {
			return Password;
		}
		
		//Login button
		@FindBy(how=How.XPATH, using ="//input[@name='Submit']")
		@CacheLookup
		WebElement login;
		public WebElement ClickLogin() {
			return login;
		}
	//click PIM LINK
	@FindBy(how=How.LINK_TEXT, using ="PIM")
	@CacheLookup
	WebElement pim;
	public WebElement click_PIM() {
		return pim;
	}
	
	//click on Add Button
	@FindBy(how=How.XPATH, using ="//input[@id='btnAdd']")
	@CacheLookup
	WebElement Add_Button;
	public WebElement click_AddButton() {
		return Add_Button;
	
	}
	
	//FirstName
	
	@FindBy(how=How.XPATH, using ="//input[@name='firstName']")
	@CacheLookup
	WebElement firstName;
	public WebElement EnterFirstName() {
		return firstName;
	}	


	
	
	//MiddleName
	@FindBy(how=How.XPATH, using ="//input[@name='middleName']")
	@CacheLookup
	WebElement mName;
	public WebElement EnterMidName() {
		return mName;
	}
	//LastName
	@FindBy(how=How.XPATH, using ="//input[@name='lastName']")
	@CacheLookup
	WebElement LName;
	public WebElement EnterLastName() {
		return LName;
		}	
	
	//Add Resume
			@FindBy(how=How.XPATH, using ="//input[@name='photofile']")
			@CacheLookup
			WebElement r;
			public WebElement ChooseFIleUpLoad() {
				r.sendKeys("C:\\Users\\rubeldm\\Desktop\\OrangeHRMSteps\\photoFromRubel.txt");
				return r;
			}	
		
	
	//EmployeeID
	
	@FindBy(how=How.XPATH, using ="//input[@name='employeeId']")
	@CacheLookup
	WebElement ID;
	public WebElement EnterID() {
		return ID;
		}		
	
	//check box
	@FindBy(how=How.XPATH, using ="//input[@id='chkLogin']")
	@CacheLookup
	WebElement cb;
	public WebElement ClickCheckBox() {
		return cb;
		}		
	
	
	//userName
	
		@FindBy(how=How.XPATH, using ="//input[@id='user_name']")
		@CacheLookup
		WebElement un;
		public WebElement enter_UserName() {
			return un;
			}		
		
	
//password
		@FindBy(how=How.XPATH, using ="//input[@id='user_password']")
		@CacheLookup
		WebElement pw;
		public WebElement enter_password() {
			return pw;
			}		
		
		
//ConfirmPassword
		@FindBy(how=How.XPATH, using ="//input[@id='re_password']")
		@CacheLookup
		WebElement cpw;
		public WebElement ConfirmPassword() {
			return cpw;
			}
		
		
		
	//Status-Enabled
		
		public void SelectStatus() {
			Select s=new Select(driver.findElement(By.xpath("//select[@id='status']")));
			s.selectByVisibleText("Enabled");
		
		}
		
		//click save
		@FindBy(how=How.XPATH, using ="//input[@id='btnSave']")
		@CacheLookup
		WebElement Save;
		public WebElement ClickSave() {
			return Save;
		}
		
		//Error message
		@FindBy(how=How.XPATH, using ="//*[@id=\"frmAddEmp\"]/fieldset/ol/li[1]/ol/li[1]/span")
		@CacheLookup
		WebElement cl;
		public WebElement HardAssert() {
			
			String ActualError=cl.getText();
			String ExpectedError= "Required";
			if (ActualError.equals(ExpectedError)) {
				System.out.println("your test is Fail As Expected");
				driver.close();
			}
			else {
				driver.quit();
			}
			
		Assert.assertEquals(ActualError, ExpectedError);
			
			return cl;
		}
	

}//end class
