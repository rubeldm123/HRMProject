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

public class AddVacancyFactor {
	
	WebDriver driver;

	//create constractor
	public  AddVacancyFactor(WebDriver driver) {
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
			
			@FindBy(how=How.LINK_TEXT, using ="Recruitment")
			@CacheLookup
			WebElement recruitment;
			public WebElement click_Recruitment() {
				return recruitment;
			}
			@FindBy(how=How.LINK_TEXT, using ="Vacancies")
			@CacheLookup
			WebElement vacancies;
			public WebElement click_vacancies() {
				return vacancies;
			}
			
			@FindBy(how=How.XPATH, using ="//input[@name='btnAdd']")
			@CacheLookup
			WebElement ADDBtn;
			public WebElement clickOnAddbottn() {
				return ADDBtn;
			}	
			
			//Select Job titel
			
			public void Select_JobTitel() {
			Select v=new Select(driver.findElement(By.xpath("//select[@name='addJobVacancy[jobTitle]']")));
			v.selectByVisibleText("IT Manager");
			
			}
			//VacancyName
			@FindBy(how=How.XPATH, using ="//input[@name='addJobVacancy[name]']")
			@CacheLookup
			WebElement vacancyname;
			public WebElement Write_VacancyName() {
				return vacancyname;
			}	
			
			//Hiring Manager
			@FindBy(how=How.XPATH, using ="//input[@id='addJobVacancy_hiringManager']")
			@CacheLookup
			WebElement hm;
			public WebElement Write_HiarinManagerName() {
				return hm;
				
			}
			
			//numberOfPosition
				@FindBy(how=How.XPATH, using ="//input[@id='addJobVacancy_noOfPositions']")
				@CacheLookup
				WebElement NP;
				public WebElement Number_Of_Position() {
					return NP;
					
				}
				
				//Description
						@FindBy(how=How.XPATH, using ="//textarea[@id='addJobVacancy_description']")
						@CacheLookup
						WebElement DC;
						public WebElement Write_Description() {
							return DC;
							
						}
						
						
						//click on Active 
						
						public void clickBox() {
							
							driver.findElement(By.xpath("//select[@name='addJobVacancy[jobTitle]']"));
							
							if ( !driver.findElement(By.xpath("//select[@name='addJobVacancy[jobTitle]']")).isSelected() )
							{
							     driver.findElement(By.xpath("//select[@name='addJobVacancy[jobTitle]']")).click();
							}
							}//end of clickBox
						
						//clickOnSave
						@FindBy(how=How.XPATH, using ="//input[@id='btnSave']")
						@CacheLookup
						WebElement Save;
						public WebElement ClickSave() {
							return Save;
						}
						
						//Error List
						@FindBy(how=How.XPATH, using ="//*[@id=\"frmAddJobVacancy\"]/fieldset/ol/li[3]/span")
						@CacheLookup
						WebElement el;
						public WebElement ErrorList() {
							
							String Act=el.getText();
							String Exp= "Invalid";
							if (Act.equals(Exp)) {
								System.out.println("pass test");
							}
							else {
								System.out.println("Your Test Fail");
								driver.quit();
							}
								Assert.assertEquals(Act, Exp);
							
						Assert.assertEquals(Act,Exp);
						
							
							return el;
						}

						/*public void  error() {
							WebElement el = driver.findElement(By.xpath("//*[@id=\"frmAddJobVacancy\"]/fieldset/ol/li[3]/span")); 
							String act= el.getText();
							String exp= "Invalid";
							
						
							SoftAssert er	=new SoftAssert() ;
							er.assertEquals(act, exp);
							
							er.assertAll();}
							*/
								
									
							
						
					
	

}//end class
