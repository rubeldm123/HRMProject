package com.homePagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginHomeFactory {
	
	WebDriver driver;   //diclar driver
	
	//create constractor
	
	public LoginHomeFactory(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	
	}//end constructor
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
	
	@FindBy(how=How.XPATH, using ="//*[@id='spanMessage']")
	@CacheLookup
	WebElement Error;
	public WebElement ErrorMessage() {
		
		String ActualError=Error.getText();
		String ExpectedError= "Invalid credentials";
/*		if (ActualError.equals(ExpectedError)) {
			System.out.println("your test is Fail due to Invalid Credential");
			driver.close();
		}
		else {
			System.out.println("your test is Fail due to Invalid Credential");
			driver.quit();
		}*/
		
		
	Assert.assertEquals(ActualError, ExpectedError);
		
		return Error;
	}
	
		

}//end class
