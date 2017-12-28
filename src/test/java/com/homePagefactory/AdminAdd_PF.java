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
import org.testng.asserts.SoftAssert;

public class AdminAdd_PF {
WebDriver driver;//diclar driver

	
	//create constractor
	public  AdminAdd_PF(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}//end constructor
	
	//username
		@FindBy(how=How.XPATH, using ="//input[@name='txtUsername']")
		@CacheLookup
		WebElement ADuser_name;
		public WebElement ADEnterUserName() {
			return ADuser_name;
		}
		//password
		@FindBy(how=How.XPATH, using ="//input[@name='txtPassword']")
		@CacheLookup
		WebElement Password;
		public WebElement AEnterPassword() {
			return Password;
		}
		
		//Login button
		@FindBy(how=How.XPATH, using ="//input[@name='Submit']")
		@CacheLookup
		WebElement login;
		public WebElement ClickLogin() {
			return login;
		}

	@FindBy(how=How.LINK_TEXT, using ="Admin")
	@CacheLookup
	WebElement admin;
	public WebElement click_Admin() {
		return admin;
	}
	
	@FindBy(how=How.XPATH, using ="//input[@id='btnAdd']")
	@CacheLookup
	WebElement Add_Button;
	public WebElement click_AddButton() {
		return Add_Button;
	
	}
	
	@FindBy(how=How.XPATH, using ="//input[@id='systemUser_employeeName_empName']")
	@CacheLookup
	WebElement employName;
	public WebElement Enter_EmployName() {
		return employName;
	}
	
	
	
	
	public void SelectUserRole() {
	Select v=new Select(driver.findElement(By.xpath("//select[@id='systemUser_userType']")));
	v.selectByVisibleText("Admin");
	}
	
	
	@FindBy(how=How.XPATH, using ="//input[@class='formInputText']")
	@CacheLookup
	WebElement user_name;
	public WebElement EnterUserName() {
		return user_name;
	}
	
	public void SelectStatus() {
		Select v=new Select(driver.findElement(By.xpath("//select[@id='systemUser_status']")));
		v.selectByVisibleText("Enabled");
		}
	
	
		
	@FindBy(how=How.XPATH, using ="//input[@name='systemUser[password]']")
	@CacheLookup
	WebElement user_passwrod;
	public WebElement EnterPassword() {
		return user_passwrod;
	}
	
	
	@FindBy(how=How.XPATH, using ="//input[@name='systemUser[confirmPassword]']")
	@CacheLookup
	WebElement confirm_passwrod;
	public WebElement Confirm_Password() {
		return confirm_passwrod;
	}
	
	@FindBy(how=How.XPATH, using ="//input[@id='btnSave']")
	@CacheLookup
	WebElement Save_Button;
	public WebElement clickSave_Button() {
		return Save_Button;
	
	}
	@FindBy(how=How.XPATH, using ="//*[@id=\"frmSystemUser\"]/fieldset/ol/li[2]/span")
	@CacheLookup
	WebElement Error;
	public WebElement HardVarification() {
		
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

	
	
	//i am not using this in this project
	public void Softvarification() {
		WebElement Error =driver.findElement(By.xpath("//*[@id=\"frmSystemUser\"]/fieldset/ol/li[2]/span")); 
	
	SoftAssert as= new SoftAssert();
	String ActualError=Error.getText();
	String ExpectedError= "Require";
	as.assertEquals(ActualError, ExpectedError);
	as.assertAll();
	driver.quit();

	
	}
	
	
	
	
	

}//End class
