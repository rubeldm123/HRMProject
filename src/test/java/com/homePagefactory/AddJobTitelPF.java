package com.homePagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddJobTitelPF {
WebDriver driver;//diclar driver
	
	//create constractor
	public AddJobTitelPF(WebDriver driver) {
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
		//Mouse hover from Admin-->Organization-->location-->click 
		public void MouseHoverToAdmin () {
			//WebElement Admin= driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b"));
			WebElement Job= driver.findElement(By.linkText("Job"));
			WebElement JobTitel= driver.findElement(By.xpath("//*[@id='menu_admin_viewJobTitleList']"));
			
			Actions act=new Actions(driver);
			//act.moveToElement(Admin).perform();
		
			act.moveToElement(Job).perform();
			act.moveToElement(JobTitel).perform();
			act.click().build().perform();
			
			
			
		}

		//click on Add button
		@FindBy(how=How.XPATH, using ="//input[@name='btnAdd']")
		@CacheLookup
		WebElement ADDBtn;
		public WebElement clickADDbutton() {
			return ADDBtn;
		}	
		
		//Write Job titel
	
				@FindBy(how=How.XPATH, using ="//*[@id=\"jobTitle_jobTitle\"]")
				@CacheLookup
				WebElement LN;
				public WebElement WriteJobTitel() {
					return LN;
				}	
				
				//Write Description
				
				@FindBy(how=How.XPATH, using ="//*[@id=\"jobTitle_jobDescription\"]")
				@CacheLookup
				WebElement D;
				public WebElement WriteDiscription() {
					return D;
				}	
				
				
				//jobSpecification
				@FindBy(how=How.XPATH, using ="//*[@id=\"jobTitle_jobSpec\"]")
				@CacheLookup
				WebElement r;
				public WebElement ChooseFIleUpLoad() {
					r.sendKeys("C:\\Users\\rubeldm\\Desktop\\OrangeHRMSteps\\photoFromRubel.txt");
					return r;
				}	
				
//Write Note
				
				@FindBy(how=How.XPATH, using ="//*[@id=\"jobTitle_note\"]")
				@CacheLookup
				WebElement n;
				public WebElement WriteNote() {
					return n;
				}	
			
				
						
		
		

//Save Button
@FindBy(how=How.XPATH, using ="//input[@id='btnSave']")
@CacheLookup
WebElement Save;
public WebElement ClickSave() {
	return Save;
}

//Error message
@FindBy(how=How.XPATH, using ="//*[@id='frmSavejobTitle']/fieldset/ol/li[1]/span")
@CacheLookup
WebElement cl;
public WebElement Errorlist() {
	
	String ActualError=cl.getText();
	System.out.println("ActualError is :" + ActualError );
	String ExpectedError= "Requires";
	if (ActualError.equals(ExpectedError)) {
		System.out.println("your test is Fail As Expected");
		driver.close();
	}
	else {
		driver.quit();
	}
	
Assert.assertEquals( ActualError,ExpectedError );

	
	return cl;
}

}//End Class
