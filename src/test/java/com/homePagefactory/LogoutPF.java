package com.homePagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogoutPF {
	
WebDriver driver;//diclar driver
	
	//create constractor
	public LogoutPF(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}//end constructor
	
	//set property 
	/*
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rubeldm\\Documents\\workspace_driver\\chromedriver2.33.exe" );
	driver=new ChromeDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	
	*/
	
	@FindBy(how=How.XPATH, using ="//input[@name='txtUsername']")
	@CacheLookup
	WebElement user_name;
	public WebElement LoUserName() {
		return user_name;
	}
	//password
	@FindBy(how=How.XPATH, using ="//input[@name='txtPassword']")
	@CacheLookup
	WebElement Password;
	public WebElement LoPassword() {
		return Password;
	}
	
	//Login button
	@FindBy(how=How.XPATH, using ="//input[@name='Submit']")
	@CacheLookup
	WebElement login;
	public WebElement ClickLogin() {
		return login;
	}
	
	//Welcom Admin link
		@FindBy(how=How.XPATH, using ="//*[@id='welcome']")
		@CacheLookup
		WebElement l;
		public WebElement WelcomeAdminLink() {
			return l;
		}
		
		//LogOut link
				//@FindBy(how=How.XPATH, using ="//*[@id='welcome-menu']/ul/li[2]/a")
		@FindBy(how=How.LINK_TEXT, using ="Logout")
				@CacheLookup
				WebElement lo;
				public WebElement LogoutLink() {
					return lo;
				}	
	

}//end class
