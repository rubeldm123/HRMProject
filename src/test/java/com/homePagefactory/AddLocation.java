package com.homePagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddLocation {
	
WebDriver driver;//diclar driver
	
	//create constractor
	public AddLocation(WebDriver driver) {
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
	
/*	//click on Admin link
	@FindBy(how=How.LINK_TEXT, using ="Admin")
	@CacheLookup
	WebElement admin;
	public WebElement click_Admin() {
		return admin;
	}*/
	
	
	//Mouse hover from Admin-->Organization-->location-->click 
	public void MouseHoverToAdmin () {
		WebElement Admin= driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		WebElement Organization= driver.findElement(By.xpath("//a[@id='menu_admin_Organization']"));
		WebElement location= driver.findElement(By.xpath("//a[@id='menu_admin_viewLocations']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(Admin).perform();
		act.moveToElement(Organization).perform();
		act.moveToElement(location).perform();
		act.click().build().perform();
		
		
	}

	//click on Add button
	@FindBy(how=How.XPATH, using ="//input[@id='btnAdd']")
	@CacheLookup
	WebElement ADDBtn;
	public WebElement clickADDbutton() {
		return ADDBtn;
	}	
	
	//Write location name
		@FindBy(how=How.XPATH, using ="//input[@id='location_name']")
		@CacheLookup
		WebElement LN;
		public WebElement Name_Location() {
			return LN;
		}	
		
		//Select country
		
		public void Select_Country() {
			Select c=new Select(driver.findElement(By.xpath("//select[@id='location_country']")));
			c.selectByVisibleText("United States");
		}
		
		//Write State/Province
		
		
		
		
		public void Select_State() {
			Select S=new Select(driver.findElement(By.xpath("//select[@id='location_state']")));
			S.selectByVisibleText("New York");
		}
		/*@FindBy(how=How.XPATH, using="/input[@name='location[province]']")
		@CacheLookup
		WebElement ST;
		public WebElement Write_StateName(){
			return ST;
		}*/
		
		//Write City

		@FindBy(how=How.XPATH, using="//input[@id='location_city']")
		@CacheLookup
		WebElement CT;
		public WebElement City_Name(){
			return CT;
		}
		
		
		
		//Write Address
		
		@FindBy(how=How.XPATH, using="//textarea[@class='formInput']")
		@CacheLookup
		WebElement AD;
		public WebElement Write_Address(){
			return AD;
		}
		//Write Zip/PostelCode
		
		@FindBy(how=How.XPATH, using="//input[@name='location[zipCode]']")
		@CacheLookup
		WebElement ZC;
		public WebElement Write_Zipcode(){
			return ZC;
		}
		
		
		//Write PhoneNumber
		
		@FindBy(how=How.XPATH, using="//input[@name='location[phone]']")
		@CacheLookup
		WebElement PN;
		public WebElement Write_PhoneNumber(){
			return PN;
		}
		
		
		//Write FaxNumber
		
		@FindBy(how=How.XPATH, using="//input[@name='location[fax]']")
		@CacheLookup
		WebElement FN;
		public WebElement Write_FaxNumber(){
			return FN;
		}
		
		//Write Notes
		@FindBy(how=How.XPATH, using="//textarea[@name='location[notes]']")
		@CacheLookup
		WebElement Notes;
		public WebElement Write_Notes(){
			return Notes;
		}
		
		//click Save button
		
		@FindBy(how=How.XPATH, using="//input[@name='btnSave']")
		@CacheLookup
		WebElement Save;
		public WebElement Click_Save(){
			return Save;
		}
		
		//confirmation
	
		//Error message
				@FindBy(how=How.XPATH, using ="//form[@id=\"frmLocation\"]/fieldset/ol/li[1]/span")
				@CacheLookup
				WebElement cl;
				public WebElement Errorlist() {
					
					String ActualError=cl.getText();
					System.out.println("ActualError is :" + ActualError );
					String ExpectedError= "Required";
					/*if (ActualError.equals(ExpectedError)) {
						System.out.println("your test is Fail As Expected");
						driver.close();
					}
					else {
						driver.quit();
					}
					*/
				Assert.assertEquals( ActualError,ExpectedError );
			
					
					return cl;
				}
				
				
				





}//end class

