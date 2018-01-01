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

public class AssignLeavePF {
	WebDriver driver;
	//create constractor
		public AssignLeavePF(WebDriver driver) {
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
			//EmployeeName
			@FindBy(how=How.XPATH, using ="//*[@id='assignleave_txtEmployee_empName']")
			@CacheLookup
			WebElement em;
			public WebElement Write_EmployeName() {
				return em;
			}
			
			//Leave type
			//Select country
			
			public void Select_LeaveType() {
				Select c=new Select(driver.findElement(By.xpath("//select[@id='assignleave_txtLeaveType']")));
				c.selectByVisibleText("FMLA US");
			}
			
			//from
			@FindBy(how=How.XPATH, using ="//input[@name='assignleave[txtFromDate]']")
			@CacheLookup
			WebElement Fd;
			public WebElement FromDate() {
				Fd.clear();
				Fd.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[5]/a")).click();
				return Fd;
			}
			//to
			@FindBy(how=How.XPATH, using ="//*[@id='assignleave_txtToDate']")
			@CacheLookup
			WebElement t;
			public WebElement ToDate() {
				t.clear();
				t.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[5]/a")).click();
				return t;
			}

//click on Leave link
@FindBy(how=How.XPATH, using ="//*[@id='menu_leave_viewLeaveModule']/b")
@CacheLookup
WebElement l;
public WebElement clickOnLeaveLink() {
	return l;
}
	
//click on AssignLink
@FindBy(how=How.XPATH, using ="//*[@id='menu_leave_assignLeave']")
@CacheLookup
WebElement al;
public WebElement clickOnAssignLeave() {
	return al;
}

//click on Assign Button
@FindBy(how=How.XPATH, using ="//*[@id='assignBtn']")
@CacheLookup
WebElement a;
public WebElement ClickOnAssignButton() {
	return a;
}
//click on OK Button
@FindBy(how=How.XPATH, using ="//*[@id='confirmOkButton']")
@CacheLookup
WebElement c;
public WebElement ClickOnOK() {
	return c;
}
//Error message
@FindBy(how=How.XPATH, using ="//*[@id='welcome']")
@CacheLookup
WebElement cl;
public WebElement Errorlist() {
	
	String ActualError=cl.getText();
	System.out.println("ActualError is :" + ActualError );
	String ExpectedError= "Welcome Admin";
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
